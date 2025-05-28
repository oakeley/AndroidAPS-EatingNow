package app.aaps.ui.dialogs

import app.aaps.ui.databinding.DialogEnTemptargetBinding
import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import app.aaps.core.interfaces.configuration.Constants
import app.aaps.core.interfaces.constraints.ConstraintsChecker
import app.aaps.core.interfaces.db.GlucoseUnit
import app.aaps.core.interfaces.logging.LTag
import app.aaps.core.interfaces.logging.UserEntryLogger
import app.aaps.core.interfaces.plugin.ActivePlugin
import app.aaps.core.interfaces.utils.DecimalFormatter
import app.aaps.core.interfaces.profile.DefaultValueHelper
import app.aaps.core.interfaces.profile.ProfileFunction
import app.aaps.core.interfaces.profile.ProfileUtil
import app.aaps.core.interfaces.protection.ProtectionCheck
import app.aaps.core.interfaces.resources.ResourceHelper
import app.aaps.core.interfaces.utils.HardLimits
import app.aaps.core.interfaces.utils.SafeParse
import app.aaps.core.main.constraints.ConstraintObject
import app.aaps.core.main.utils.extensions.formatColor
import app.aaps.core.ui.dialogs.OKDialog
import app.aaps.core.ui.toast.ToastUtils
import app.aaps.core.utils.HtmlHelper
import app.aaps.database.ValueWrapper
import app.aaps.database.entities.TemporaryTarget
import app.aaps.database.entities.UserEntry
import app.aaps.database.entities.ValueWithUnit
import app.aaps.database.impl.AppRepository
import app.aaps.database.impl.transactions.CancelCurrentTemporaryTargetIfAnyTransaction
import app.aaps.database.impl.transactions.InsertAndCancelCurrentTemporaryTargetTransaction
import app.aaps.ui.R
import app.aaps.ui.databinding.DialogInsulinBinding
import app.aaps.ui.databinding.DialogTemptargetBinding
import com.google.common.base.Joiner
import com.google.common.collect.Lists
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.kotlin.plusAssign
import java.math.RoundingMode
import java.text.DecimalFormat
import java.util.LinkedList
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import kotlin.math.abs

class ENTempTargetDialog : DialogFragmentWithDate() {

    @Inject lateinit var constraintChecker: ConstraintsChecker
    @Inject lateinit var rh: ResourceHelper
    @Inject lateinit var profileFunction: ProfileFunction
    @Inject lateinit var profileUtil: ProfileUtil
    @Inject lateinit var defaultValueHelper: DefaultValueHelper
    @Inject lateinit var uel: UserEntryLogger
    @Inject lateinit var repository: AppRepository
    @Inject lateinit var ctx: Context
    @Inject lateinit var protectionCheck: ProtectionCheck
    @Inject lateinit var decimalFormatter: DecimalFormatter
    @Inject lateinit var activePlugin: ActivePlugin
    @Inject lateinit var hardLimits: HardLimits

    private lateinit var reasonList: List<String>

    private var queryingProtection = false
    private val disposable = CompositeDisposable()
    private var _binding: DialogEnTemptargetBinding? = null

    // This property is only valid between onCreateView and onDestroyView.
    private val binding get() = _binding!!

    private val textWatcher: TextWatcher = object : TextWatcher {
        override fun afterTextChanged(s: Editable) {
            _binding?.let {
                // validateInputs()
            }
        }

        override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
        override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
    }

    // private fun validateInputs() {
    //     val maxInsulin = constraintChecker.getMaxBolusAllowed().value()
    //     if (abs(binding.time.value.toInt()) > 12 * 60) {
    //         binding.time.value = 0.0
    //         ToastUtils.warnToast(context, app.aaps.core.ui.R.string.constraint_applied)
    //     }
    //     if (binding.amount.value > maxInsulin) {
    //         binding.amount.value = 0.0
    //         ToastUtils.warnToast(context, R.string.bolus_constraint_applied)
    //     }
    // }

