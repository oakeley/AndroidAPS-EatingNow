// Modified for Eating Now
package app.aaps.plugins.automation.actions

import app.aaps.core.interfaces.logging.LTag
import app.aaps.core.interfaces.logging.UserEntryLogger
import app.aaps.core.interfaces.pump.PumpEnactResult
import app.aaps.core.interfaces.queue.Callback
import app.aaps.core.interfaces.queue.CommandQueue
import app.aaps.core.interfaces.ui.UiInteraction
import app.aaps.core.interfaces.utils.DateUtil
import app.aaps.database.entities.UserEntry
import app.aaps.database.entities.UserEntry.Sources
import app.aaps.database.impl.AppRepository
import app.aaps.database.impl.transactions.CancelCurrentTemporaryTargetIfAnyTransaction
import app.aaps.plugins.automation.R
import dagger.android.HasAndroidInjector
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.kotlin.plusAssign
import javax.inject.Inject

class ActionBasalCancel(injector: HasAndroidInjector) : Action(injector) {

    @Inject lateinit var repository: AppRepository
    @Inject lateinit var dateUtil: DateUtil
    @Inject lateinit var uel: UserEntryLogger
    @Inject lateinit var commandQueue: CommandQueue
    @Inject lateinit var uiInteraction: UiInteraction

    private val disposable = CompositeDisposable()

    override fun friendlyName(): Int = app.aaps.core.ui.R.string.cancel_temp
    override fun shortDescription(): String = rh.gs(app.aaps.core.ui.R.string.cancel_temp)
    override fun icon(): Int = app.aaps.core.main.R.drawable.ic_cp_basal_no_tbr

    override fun doAction(callback: Callback) {
        commandQueue.cancelTempBasal(true, object : Callback() {
            override fun run() {
                if (!result.success) {
                    uiInteraction.runAlarm(result.comment, rh.gs(app.aaps.core.ui.R.string.temp_basal_delivery_error), app.aaps.core.ui.R.raw.boluserror)
                }
            }
        })
    }
    override fun isValid(): Boolean = true
}