# Eating Now Integration Report

Generated: 2025-05-24 12:22:12.484926

## Files Added:
- app/src/main/kotlin/app/aaps/MainApp.kt
- app/src/main/kotlin/app/aaps/activities/MyPreferenceFragment.kt
- app/src/main/kotlin/app/aaps/di/PluginsListModule.kt
- app/src/main/kotlin/app/aaps/implementations/ConfigImpl.kt
- app/src/main/kotlin/app/aaps/implementations/UiInteractionImpl.kt
- buildSrc/src/main/kotlin/Versions.kt
- core/interfaces/src/main/kotlin/app/aaps/core/interfaces/aps/ENDefaults.kt
- core/interfaces/src/main/kotlin/app/aaps/core/interfaces/aps/SMBDefaults.kt
- core/interfaces/src/main/kotlin/app/aaps/core/interfaces/configuration/Constants.kt
- core/interfaces/src/main/kotlin/app/aaps/core/interfaces/profile/DefaultValueHelper.kt
- core/interfaces/src/main/kotlin/app/aaps/core/interfaces/stats/TIR.kt
- core/interfaces/src/main/kotlin/app/aaps/core/interfaces/stats/TirCalculator.kt
- core/interfaces/src/main/kotlin/app/aaps/core/interfaces/ui/UiInteraction.kt
- core/nssdk/src/main/kotlin/app/aaps/core/nssdk/remotemodel/RemoteTreatment.kt
- core/nssdk/src/main/kotlin/app/aaps/core/nssdk/localmodel/treatment/NSTemporaryTarget.kt
- database/entities/src/main/kotlin/app/aaps/database/entities/TemporaryTarget.kt
- database/impl/src/main/java/app/aaps/database/impl/AppRepository.kt
- database/impl/src/main/java/app/aaps/database/impl/daos/BolusDao.kt
- database/impl/src/main/java/app/aaps/database/impl/daos/CarbsDao.kt
- database/impl/src/main/java/app/aaps/database/impl/daos/TemporaryTargetDao.kt
- implementation/src/main/kotlin/app/aaps/implementation/profile/DefaultValueHelperImpl.kt
- implementation/src/main/kotlin/app/aaps/implementation/stats/TddCalculatorImpl.kt
- implementation/src/main/kotlin/app/aaps/implementation/stats/TirCalculatorImpl.kt
- implementation/src/main/kotlin/app/aaps/implementation/stats/TirImpl.kt
- implementation/src/main/kotlin/app/aaps/implementation/utils/HardLimitsImpl.kt
- implementation/src/main/kotlin/app/aaps/implementation/utils/TranslatorImpl.kt
- plugins/aps/src/main/kotlin/app/aaps/plugins/aps/EN/DetermineBasalAdapterENJS.kt
- plugins/aps/src/main/kotlin/app/aaps/plugins/aps/EN/ENPlugin.kt
- plugins/aps/src/main/kotlin/app/aaps/plugins/aps/di/AlgModule.kt
- plugins/aps/src/main/kotlin/app/aaps/plugins/aps/di/ApsModule.kt
- plugins/aps/src/main/kotlin/app/aaps/plugins/aps/openAPSSMBDynamicISF/DetermineBasalAdapterSMBDynamicISFJS.kt
- plugins/automation/src/main/kotlin/app/aaps/plugins/automation/AutomationPlugin.kt
- plugins/automation/src/main/kotlin/app/aaps/plugins/automation/actions/Action.kt
- plugins/automation/src/main/kotlin/app/aaps/plugins/automation/actions/ActionBasalCancel.kt
- plugins/automation/src/main/kotlin/app/aaps/plugins/automation/actions/ActionStartENTempTarget.kt
- plugins/automation/src/main/kotlin/app/aaps/plugins/automation/di/AutomationModule.kt
- plugins/constraints/src/main/kotlin/app/aaps/plugins/constraints/dstHelper/DstHelperPlugin.kt
- plugins/constraints/src/main/kotlin/app/aaps/plugins/constraints/safety/SafetyPlugin.kt
- plugins/constraints/src/main/kotlin/app/aaps/plugins/constraints/versionChecker/VersionCheckerUtilsImpl.kt
- plugins/main/src/main/kotlin/app/aaps/plugins/main/general/overview/OverviewFragment.kt
- plugins/main/src/main/kotlin/app/aaps/plugins/main/general/smsCommunicator/SmsCommunicatorPlugin.kt
- pump/combo/src/main/java/info/nightscout/pump/combo/ComboPlugin.java
- pump/combo/src/main/java/info/nightscout/pump/combo/ruffyscripter/RuffyCommands.java
- pump/combo/src/main/java/info/nightscout/pump/combo/ruffyscripter/RuffyScripter.java
- pump/combo/src/main/java/info/nightscout/pump/combo/ruffyscripter/commands/ReadQuickInfoCommand.java
- pump/combo/src/main/java/org/monkey/d/ruffy/ruffy/driver/display/MenuAttribute.java
- pump/combo/src/main/java/org/monkey/d/ruffy/ruffy/driver/display/MenuType.java
- pump/combov2/comboctl/src/commonMain/kotlin/info/nightscout/comboctl/base/ApplicationLayer.kt
- pump/combov2/comboctl/src/commonMain/kotlin/info/nightscout/comboctl/base/PumpIO.kt
- pump/combov2/comboctl/src/commonMain/kotlin/info/nightscout/comboctl/main/Pump.kt
- pump/combov2/src/main/kotlin/info/nightscout/pump/combov2/ComboV2Fragment.kt
- pump/combov2/src/main/kotlin/info/nightscout/pump/combov2/ComboV2Plugin.kt
- pump/eopatch/src/main/java/info/nightscout/androidaps/plugins/pump/eopatch/EopatchPumpPlugin.kt
- pump/eopatch/src/main/java/info/nightscout/androidaps/plugins/pump/eopatch/ble/IPatchManager.java
- pump/eopatch/src/main/java/info/nightscout/androidaps/plugins/pump/eopatch/ble/PatchManager.java
- pump/eopatch/src/main/java/info/nightscout/androidaps/plugins/pump/eopatch/ble/PatchManagerImpl.java
- pump/eopatch/src/main/java/info/nightscout/androidaps/plugins/pump/eopatch/ble/task/BolusTask.java
- pump/eopatch/src/main/java/info/nightscout/androidaps/plugins/pump/eopatch/ble/task/StartQuickBolusTask.java
- pump/eopatch/src/main/java/info/nightscout/androidaps/plugins/pump/eopatch/ble/task/TaskFunc.java
- pump/medtronic/src/main/java/info/nightscout/androidaps/plugins/pump/medtronic/data/MedtronicHistoryData.kt
- pump/omnipod-dash/src/main/java/info/nightscout/androidaps/plugins/pump/omnipod/dash/driver/pod/response/AlarmStatusResponse.kt
- pump/omnipod-eros/src/main/java/info/nightscout/androidaps/plugins/pump/omnipod/eros/manager/AapsOmnipodErosManager.java
- pump/omnipod-eros/src/main/java/info/nightscout/androidaps/plugins/pump/omnipod/eros/driver/definition/ErrorEventInfo.java
- pump/omnipod-eros/src/main/java/info/nightscout/androidaps/plugins/pump/omnipod/eros/driver/definition/FaultEventCode.java
- ui/src/main/kotlin/app/aaps/ui/di/UiModule.kt
- ui/src/main/kotlin/app/aaps/ui/dialogs/ENTempTargetDialog.kt
- core/ui/src/main/res/values/attrs.xml
- core/utils/src/main/res/values/keys.xml
- plugins/aps/src/main/res/xml/pref_eatingnow.xml
- plugins/constraints/src/main/res/layout/objectives_fragment.xml
- plugins/main/src/main/res/layout/overview_buttons_layout.xml
- core/ui/src/main/res/values-cs-rCZ/strings.xml
- core/ui/src/main/res/values-pl-rPL/strings.xml
- core/ui/src/main/res/values-sk-rSK/strings.xml
- core/ui/src/main/res/values/strings.xml
- plugins/aps/src/main/res/values/strings.xml
- plugins/automation/src/main/res/values/strings.xml
- plugins/main/src/main/res/values-cs-rCZ/strings.xml
- plugins/main/src/main/res/values-pl-rPL/strings.xml
- plugins/main/src/main/res/values-sk-rSK/strings.xml
- plugins/main/src/main/res/values/strings.xml

## Dependencies Identified:
- androidx.preference.PreferenceManager
- android.bluetooth.BluetoothDevice
- app.aaps.ui.dialogs.BolusProgressDialog
- kotlinx.coroutines.async
- app.aaps.database.entities.UserEntry
- kotlinx.coroutines.channels.BufferOverflow
- app.aaps.plugins.source.IntelligoPlugin
- app.aaps.plugins.aps.openAPSSMB.DetermineBasalResultSMB
- androidx.annotation.StringRes
- androidx.room.Embedded

## Version Conflicts Resolved:


## Next Steps:
1. Review copied files for compatibility
2. Test compilation with new dependencies
3. Verify bolus calculation integration
4. Update any remaining UI references

## Risk Assessment: low