    override fun onSaveInstanceState(savedInstanceState: Bundle) {
        super.onSaveInstanceState(savedInstanceState)
        savedInstanceState.putDouble("duration", binding.duration.value)
        savedInstanceState.putDouble("tempTarget", binding.temptarget.value)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        onCreateViewGeneral()
        _binding = DialogEnTemptargetBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val units = profileUtil.units
        binding.units.text = if (units == GlucoseUnit.MMOL) rh.gs(app.aaps.core.ui.R.string.mmol) else rh.gs(app.aaps.core.ui.R.string.mgdl)

        // set the Eating Now defaults
        // val enTT = profileUtil.convertToMgdl(profileFunction.getProfile()!!.getTargetMgdl(), units)
        //val enTT = profile.toCurrentUnits(units,profileFunction.getProfile()!!.getTargetMgdl())
        val enTT = profileUtil.valueInCurrentUnitsDetect(profileFunction.getProfile()!!.getTargetMgdl())

        binding.duration.setParams(
            savedInstanceState?.getDouble("duration")
            ?: 0.0, 0.0, Constants.MAX_ENTT_DURATION, 1.0, DecimalFormat("0"), false, binding.okcancel.ok)

        if (profileFunction.getUnits() == GlucoseUnit.MMOL)
            binding.temptarget.setParams(
                savedInstanceState?.getDouble("tempTarget")
                    ?: enTT,
                Constants.MIN_TT_MMOL, enTT, 0.1, DecimalFormat("0.0"), false, binding.okcancel.ok)
        else
            binding.temptarget.setParams(
                savedInstanceState?.getDouble("tempTarget")
                    ?: enTT,
                Constants.MIN_TT_MGDL, Constants.MAX_TT_MGDL, 1.0, DecimalFormat("0"), false, binding.okcancel.ok)

        //ENW-IOB amount default
        val maxIOB = hardLimits.maxIobSMB()
        binding.enwIob.setParams(
            savedInstanceState?.getDouble("enw_iob")
                ?: defaultValueHelper.determineEatingNowIOB(), 0.0, maxIOB, activePlugin.activePump.pumpDescription.bolusStep, decimalFormatter.pumpSupportedBolusFormat(activePlugin.activePump.pumpDescription.bolusStep), false, binding
                .okcancel.ok, textWatcher
        )

        //prebolus amount
        // val maxInsulin = constraintChecker.getMaxBolusAllowed().value()
        val maxInsulin = Constants.MAX_EN_PREBOLUS
        binding.amount.setParams(
            savedInstanceState?.getDouble("amount")
                ?: 0.0, 0.0, maxInsulin, activePlugin.activePump.pumpDescription.bolusStep, decimalFormatter.pumpSupportedBolusFormat(activePlugin.activePump.pumpDescription.bolusStep), false, binding
                .okcancel.ok, textWatcher
        )

        // temp target
        context?.let { context ->
            if (repository.getTemporaryTargetActiveAt(dateUtil.now()).blockingGet() is ValueWrapper.Existing) {
                binding.targetCancel.visibility = View.VISIBLE
                binding.prebolus.visibility = View.GONE // no prebolus checkbox when cancelling TT
                binding.amount.visibility = View.GONE // no prebolus amount when cancelling TT
            } else
                binding.targetCancel.visibility = View.GONE

            reasonList = Lists.newArrayList(
                rh.gs(app.aaps.core.ui.R.string.eatingnow),
                rh.gs(app.aaps.core.ui.R.string.eatingnow_prebolus)
            )
            binding.reasonList.setAdapter(ArrayAdapter(context, app.aaps.core.ui.R.layout.spinner_centered, reasonList))

            binding.targetCancel.setOnClickListener { binding.duration.value = 0.0; shortClick(it) }
            binding.durationLabel.labelFor = binding.duration.editTextId
            binding.temptargetLabel.labelFor = binding.temptarget.editTextId
        }

        // reset to Eating Now defaults
        binding.duration.value = defaultValueHelper.determineEatingNowTTDuration().toDouble()
        binding.reasonList.setText(rh.gs(app.aaps.core.ui.R.string.eatingnow), false)
        // binding.prebolus.isChecked = false

        // when the prebolus button is pressed
        binding.prebolus.setOnClickListener {
            if (binding.prebolus.isChecked) {
                binding.reasonList.setText(rh.gs(app.aaps.core.ui.R.string.eatingnow_prebolus), false)
                binding.amount.visibility = View.VISIBLE // show prebolus amount when using PB is checked
                binding.amount.value = defaultValueHelper.determineEatingNowPreBolus()
            }
            else {
                binding.reasonList.setText(rh.gs(app.aaps.core.ui.R.string.eatingnow), false)
                binding.amount.visibility = View.GONE // hide prebolus amount when using PB is unchecked
                binding.amount.value = 0.0
            }
        }
    }

    private fun shortClick(v: View) {
        v.performLongClick()
        if (submit()) dismiss()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        disposable.clear()
        _binding = null
    }

    override fun submit(): Boolean {
        if (_binding == null) return false
        val pumpDescription = activePlugin.activePump.pumpDescription
        val insulin = SafeParse.stringToDouble(binding.amount.text)
        val insulinAfterConstraints = constraintChecker.applyBolusConstraints(ConstraintObject(insulin, aapsLogger)).value()
        val actions: LinkedList<String> = LinkedList()
        var reason = binding.reasonList.text.toString()
        val unitResId = if (profileFunction.getUnits() == GlucoseUnit.MGDL) app.aaps.core.ui.R.string.mgdl else app.aaps.core.ui.R.string.mmol
        val target = binding.temptarget.value
        val duration = binding.duration.value.toInt()
        val prebolus = binding.amount.value.toBigDecimal().setScale(2, RoundingMode.HALF_UP)
        val enwiob = binding.enwIob.value.toBigDecimal().setScale(2, RoundingMode.HALF_UP)
        sp.putDouble("ENdb_PreBolusUnits",prebolus.toDouble()) // add the prebolus amount for DetermineBasalAdapterENJS.kt
        sp.putDouble("ENdb_ENWIOBUnits",enwiob.toDouble()) // add the ENWIOB amount for DetermineBasalAdapterENJS.kt
        if (target != 0.0 && duration != 0) {
            // actions.add(rh.gs(app.aaps.core.ui.R.string.reason) + ": " + reason)
            actions.add(rh.gs(app.aaps.core.ui.R.string.target_label) + ": " + profileUtil.stringInCurrentUnitsDetect(target) + " " + rh.gs(unitResId))
            actions.add(rh.gs(app.aaps.core.ui.R.string.duration) + ": " + rh.gs(app.aaps.core.ui.R.string.format_mins, duration))
            actions.add("Pre-Bolus: " + decimalFormatter.toPumpSupportedBolus(insulinAfterConstraints, activePlugin.activePump.pumpDescription.bolusStep).formatColor(context, rh, app.aaps.core.ui.R.attr.bolusColor))
            actions.add("ENW-IOB Limit: " + binding.enwIob.text)
        } else {
            actions.add(rh.gs(app.aaps.core.ui.R.string.stoptemptarget))
            reason = rh.gs(app.aaps.core.ui.R.string.stoptemptarget)
        }
        if (eventTimeChanged)
            actions.add(rh.gs(app.aaps.core.ui.R.string.time) + ": " + dateUtil.dateAndTimeString(eventTime))

        activity?.let { activity ->
            OKDialog.showConfirmation(activity, reason, HtmlHelper.fromHtml(Joiner.on("<br/>").join(actions)), {
                val units = profileFunction.getUnits()
                when (reason) {
                    rh.gs(app.aaps.core.ui.R.string.eatingnow)     -> uel.log(
                        UserEntry.Action.TT, UserEntry.Sources.TTDialog, ValueWithUnit.Timestamp(eventTime).takeIf { eventTimeChanged }, ValueWithUnit.TherapyEventTTReason(
                            TemporaryTarget.Reason.EATING_NOW
                        ), ValueWithUnit.fromGlucoseUnit(target, units.asText), ValueWithUnit.Minute(duration)
                    )

                    rh.gs(app.aaps.core.ui.R.string.eatingnow_prebolus)     -> uel.log(
                        UserEntry.Action.TT, UserEntry.Sources.TTDialog, ValueWithUnit.Timestamp(eventTime).takeIf { eventTimeChanged }, ValueWithUnit.TherapyEventTTReason(
                            TemporaryTarget.Reason.EATING_NOW_PB
                        ), ValueWithUnit.fromGlucoseUnit(target, units.asText), ValueWithUnit.Minute(duration)
                    )

                    rh.gs(app.aaps.core.ui.R.string.stopeatingnow) -> uel.log(UserEntry.Action.CANCEL_TT, UserEntry.Sources.TTDialog, ValueWithUnit.Timestamp(eventTime).takeIf { eventTimeChanged })
                }
                if (target == 0.0 || duration == 0) {
                    disposable += repository.runTransactionForResult(CancelCurrentTemporaryTargetIfAnyTransaction(eventTime))
                        .subscribe({ result ->
                                       result.updated.forEach { aapsLogger.debug(LTag.DATABASE, "Updated temp target $it") }
                                   }, {
                                       aapsLogger.error(LTag.DATABASE, "Error while saving temporary target", it)
                                   })
                } else {
                    disposable += repository.runTransactionForResult(
                        InsertAndCancelCurrentTemporaryTargetTransaction(
                            timestamp = eventTime,
                            duration = TimeUnit.MINUTES.toMillis(duration.toLong()),
                            reason = when (reason) {
                                rh.gs(app.aaps.core.ui.R.string.eatingnow) -> TemporaryTarget.Reason.EATING_NOW
                                rh.gs(app.aaps.core.ui.R.string.eatingnow_prebolus) -> TemporaryTarget.Reason.EATING_NOW_PB
                                else                                                 -> TemporaryTarget.Reason.CUSTOM
                            },
                            lowTarget = profileUtil.convertToMgdl(target, profileFunction.getUnits()),
                            highTarget = profileUtil.convertToMgdl(target, profileFunction.getUnits())
                        )
                    ).subscribe({ result ->
                                    result.inserted.forEach { aapsLogger.debug(LTag.DATABASE, "Inserted temp target $it") }
                                    result.updated.forEach { aapsLogger.debug(LTag.DATABASE, "Updated temp target $it") }
                                }, {
                                    aapsLogger.error(LTag.DATABASE, "Error while saving temporary target", it)
                                })
                }

                if (duration == 10) sp.putBoolean(app.aaps.core.utils.R.string.key_objectiveusetemptarget, true)
            })
        }
        return true
    }

    override fun onResume() {
        super.onResume()
        if (!queryingProtection) {
            queryingProtection = true
            activity?.let { activity ->
                val cancelFail = {
                    queryingProtection = false
                    aapsLogger.debug(LTag.APS, "Dialog canceled on resume protection: ${this.javaClass.simpleName}")
                    ToastUtils.warnToast(ctx, R.string.dialog_canceled)
                    dismiss()
                }
                protectionCheck.queryProtection(activity, ProtectionCheck.Protection.BOLUS, { queryingProtection = false }, cancelFail, cancelFail)
            }
        }
    }
}