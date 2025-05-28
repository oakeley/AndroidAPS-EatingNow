# Improved AAPS EatingNow Merge Fix Report

**Generated**: 2025-05-28 20:51:35
**Strategy**: Conservative fixes with Meerkat compatibility

## Source Directories

- **EatingNow Source**: `/home/edward/ai/source/AAPS-EatingNow`
- **Main AAPS Source**: `/home/edward/ai/source/AndroidAPS`
- **Fixed Base**: `/home/edward/ai/source/AAPS-EatingNow_fixed`
- **Target Output**: `/home/edward/ai/source/AAPS-EatingNow_improved`

## Summary

- **Errors**: 0
- **Warnings**: 0
- **Modifications**: 44
- **Build Files Modified**: 44
- **Resource Files Modified**: 1023
- **Missing Strings Addressed**: 123

## Conservative Approach Highlights

This improved script takes a much more conservative approach:

1. **Minimal JVM Changes**: Only updates when absolutely necessary
2. **Meerkat Compatibility**: Designed to work with Android Studio Meerkat defaults
3. **Backup Strategy**: Creates backups before any modifications
4. **Better Error Handling**: Continues processing even if individual files fail
5. **Detailed Logging**: Comprehensive logging for troubleshooting

## Build Configuration Strategy

- **Kotlin Version**: Updated to `2.1.20` only when needed
- **Gradle Version**: Updated to `8.11.1` only if older
- **JVM Target**: Uses conservative defaults (Java 8) unless project requires higher
- **Toolchain**: Removes problematic explicit toolchain configurations
- **Compatibility**: Designed to let Meerkat/AS handle JVM selection

## Modifications Made

1. Modified workflow/build.gradle.kts
2. Modified ui/build.gradle.kts
3. Modified implementation/build.gradle.kts
4. Modified wear/build.gradle.kts
5. Modified app/build.gradle.kts
6. Modified database/impl/build.gradle.kts
7. Modified database/persistence/build.gradle.kts
8. Modified plugins/automation/build.gradle.kts
9. Modified plugins/sync/build.gradle.kts
10. Modified plugins/insulin/build.gradle.kts
11. Modified plugins/constraints/build.gradle.kts
12. Modified plugins/smoothing/build.gradle.kts
13. Modified plugins/configuration/build.gradle.kts
14. Modified plugins/sensitivity/build.gradle.kts
15. Modified plugins/source/build.gradle.kts
16. Modified plugins/aps/build.gradle.kts
17. Modified plugins/main/build.gradle.kts
18. Modified shared/impl/build.gradle.kts
19. Modified shared/tests/build.gradle.kts
20. Modified core/objects/build.gradle.kts
21. Modified core/ui/build.gradle.kts
22. Modified core/interfaces/build.gradle.kts
23. Modified core/graph/build.gradle.kts
24. Modified core/graphview/build.gradle.kts
25. Modified core/nssdk/build.gradle.kts
26. Modified core/validators/build.gradle.kts
27. Modified core/utils/build.gradle.kts
28. Modified pump/danars/build.gradle.kts
29. Modified pump/medtronic/build.gradle.kts
30. Modified pump/pump-common/build.gradle.kts
31. Modified pump/equil/build.gradle.kts
32. Modified pump/rileylink/build.gradle.kts
33. Modified pump/virtual/build.gradle.kts
34. Modified pump/omnipod-dash/build.gradle.kts
35. Modified pump/insight/build.gradle.kts
36. Modified pump/omnipod-eros/build.gradle.kts
37. Modified pump/omnipod-common/build.gradle.kts
38. Modified pump/danar/build.gradle.kts
39. Modified pump/eopatch/build.gradle.kts
40. Modified pump/diaconn/build.gradle.kts
41. Modified pump/dana/build.gradle.kts
42. Modified pump/combov2/build.gradle.kts
43. Modified pump/medtrum/build.gradle.kts
44. Modified pump/combov2/comboctl/build.gradle.kts

## Build Files Modified

- `workflow/build.gradle.kts`
- `ui/build.gradle.kts`
- `implementation/build.gradle.kts`
- `wear/build.gradle.kts`
- `app/build.gradle.kts`
- `database/impl/build.gradle.kts`
- `database/persistence/build.gradle.kts`
- `plugins/automation/build.gradle.kts`
- `plugins/sync/build.gradle.kts`
- `plugins/insulin/build.gradle.kts`
- `plugins/constraints/build.gradle.kts`
- `plugins/smoothing/build.gradle.kts`
- `plugins/configuration/build.gradle.kts`
- `plugins/sensitivity/build.gradle.kts`
- `plugins/source/build.gradle.kts`
- `plugins/aps/build.gradle.kts`
- `plugins/main/build.gradle.kts`
- `shared/impl/build.gradle.kts`
- `shared/tests/build.gradle.kts`
- `core/objects/build.gradle.kts`
- `core/ui/build.gradle.kts`
- `core/interfaces/build.gradle.kts`
- `core/graph/build.gradle.kts`
- `core/graphview/build.gradle.kts`
- `core/nssdk/build.gradle.kts`
- `core/validators/build.gradle.kts`
- `core/utils/build.gradle.kts`
- `pump/danars/build.gradle.kts`
- `pump/medtronic/build.gradle.kts`
- `pump/pump-common/build.gradle.kts`
- `pump/equil/build.gradle.kts`
- `pump/rileylink/build.gradle.kts`
- `pump/virtual/build.gradle.kts`
- `pump/omnipod-dash/build.gradle.kts`
- `pump/insight/build.gradle.kts`
- `pump/omnipod-eros/build.gradle.kts`
- `pump/omnipod-common/build.gradle.kts`
- `pump/danar/build.gradle.kts`
- `pump/eopatch/build.gradle.kts`
- `pump/diaconn/build.gradle.kts`
- `pump/dana/build.gradle.kts`
- `pump/combov2/build.gradle.kts`
- `pump/medtrum/build.gradle.kts`
- `pump/combov2/comboctl/build.gradle.kts`

## Resource Files Modified

- `ui/src/main/res/values-it-rIT/strings.xml`
- `ui/src/main/res/values-da-rDK/strings.xml`
- `ui/src/main/res/values-sv-rSE/strings.xml`
- `ui/src/main/res/values-fr-rFR/strings.xml`
- `ui/src/main/res/values/strings.xml`
- `ui/src/main/res/values-zh-rCN/strings.xml`
- `ui/src/main/res/values-ro-rRO/strings.xml`
- `ui/src/main/res/values-es-rES/strings.xml`
- `ui/src/main/res/values-ca-rES/strings.xml`
- `ui/src/main/res/values-nl-rNL/strings.xml`
- `ui/src/main/res/values-lt-rLT/strings.xml`
- `ui/src/main/res/values-pt-rPT/strings.xml`
- `ui/src/main/res/values-ko-rKR/strings.xml`
- `ui/src/main/res/values-sk-rSK/strings.xml`
- `ui/src/main/res/values-pl-rPL/strings.xml`
- `ui/src/main/res/values-ru-rRU/strings.xml`
- `ui/src/main/res/values-zh-rTW/strings.xml`
- `ui/src/main/res/values-iw-rIL/strings.xml`
- `ui/src/main/res/values-de-rDE/strings.xml`
- `ui/src/main/res/values-uk-rUA/strings.xml`
- `ui/src/main/res/values-nb-rNO/strings.xml`
- `ui/src/main/res/values-tr-rTR/strings.xml`
- `ui/src/main/res/values-sr-rCS/strings.xml`
- `ui/src/main/res/values-pt-rBR/strings.xml`
- `ui/src/main/res/values-ar-rSA/strings.xml`
- `ui/src/main/res/values-bg-rBG/strings.xml`
- `ui/src/main/res/values-el-rGR/strings.xml`
- `ui/src/main/res/values-hr-rHR/strings.xml`
- `ui/src/main/res/values-hu-rHU/strings.xml`
- `ui/src/main/res/values-cs-rCZ/strings.xml`
- `implementation/src/main/res/values-it-rIT/strings.xml`
- `implementation/src/main/res/values-da-rDK/strings.xml`
- `implementation/src/main/res/values-sv-rSE/strings.xml`
- `implementation/src/main/res/values-fr-rFR/strings.xml`
- `implementation/src/main/res/values/strings.xml`
- `implementation/src/main/res/values-zh-rCN/strings.xml`
- `implementation/src/main/res/values-ro-rRO/strings.xml`
- `implementation/src/main/res/values-es-rES/strings.xml`
- `implementation/src/main/res/values-ca-rES/strings.xml`
- `implementation/src/main/res/values-nl-rNL/strings.xml`
- `implementation/src/main/res/values-lt-rLT/strings.xml`
- `implementation/src/main/res/values-pt-rPT/strings.xml`
- `implementation/src/main/res/values-ko-rKR/strings.xml`
- `implementation/src/main/res/values-sk-rSK/strings.xml`
- `implementation/src/main/res/values-pl-rPL/strings.xml`
- `implementation/src/main/res/values-ru-rRU/strings.xml`
- `implementation/src/main/res/values-zh-rTW/strings.xml`
- `implementation/src/main/res/values-iw-rIL/strings.xml`
- `implementation/src/main/res/values-de-rDE/strings.xml`
- `implementation/src/main/res/values-uk-rUA/strings.xml`
- `implementation/src/main/res/values-nb-rNO/strings.xml`
- `implementation/src/main/res/values-tr-rTR/strings.xml`
- `implementation/src/main/res/values-sr-rCS/strings.xml`
- `implementation/src/main/res/values-pt-rBR/strings.xml`
- `implementation/src/main/res/values-ar-rSA/strings.xml`
- `implementation/src/main/res/values-bg-rBG/strings.xml`
- `implementation/src/main/res/values-el-rGR/strings.xml`
- `implementation/src/main/res/values-hr-rHR/strings.xml`
- `implementation/src/main/res/values-hu-rHU/strings.xml`
- `implementation/src/main/res/values-cs-rCZ/strings.xml`
- `plugins/automation/src/main/res/values-it-rIT/strings.xml`
- `plugins/automation/src/main/res/values-da-rDK/strings.xml`
- `plugins/automation/src/main/res/values-sl-rSI/strings.xml`
- `plugins/automation/src/main/res/values-sv-rSE/strings.xml`
- `plugins/automation/src/main/res/values-fr-rFR/strings.xml`
- `plugins/automation/src/main/res/values/strings.xml`
- `plugins/automation/src/main/res/values-zh-rCN/strings.xml`
- `plugins/automation/src/main/res/values-ro-rRO/strings.xml`
- `plugins/automation/src/main/res/values-es-rES/strings.xml`
- `plugins/automation/src/main/res/values-ca-rES/strings.xml`
- `plugins/automation/src/main/res/values-nl-rNL/strings.xml`
- `plugins/automation/src/main/res/values-lt-rLT/strings.xml`
- `plugins/automation/src/main/res/values-pt-rPT/strings.xml`
- `plugins/automation/src/main/res/values-ko-rKR/strings.xml`
- `plugins/automation/src/main/res/values-sk-rSK/strings.xml`
- `plugins/automation/src/main/res/values-pl-rPL/strings.xml`
- `plugins/automation/src/main/res/values-ru-rRU/strings.xml`
- `plugins/automation/src/main/res/values-zh-rTW/strings.xml`
- `plugins/automation/src/main/res/values-iw-rIL/strings.xml`
- `plugins/automation/src/main/res/values-de-rDE/strings.xml`
- `plugins/automation/src/main/res/values-ta-rIN/strings.xml`
- `plugins/automation/src/main/res/values-uk-rUA/strings.xml`
- `plugins/automation/src/main/res/values-nb-rNO/strings.xml`
- `plugins/automation/src/main/res/values-tr-rTR/strings.xml`
- `plugins/automation/src/main/res/values-sr-rCS/strings.xml`
- `plugins/automation/src/main/res/values-pt-rBR/strings.xml`
- `plugins/automation/src/main/res/values-ar-rSA/strings.xml`
- `plugins/automation/src/main/res/values-bg-rBG/strings.xml`
- `plugins/automation/src/main/res/values-el-rGR/strings.xml`
- `plugins/automation/src/main/res/values-hr-rHR/strings.xml`
- `plugins/automation/src/main/res/values-hu-rHU/strings.xml`
- `plugins/automation/src/main/res/values-cs-rCZ/strings.xml`
- `plugins/sync/src/main/res/values-it-rIT/strings.xml`
- `plugins/sync/src/main/res/values-da-rDK/strings.xml`
- `plugins/sync/src/main/res/values-sv-rSE/strings.xml`
- `plugins/sync/src/main/res/values-fr-rFR/strings.xml`
- `plugins/sync/src/main/res/values/strings.xml`
- `plugins/sync/src/main/res/values-zh-rCN/strings.xml`
- `plugins/sync/src/main/res/values-ro-rRO/strings.xml`
- `plugins/sync/src/main/res/values-es-rES/strings.xml`
- `plugins/sync/src/main/res/values-ca-rES/strings.xml`
- `plugins/sync/src/main/res/values-nl-rNL/strings.xml`
- `plugins/sync/src/main/res/values-lt-rLT/strings.xml`
- `plugins/sync/src/main/res/values-pt-rPT/strings.xml`
- `plugins/sync/src/main/res/values-ko-rKR/strings.xml`
- `plugins/sync/src/main/res/values-sk-rSK/strings.xml`
- `plugins/sync/src/main/res/values-pl-rPL/strings.xml`
- `plugins/sync/src/main/res/values-ru-rRU/strings.xml`
- `plugins/sync/src/main/res/values-zh-rTW/strings.xml`
- `plugins/sync/src/main/res/values-iw-rIL/strings.xml`
- `plugins/sync/src/main/res/values-de-rDE/strings.xml`
- `plugins/sync/src/main/res/values-uk-rUA/strings.xml`
- `plugins/sync/src/main/res/values-nb-rNO/strings.xml`
- `plugins/sync/src/main/res/values-tr-rTR/strings.xml`
- `plugins/sync/src/main/res/values-sr-rCS/strings.xml`
- `plugins/sync/src/main/res/values-pt-rBR/strings.xml`
- `plugins/sync/src/main/res/values-ar-rSA/strings.xml`
- `plugins/sync/src/main/res/values-bg-rBG/strings.xml`
- `plugins/sync/src/main/res/values-el-rGR/strings.xml`
- `plugins/sync/src/main/res/values-hr-rHR/strings.xml`
- `plugins/sync/src/main/res/values-hu-rHU/strings.xml`
- `plugins/sync/src/main/res/values-cs-rCZ/strings.xml`
- `plugins/insulin/src/main/res/values-it-rIT/strings.xml`
- `plugins/insulin/src/main/res/values-da-rDK/strings.xml`
- `plugins/insulin/src/main/res/values-sv-rSE/strings.xml`
- `plugins/insulin/src/main/res/values-fr-rFR/strings.xml`
- `plugins/insulin/src/main/res/values/strings.xml`
- `plugins/insulin/src/main/res/values-zh-rCN/strings.xml`
- `plugins/insulin/src/main/res/values-ro-rRO/strings.xml`
- `plugins/insulin/src/main/res/values-es-rES/strings.xml`
- `plugins/insulin/src/main/res/values-ca-rES/strings.xml`
- `plugins/insulin/src/main/res/values-nl-rNL/strings.xml`
- `plugins/insulin/src/main/res/values-lt-rLT/strings.xml`
- `plugins/insulin/src/main/res/values-pt-rPT/strings.xml`
- `plugins/insulin/src/main/res/values-ko-rKR/strings.xml`
- `plugins/insulin/src/main/res/values-sk-rSK/strings.xml`
- `plugins/insulin/src/main/res/values-pl-rPL/strings.xml`
- `plugins/insulin/src/main/res/values-ru-rRU/strings.xml`
- `plugins/insulin/src/main/res/values-zh-rTW/strings.xml`
- `plugins/insulin/src/main/res/values-iw-rIL/strings.xml`
- `plugins/insulin/src/main/res/values-de-rDE/strings.xml`
- `plugins/insulin/src/main/res/values-uk-rUA/strings.xml`
- `plugins/insulin/src/main/res/values-nb-rNO/strings.xml`
- `plugins/insulin/src/main/res/values-tr-rTR/strings.xml`
- `plugins/insulin/src/main/res/values-sr-rCS/strings.xml`
- `plugins/insulin/src/main/res/values-pt-rBR/strings.xml`
- `plugins/insulin/src/main/res/values-ar-rSA/strings.xml`
- `plugins/insulin/src/main/res/values-bg-rBG/strings.xml`
- `plugins/insulin/src/main/res/values-el-rGR/strings.xml`
- `plugins/insulin/src/main/res/values-hr-rHR/strings.xml`
- `plugins/insulin/src/main/res/values-hu-rHU/strings.xml`
- `plugins/insulin/src/main/res/values-cs-rCZ/strings.xml`
- `plugins/constraints/src/main/res/values-it-rIT/strings.xml`
- `plugins/constraints/src/main/res/values-da-rDK/strings.xml`
- `plugins/constraints/src/main/res/values-sv-rSE/strings.xml`
- `plugins/constraints/src/main/res/values-fr-rFR/strings.xml`
- `plugins/constraints/src/main/res/values/strings.xml`
- `plugins/constraints/src/main/res/values-zh-rCN/strings.xml`
- `plugins/constraints/src/main/res/values-ro-rRO/strings.xml`
- `plugins/constraints/src/main/res/values-es-rES/strings.xml`
- `plugins/constraints/src/main/res/values-ca-rES/strings.xml`
- `plugins/constraints/src/main/res/values-nl-rNL/strings.xml`
- `plugins/constraints/src/main/res/values-lt-rLT/strings.xml`
- `plugins/constraints/src/main/res/values-pt-rPT/strings.xml`
- `plugins/constraints/src/main/res/values-ko-rKR/strings.xml`
- `plugins/constraints/src/main/res/values-sk-rSK/strings.xml`
- `plugins/constraints/src/main/res/values-pl-rPL/strings.xml`
- `plugins/constraints/src/main/res/values-ru-rRU/strings.xml`
- `plugins/constraints/src/main/res/values-zh-rTW/strings.xml`
- `plugins/constraints/src/main/res/values-iw-rIL/strings.xml`
- `plugins/constraints/src/main/res/values-de-rDE/strings.xml`
- `plugins/constraints/src/main/res/values-uk-rUA/strings.xml`
- `plugins/constraints/src/main/res/values-nb-rNO/strings.xml`
- `plugins/constraints/src/main/res/values-tr-rTR/strings.xml`
- `plugins/constraints/src/main/res/values-sr-rCS/strings.xml`
- `plugins/constraints/src/main/res/values-pt-rBR/strings.xml`
- `plugins/constraints/src/main/res/values-ar-rSA/strings.xml`
- `plugins/constraints/src/main/res/values-bg-rBG/strings.xml`
- `plugins/constraints/src/main/res/values-el-rGR/strings.xml`
- `plugins/constraints/src/main/res/values-hr-rHR/strings.xml`
- `plugins/constraints/src/main/res/values-hu-rHU/strings.xml`
- `plugins/constraints/src/main/res/values-cs-rCZ/strings.xml`
- `plugins/smoothing/src/main/res/values-it-rIT/strings.xml`
- `plugins/smoothing/src/main/res/values-da-rDK/strings.xml`
- `plugins/smoothing/src/main/res/values-sv-rSE/strings.xml`
- `plugins/smoothing/src/main/res/values-fr-rFR/strings.xml`
- `plugins/smoothing/src/main/res/values/strings.xml`
- `plugins/smoothing/src/main/res/values-zh-rCN/strings.xml`
- `plugins/smoothing/src/main/res/values-ro-rRO/strings.xml`
- `plugins/smoothing/src/main/res/values-es-rES/strings.xml`
- `plugins/smoothing/src/main/res/values-ca-rES/strings.xml`
- `plugins/smoothing/src/main/res/values-nl-rNL/strings.xml`
- `plugins/smoothing/src/main/res/values-lt-rLT/strings.xml`
- `plugins/smoothing/src/main/res/values-pt-rPT/strings.xml`
- `plugins/smoothing/src/main/res/values-ko-rKR/strings.xml`
- `plugins/smoothing/src/main/res/values-sk-rSK/strings.xml`
- `plugins/smoothing/src/main/res/values-pl-rPL/strings.xml`
- `plugins/smoothing/src/main/res/values-ru-rRU/strings.xml`
- `plugins/smoothing/src/main/res/values-zh-rTW/strings.xml`
- `plugins/smoothing/src/main/res/values-iw-rIL/strings.xml`
- `plugins/smoothing/src/main/res/values-de-rDE/strings.xml`
- `plugins/smoothing/src/main/res/values-uk-rUA/strings.xml`
- `plugins/smoothing/src/main/res/values-nb-rNO/strings.xml`
- `plugins/smoothing/src/main/res/values-tr-rTR/strings.xml`
- `plugins/smoothing/src/main/res/values-sr-rCS/strings.xml`
- `plugins/smoothing/src/main/res/values-pt-rBR/strings.xml`
- `plugins/smoothing/src/main/res/values-ar-rSA/strings.xml`
- `plugins/smoothing/src/main/res/values-bg-rBG/strings.xml`
- `plugins/smoothing/src/main/res/values-el-rGR/strings.xml`
- `plugins/smoothing/src/main/res/values-hr-rHR/strings.xml`
- `plugins/smoothing/src/main/res/values-hu-rHU/strings.xml`
- `plugins/smoothing/src/main/res/values-cs-rCZ/strings.xml`
- `plugins/configuration/src/main/res/values-it-rIT/strings.xml`
- `plugins/configuration/src/main/res/values-da-rDK/strings.xml`
- `plugins/configuration/src/main/res/values-sv-rSE/strings.xml`
- `plugins/configuration/src/main/res/values-fr-rFR/strings.xml`
- `plugins/configuration/src/main/res/values/strings.xml`
- `plugins/configuration/src/main/res/values-zh-rCN/strings.xml`
- `plugins/configuration/src/main/res/values-ro-rRO/strings.xml`
- `plugins/configuration/src/main/res/values-es-rES/strings.xml`
- `plugins/configuration/src/main/res/values-ca-rES/strings.xml`
- `plugins/configuration/src/main/res/values-nl-rNL/strings.xml`
- `plugins/configuration/src/main/res/values-lt-rLT/strings.xml`
- `plugins/configuration/src/main/res/values-pt-rPT/strings.xml`
- `plugins/configuration/src/main/res/values-ko-rKR/strings.xml`
- `plugins/configuration/src/main/res/values-sk-rSK/strings.xml`
- `plugins/configuration/src/main/res/values-pl-rPL/strings.xml`
- `plugins/configuration/src/main/res/values-ru-rRU/strings.xml`
- `plugins/configuration/src/main/res/values-zh-rTW/strings.xml`
- `plugins/configuration/src/main/res/values-iw-rIL/strings.xml`
- `plugins/configuration/src/main/res/values-de-rDE/strings.xml`
- `plugins/configuration/src/main/res/values-uk-rUA/strings.xml`
- `plugins/configuration/src/main/res/values-nb-rNO/strings.xml`
- `plugins/configuration/src/main/res/values-tr-rTR/strings.xml`
- `plugins/configuration/src/main/res/values-sr-rCS/strings.xml`
- `plugins/configuration/src/main/res/values-pt-rBR/strings.xml`
- `plugins/configuration/src/main/res/values-ar-rSA/strings.xml`
- `plugins/configuration/src/main/res/values-bg-rBG/strings.xml`
- `plugins/configuration/src/main/res/values-el-rGR/strings.xml`
- `plugins/configuration/src/main/res/values-hr-rHR/strings.xml`
- `plugins/configuration/src/main/res/values-hu-rHU/strings.xml`
- `plugins/configuration/src/main/res/values-cs-rCZ/strings.xml`
- `plugins/sensitivity/src/main/res/values-it-rIT/strings.xml`
- `plugins/sensitivity/src/main/res/values-da-rDK/strings.xml`
- `plugins/sensitivity/src/main/res/values-sv-rSE/strings.xml`
- `plugins/sensitivity/src/main/res/values-fr-rFR/strings.xml`
- `plugins/sensitivity/src/main/res/values/strings.xml`
- `plugins/sensitivity/src/main/res/values-zh-rCN/strings.xml`
- `plugins/sensitivity/src/main/res/values-ro-rRO/strings.xml`
- `plugins/sensitivity/src/main/res/values-es-rES/strings.xml`
- `plugins/sensitivity/src/main/res/values-ca-rES/strings.xml`
- `plugins/sensitivity/src/main/res/values-nl-rNL/strings.xml`
- `plugins/sensitivity/src/main/res/values-lt-rLT/strings.xml`
- `plugins/sensitivity/src/main/res/values-pt-rPT/strings.xml`
- `plugins/sensitivity/src/main/res/values-ko-rKR/strings.xml`
- `plugins/sensitivity/src/main/res/values-sk-rSK/strings.xml`
- `plugins/sensitivity/src/main/res/values-pl-rPL/strings.xml`
- `plugins/sensitivity/src/main/res/values-ru-rRU/strings.xml`
- `plugins/sensitivity/src/main/res/values-zh-rTW/strings.xml`
- `plugins/sensitivity/src/main/res/values-iw-rIL/strings.xml`
- `plugins/sensitivity/src/main/res/values-de-rDE/strings.xml`
- `plugins/sensitivity/src/main/res/values-uk-rUA/strings.xml`
- `plugins/sensitivity/src/main/res/values-nb-rNO/strings.xml`
- `plugins/sensitivity/src/main/res/values-tr-rTR/strings.xml`
- `plugins/sensitivity/src/main/res/values-sr-rCS/strings.xml`
- `plugins/sensitivity/src/main/res/values-pt-rBR/strings.xml`
- `plugins/sensitivity/src/main/res/values-ar-rSA/strings.xml`
- `plugins/sensitivity/src/main/res/values-bg-rBG/strings.xml`
- `plugins/sensitivity/src/main/res/values-el-rGR/strings.xml`
- `plugins/sensitivity/src/main/res/values-hr-rHR/strings.xml`
- `plugins/sensitivity/src/main/res/values-hu-rHU/strings.xml`
- `plugins/sensitivity/src/main/res/values-cs-rCZ/strings.xml`
- `plugins/source/src/main/res/values-it-rIT/strings.xml`
- `plugins/source/src/main/res/values-da-rDK/strings.xml`
- `plugins/source/src/main/res/values-sv-rSE/strings.xml`
- `plugins/source/src/main/res/values-fr-rFR/strings.xml`
- `plugins/source/src/main/res/values/strings.xml`
- `plugins/source/src/main/res/values-zh-rCN/strings.xml`
- `plugins/source/src/main/res/values-ro-rRO/strings.xml`
- `plugins/source/src/main/res/values-es-rES/strings.xml`
- `plugins/source/src/main/res/values-ca-rES/strings.xml`
- `plugins/source/src/main/res/values-nl-rNL/strings.xml`
- `plugins/source/src/main/res/values-lt-rLT/strings.xml`
- `plugins/source/src/main/res/values-pt-rPT/strings.xml`
- `plugins/source/src/main/res/values-ko-rKR/strings.xml`
- `plugins/source/src/main/res/values-sk-rSK/strings.xml`
- `plugins/source/src/main/res/values-pl-rPL/strings.xml`
- `plugins/source/src/main/res/values-ru-rRU/strings.xml`
- `plugins/source/src/main/res/values-zh-rTW/strings.xml`
- `plugins/source/src/main/res/values-iw-rIL/strings.xml`
- `plugins/source/src/main/res/values-de-rDE/strings.xml`
- `plugins/source/src/main/res/values-uk-rUA/strings.xml`
- `plugins/source/src/main/res/values-nb-rNO/strings.xml`
- `plugins/source/src/main/res/values-tr-rTR/strings.xml`
- `plugins/source/src/main/res/values-sr-rCS/strings.xml`
- `plugins/source/src/main/res/values-pt-rBR/strings.xml`
- `plugins/source/src/main/res/values-ar-rSA/strings.xml`
- `plugins/source/src/main/res/values-bg-rBG/strings.xml`
- `plugins/source/src/main/res/values-el-rGR/strings.xml`
- `plugins/source/src/main/res/values-hr-rHR/strings.xml`
- `plugins/source/src/main/res/values-hu-rHU/strings.xml`
- `plugins/source/src/main/res/values-cs-rCZ/strings.xml`
- `plugins/aps/src/main/res/values-it-rIT/strings.xml`
- `plugins/aps/src/main/res/values-da-rDK/strings.xml`
- `plugins/aps/src/main/res/values-sv-rSE/strings.xml`
- `plugins/aps/src/main/res/values-fr-rFR/strings.xml`
- `plugins/aps/src/main/res/values/strings.xml`
- `plugins/aps/src/main/res/values-zh-rCN/strings.xml`
- `plugins/aps/src/main/res/values-ro-rRO/strings.xml`
- `plugins/aps/src/main/res/values-es-rES/strings.xml`
- `plugins/aps/src/main/res/values-ca-rES/strings.xml`
- `plugins/aps/src/main/res/values-nl-rNL/strings.xml`
- `plugins/aps/src/main/res/values-lt-rLT/strings.xml`
- `plugins/aps/src/main/res/values-pt-rPT/strings.xml`
- `plugins/aps/src/main/res/values-ko-rKR/strings.xml`
- `plugins/aps/src/main/res/values-sk-rSK/strings.xml`
- `plugins/aps/src/main/res/values-pl-rPL/strings.xml`
- `plugins/aps/src/main/res/values-ru-rRU/strings.xml`
- `plugins/aps/src/main/res/values-zh-rTW/strings.xml`
- `plugins/aps/src/main/res/values-iw-rIL/strings.xml`
- `plugins/aps/src/main/res/values-de-rDE/strings.xml`
- `plugins/aps/src/main/res/values-uk-rUA/strings.xml`
- `plugins/aps/src/main/res/values-nb-rNO/strings.xml`
- `plugins/aps/src/main/res/values-tr-rTR/strings.xml`
- `plugins/aps/src/main/res/values-sr-rCS/strings.xml`
- `plugins/aps/src/main/res/values-pt-rBR/strings.xml`
- `plugins/aps/src/main/res/values-ar-rSA/strings.xml`
- `plugins/aps/src/main/res/values-bg-rBG/strings.xml`
- `plugins/aps/src/main/res/values-el-rGR/strings.xml`
- `plugins/aps/src/main/res/values-hr-rHR/strings.xml`
- `plugins/aps/src/main/res/values-hu-rHU/strings.xml`
- `plugins/aps/src/main/res/values-cs-rCZ/strings.xml`
- `plugins/main/src/main/res/values-it-rIT/strings.xml`
- `plugins/main/src/main/res/values-da-rDK/strings.xml`
- `plugins/main/src/main/res/values-sv-rSE/strings.xml`
- `plugins/main/src/main/res/values-fr-rFR/strings.xml`
- `plugins/main/src/main/res/values/strings.xml`
- `plugins/main/src/main/res/values-zh-rCN/strings.xml`
- `plugins/main/src/main/res/values-ro-rRO/strings.xml`
- `plugins/main/src/main/res/values-es-rES/strings.xml`
- `plugins/main/src/main/res/values-ca-rES/strings.xml`
- `plugins/main/src/main/res/values-nl-rNL/strings.xml`
- `plugins/main/src/main/res/values-lt-rLT/strings.xml`
- `plugins/main/src/main/res/values-pt-rPT/strings.xml`
- `plugins/main/src/main/res/values-ko-rKR/strings.xml`
- `plugins/main/src/main/res/values-sk-rSK/strings.xml`
- `plugins/main/src/main/res/values-pl-rPL/strings.xml`
- `plugins/main/src/main/res/values-ru-rRU/strings.xml`
- `plugins/main/src/main/res/values-zh-rTW/strings.xml`
- `plugins/main/src/main/res/values-iw-rIL/strings.xml`
- `plugins/main/src/main/res/values-de-rDE/strings.xml`
- `plugins/main/src/main/res/values-uk-rUA/strings.xml`
- `plugins/main/src/main/res/values-nb-rNO/strings.xml`
- `plugins/main/src/main/res/values-tr-rTR/strings.xml`
- `plugins/main/src/main/res/values-sr-rCS/strings.xml`
- `plugins/main/src/main/res/values-pt-rBR/strings.xml`
- `plugins/main/src/main/res/values-ar-rSA/strings.xml`
- `plugins/main/src/main/res/values-bg-rBG/strings.xml`
- `plugins/main/src/main/res/values-el-rGR/strings.xml`
- `plugins/main/src/main/res/values-hr-rHR/strings.xml`
- `plugins/main/src/main/res/values-hu-rHU/strings.xml`
- `plugins/main/src/main/res/values-cs-rCZ/strings.xml`
- `shared/impl/src/main/res/values-it-rIT/strings.xml`
- `shared/impl/src/main/res/values-da-rDK/strings.xml`
- `shared/impl/src/main/res/values-sv-rSE/strings.xml`
- `shared/impl/src/main/res/values-fr-rFR/strings.xml`
- `shared/impl/src/main/res/values/strings.xml`
- `shared/impl/src/main/res/values-zh-rCN/strings.xml`
- `shared/impl/src/main/res/values-ro-rRO/strings.xml`
- `shared/impl/src/main/res/values-es-rES/strings.xml`
- `shared/impl/src/main/res/values-ca-rES/strings.xml`
- `shared/impl/src/main/res/values-nl-rNL/strings.xml`
- `shared/impl/src/main/res/values-lt-rLT/strings.xml`
- `shared/impl/src/main/res/values-pt-rPT/strings.xml`
- `shared/impl/src/main/res/values-ko-rKR/strings.xml`
- `shared/impl/src/main/res/values-sk-rSK/strings.xml`
- `shared/impl/src/main/res/values-pl-rPL/strings.xml`
- `shared/impl/src/main/res/values-ru-rRU/strings.xml`
- `shared/impl/src/main/res/values-zh-rTW/strings.xml`
- `shared/impl/src/main/res/values-iw-rIL/strings.xml`
- `shared/impl/src/main/res/values-de-rDE/strings.xml`
- `shared/impl/src/main/res/values-uk-rUA/strings.xml`
- `shared/impl/src/main/res/values-nb-rNO/strings.xml`
- `shared/impl/src/main/res/values-tr-rTR/strings.xml`
- `shared/impl/src/main/res/values-sr-rCS/strings.xml`
- `shared/impl/src/main/res/values-pt-rBR/strings.xml`
- `shared/impl/src/main/res/values-ar-rSA/strings.xml`
- `shared/impl/src/main/res/values-bg-rBG/strings.xml`
- `shared/impl/src/main/res/values-el-rGR/strings.xml`
- `shared/impl/src/main/res/values-hr-rHR/strings.xml`
- `shared/impl/src/main/res/values-hu-rHU/strings.xml`
- `shared/impl/src/main/res/values-cs-rCZ/strings.xml`
- `core/objects/src/main/res/values-it-rIT/strings.xml`
- `core/objects/src/main/res/values-da-rDK/strings.xml`
- `core/objects/src/main/res/values-sv-rSE/strings.xml`
- `core/objects/src/main/res/values-fr-rFR/strings.xml`
- `core/objects/src/main/res/values/strings.xml`
- `core/objects/src/main/res/values-zh-rCN/strings.xml`
- `core/objects/src/main/res/values-ro-rRO/strings.xml`
- `core/objects/src/main/res/values-es-rES/strings.xml`
- `core/objects/src/main/res/values-ca-rES/strings.xml`
- `core/objects/src/main/res/values-nl-rNL/strings.xml`
- `core/objects/src/main/res/values-lt-rLT/strings.xml`
- `core/objects/src/main/res/values-pt-rPT/strings.xml`
- `core/objects/src/main/res/values-ko-rKR/strings.xml`
- `core/objects/src/main/res/values-sk-rSK/strings.xml`
- `core/objects/src/main/res/values-pl-rPL/strings.xml`
- `core/objects/src/main/res/values-ru-rRU/strings.xml`
- `core/objects/src/main/res/values-zh-rTW/strings.xml`
- `core/objects/src/main/res/values-iw-rIL/strings.xml`
- `core/objects/src/main/res/values-de-rDE/strings.xml`
- `core/objects/src/main/res/values-uk-rUA/strings.xml`
- `core/objects/src/main/res/values-nb-rNO/strings.xml`
- `core/objects/src/main/res/values-tr-rTR/strings.xml`
- `core/objects/src/main/res/values-sr-rCS/strings.xml`
- `core/objects/src/main/res/values-pt-rBR/strings.xml`
- `core/objects/src/main/res/values-ar-rSA/strings.xml`
- `core/objects/src/main/res/values-bg-rBG/strings.xml`
- `core/objects/src/main/res/values-el-rGR/strings.xml`
- `core/objects/src/main/res/values-hr-rHR/strings.xml`
- `core/objects/src/main/res/values-hu-rHU/strings.xml`
- `core/objects/src/main/res/values-cs-rCZ/strings.xml`
- `core/ui/src/main/res/values-it-rIT/strings.xml`
- `core/ui/src/main/res/values-da-rDK/strings.xml`
- `core/ui/src/main/res/values-sv-rSE/strings.xml`
- `core/ui/src/main/res/values-fr-rFR/strings.xml`
- `core/ui/src/main/res/values/strings.xml`
- `core/ui/src/main/res/values-zh-rCN/strings.xml`
- `core/ui/src/main/res/values-ro-rRO/strings.xml`
- `core/ui/src/main/res/values-es-rES/strings.xml`
- `core/ui/src/main/res/values-ca-rES/strings.xml`
- `core/ui/src/main/res/values-nl-rNL/strings.xml`
- `core/ui/src/main/res/values-lt-rLT/strings.xml`
- `core/ui/src/main/res/values-pt-rPT/strings.xml`
- `core/ui/src/main/res/values-ko-rKR/strings.xml`
- `core/ui/src/main/res/values-sk-rSK/strings.xml`
- `core/ui/src/main/res/values-pl-rPL/strings.xml`
- `core/ui/src/main/res/values-ru-rRU/strings.xml`
- `core/ui/src/main/res/values-zh-rTW/strings.xml`
- `core/ui/src/main/res/values-iw-rIL/strings.xml`
- `core/ui/src/main/res/values-de-rDE/strings.xml`
- `core/ui/src/main/res/values-uk-rUA/strings.xml`
- `core/ui/src/main/res/values-nb-rNO/strings.xml`
- `core/ui/src/main/res/values-tr-rTR/strings.xml`
- `core/ui/src/main/res/values-sr-rCS/strings.xml`
- `core/ui/src/main/res/values-pt-rBR/strings.xml`
- `core/ui/src/main/res/values-ar-rSA/strings.xml`
- `core/ui/src/main/res/values-bg-rBG/strings.xml`
- `core/ui/src/main/res/values-el-rGR/strings.xml`
- `core/ui/src/main/res/values-hr-rHR/strings.xml`
- `core/ui/src/main/res/values-hu-rHU/strings.xml`
- `core/ui/src/main/res/values-cs-rCZ/strings.xml`
- `core/interfaces/src/main/res/values-it-rIT/strings.xml`
- `core/interfaces/src/main/res/values-da-rDK/strings.xml`
- `core/interfaces/src/main/res/values-sv-rSE/strings.xml`
- `core/interfaces/src/main/res/values-fr-rFR/strings.xml`
- `core/interfaces/src/main/res/values/strings.xml`
- `core/interfaces/src/main/res/values-zh-rCN/strings.xml`
- `core/interfaces/src/main/res/values-ro-rRO/strings.xml`
- `core/interfaces/src/main/res/values-es-rES/strings.xml`
- `core/interfaces/src/main/res/values-ca-rES/strings.xml`
- `core/interfaces/src/main/res/values-nl-rNL/strings.xml`
- `core/interfaces/src/main/res/values-lt-rLT/strings.xml`
- `core/interfaces/src/main/res/values-pt-rPT/strings.xml`
- `core/interfaces/src/main/res/values-ko-rKR/strings.xml`
- `core/interfaces/src/main/res/values-sk-rSK/strings.xml`
- `core/interfaces/src/main/res/values-pl-rPL/strings.xml`
- `core/interfaces/src/main/res/values-ru-rRU/strings.xml`
- `core/interfaces/src/main/res/values-zh-rTW/strings.xml`
- `core/interfaces/src/main/res/values-iw-rIL/strings.xml`
- `core/interfaces/src/main/res/values-de-rDE/strings.xml`
- `core/interfaces/src/main/res/values-uk-rUA/strings.xml`
- `core/interfaces/src/main/res/values-nb-rNO/strings.xml`
- `core/interfaces/src/main/res/values-tr-rTR/strings.xml`
- `core/interfaces/src/main/res/values-sr-rCS/strings.xml`
- `core/interfaces/src/main/res/values-pt-rBR/strings.xml`
- `core/interfaces/src/main/res/values-ar-rSA/strings.xml`
- `core/interfaces/src/main/res/values-bg-rBG/strings.xml`
- `core/interfaces/src/main/res/values-el-rGR/strings.xml`
- `core/interfaces/src/main/res/values-hr-rHR/strings.xml`
- `core/interfaces/src/main/res/values-hu-rHU/strings.xml`
- `core/interfaces/src/main/res/values-cs-rCZ/strings.xml`
- `pump/medtronic/src/main/res/values-it-rIT/strings.xml`
- `pump/medtronic/src/main/res/values-da-rDK/strings.xml`
- `pump/medtronic/src/main/res/values-sl-rSI/strings.xml`
- `pump/medtronic/src/main/res/values-sv-rSE/strings.xml`
- `pump/medtronic/src/main/res/values-fr-rFR/strings.xml`
- `pump/medtronic/src/main/res/values/strings.xml`
- `pump/medtronic/src/main/res/values-zh-rCN/strings.xml`
- `pump/medtronic/src/main/res/values-ro-rRO/strings.xml`
- `pump/medtronic/src/main/res/values-es-rES/strings.xml`
- `pump/medtronic/src/main/res/values-ca-rES/strings.xml`
- `pump/medtronic/src/main/res/values-nl-rNL/strings.xml`
- `pump/medtronic/src/main/res/values-lt-rLT/strings.xml`
- `pump/medtronic/src/main/res/values-pt-rPT/strings.xml`
- `pump/medtronic/src/main/res/values-ko-rKR/strings.xml`
- `pump/medtronic/src/main/res/values-sk-rSK/strings.xml`
- `pump/medtronic/src/main/res/values-pl-rPL/strings.xml`
- `pump/medtronic/src/main/res/values-ru-rRU/strings.xml`
- `pump/medtronic/src/main/res/values-zh-rTW/strings.xml`
- `pump/medtronic/src/main/res/values-cy-rGB/strings.xml`
- `pump/medtronic/src/main/res/values-iw-rIL/strings.xml`
- `pump/medtronic/src/main/res/values-de-rDE/strings.xml`
- `pump/medtronic/src/main/res/values-ta-rIN/strings.xml`
- `pump/medtronic/src/main/res/values-fi-rFI/strings.xml`
- `pump/medtronic/src/main/res/values-uk-rUA/strings.xml`
- `pump/medtronic/src/main/res/values-nb-rNO/strings.xml`
- `pump/medtronic/src/main/res/values-tr-rTR/strings.xml`
- `pump/medtronic/src/main/res/values-sr-rCS/strings.xml`
- `pump/medtronic/src/main/res/values-pt-rBR/strings.xml`
- `pump/medtronic/src/main/res/values-ar-rSA/strings.xml`
- `pump/medtronic/src/main/res/values-bg-rBG/strings.xml`
- `pump/medtronic/src/main/res/values-el-rGR/strings.xml`
- `pump/medtronic/src/main/res/values-hr-rHR/strings.xml`
- `pump/medtronic/src/main/res/values-hu-rHU/strings.xml`
- `pump/medtronic/src/main/res/values-cs-rCZ/strings.xml`
- `pump/pump-common/src/main/res/values-it-rIT/strings.xml`
- `pump/pump-common/src/main/res/values-da-rDK/strings.xml`
- `pump/pump-common/src/main/res/values-sv-rSE/strings.xml`
- `pump/pump-common/src/main/res/values-fr-rFR/strings.xml`
- `pump/pump-common/src/main/res/values/strings.xml`
- `pump/pump-common/src/main/res/values-zh-rCN/strings.xml`
- `pump/pump-common/src/main/res/values-ro-rRO/strings.xml`
- `pump/pump-common/src/main/res/values-es-rES/strings.xml`
- `pump/pump-common/src/main/res/values-ca-rES/strings.xml`
- `pump/pump-common/src/main/res/values-nl-rNL/strings.xml`
- `pump/pump-common/src/main/res/values-lt-rLT/strings.xml`
- `pump/pump-common/src/main/res/values-pt-rPT/strings.xml`
- `pump/pump-common/src/main/res/values-ko-rKR/strings.xml`
- `pump/pump-common/src/main/res/values-sk-rSK/strings.xml`
- `pump/pump-common/src/main/res/values-pl-rPL/strings.xml`
- `pump/pump-common/src/main/res/values-ru-rRU/strings.xml`
- `pump/pump-common/src/main/res/values-zh-rTW/strings.xml`
- `pump/pump-common/src/main/res/values-iw-rIL/strings.xml`
- `pump/pump-common/src/main/res/values-de-rDE/strings.xml`
- `pump/pump-common/src/main/res/values-uk-rUA/strings.xml`
- `pump/pump-common/src/main/res/values-nb-rNO/strings.xml`
- `pump/pump-common/src/main/res/values-tr-rTR/strings.xml`
- `pump/pump-common/src/main/res/values-sr-rCS/strings.xml`
- `pump/pump-common/src/main/res/values-pt-rBR/strings.xml`
- `pump/pump-common/src/main/res/values-ar-rSA/strings.xml`
- `pump/pump-common/src/main/res/values-bg-rBG/strings.xml`
- `pump/pump-common/src/main/res/values-el-rGR/strings.xml`
- `pump/pump-common/src/main/res/values-hr-rHR/strings.xml`
- `pump/pump-common/src/main/res/values-hu-rHU/strings.xml`
- `pump/pump-common/src/main/res/values-cs-rCZ/strings.xml`
- `pump/equil/src/main/res/values-it-rIT/strings.xml`
- `pump/equil/src/main/res/values-da-rDK/strings.xml`
- `pump/equil/src/main/res/values-sv-rSE/strings.xml`
- `pump/equil/src/main/res/values-fr-rFR/strings.xml`
- `pump/equil/src/main/res/values/strings.xml`
- `pump/equil/src/main/res/values-zh-rCN/strings.xml`
- `pump/equil/src/main/res/values-ro-rRO/strings.xml`
- `pump/equil/src/main/res/values-es-rES/strings.xml`
- `pump/equil/src/main/res/values-ca-rES/strings.xml`
- `pump/equil/src/main/res/values-nl-rNL/strings.xml`
- `pump/equil/src/main/res/values-lt-rLT/strings.xml`
- `pump/equil/src/main/res/values-pt-rPT/strings.xml`
- `pump/equil/src/main/res/values-ko-rKR/strings.xml`
- `pump/equil/src/main/res/values-sk-rSK/strings.xml`
- `pump/equil/src/main/res/values-pl-rPL/strings.xml`
- `pump/equil/src/main/res/values-ru-rRU/strings.xml`
- `pump/equil/src/main/res/values-zh-rTW/strings.xml`
- `pump/equil/src/main/res/values-iw-rIL/strings.xml`
- `pump/equil/src/main/res/values-de-rDE/strings.xml`
- `pump/equil/src/main/res/values-uk-rUA/strings.xml`
- `pump/equil/src/main/res/values-nb-rNO/strings.xml`
- `pump/equil/src/main/res/values-tr-rTR/strings.xml`
- `pump/equil/src/main/res/values-sr-rCS/strings.xml`
- `pump/equil/src/main/res/values-pt-rBR/strings.xml`
- `pump/equil/src/main/res/values-ar-rSA/strings.xml`
- `pump/equil/src/main/res/values-bg-rBG/strings.xml`
- `pump/equil/src/main/res/values-el-rGR/strings.xml`
- `pump/equil/src/main/res/values-hr-rHR/strings.xml`
- `pump/equil/src/main/res/values-hu-rHU/strings.xml`
- `pump/equil/src/main/res/values-cs-rCZ/strings.xml`
- `pump/rileylink/src/main/res/values-it-rIT/strings.xml`
- `pump/rileylink/src/main/res/values-da-rDK/strings.xml`
- `pump/rileylink/src/main/res/values-sl-rSI/strings.xml`
- `pump/rileylink/src/main/res/values-sv-rSE/strings.xml`
- `pump/rileylink/src/main/res/values-fr-rFR/strings.xml`
- `pump/rileylink/src/main/res/values/strings.xml`
- `pump/rileylink/src/main/res/values-zh-rCN/strings.xml`
- `pump/rileylink/src/main/res/values-ro-rRO/strings.xml`
- `pump/rileylink/src/main/res/values-es-rES/strings.xml`
- `pump/rileylink/src/main/res/values-ca-rES/strings.xml`
- `pump/rileylink/src/main/res/values-nl-rNL/strings.xml`
- `pump/rileylink/src/main/res/values-lt-rLT/strings.xml`
- `pump/rileylink/src/main/res/values-pt-rPT/strings.xml`
- `pump/rileylink/src/main/res/values-ko-rKR/strings.xml`
- `pump/rileylink/src/main/res/values-sk-rSK/strings.xml`
- `pump/rileylink/src/main/res/values-pl-rPL/strings.xml`
- `pump/rileylink/src/main/res/values-ru-rRU/strings.xml`
- `pump/rileylink/src/main/res/values-zh-rTW/strings.xml`
- `pump/rileylink/src/main/res/values-cy-rGB/strings.xml`
- `pump/rileylink/src/main/res/values-iw-rIL/strings.xml`
- `pump/rileylink/src/main/res/values-de-rDE/strings.xml`
- `pump/rileylink/src/main/res/values-ta-rIN/strings.xml`
- `pump/rileylink/src/main/res/values-fi-rFI/strings.xml`
- `pump/rileylink/src/main/res/values-uk-rUA/strings.xml`
- `pump/rileylink/src/main/res/values-nb-rNO/strings.xml`
- `pump/rileylink/src/main/res/values-tr-rTR/strings.xml`
- `pump/rileylink/src/main/res/values-sr-rCS/strings.xml`
- `pump/rileylink/src/main/res/values-pt-rBR/strings.xml`
- `pump/rileylink/src/main/res/values-ar-rSA/strings.xml`
- `pump/rileylink/src/main/res/values-bg-rBG/strings.xml`
- `pump/rileylink/src/main/res/values-el-rGR/strings.xml`
- `pump/rileylink/src/main/res/values-hr-rHR/strings.xml`
- `pump/rileylink/src/main/res/values-hu-rHU/strings.xml`
- `pump/rileylink/src/main/res/values-cs-rCZ/strings.xml`
- `pump/virtual/src/main/res/values-it-rIT/strings.xml`
- `pump/virtual/src/main/res/values-da-rDK/strings.xml`
- `pump/virtual/src/main/res/values-sv-rSE/strings.xml`
- `pump/virtual/src/main/res/values-fr-rFR/strings.xml`
- `pump/virtual/src/main/res/values/strings.xml`
- `pump/virtual/src/main/res/values-zh-rCN/strings.xml`
- `pump/virtual/src/main/res/values-ro-rRO/strings.xml`
- `pump/virtual/src/main/res/values-es-rES/strings.xml`
- `pump/virtual/src/main/res/values-ca-rES/strings.xml`
- `pump/virtual/src/main/res/values-nl-rNL/strings.xml`
- `pump/virtual/src/main/res/values-lt-rLT/strings.xml`
- `pump/virtual/src/main/res/values-pt-rPT/strings.xml`
- `pump/virtual/src/main/res/values-ko-rKR/strings.xml`
- `pump/virtual/src/main/res/values-sk-rSK/strings.xml`
- `pump/virtual/src/main/res/values-pl-rPL/strings.xml`
- `pump/virtual/src/main/res/values-ru-rRU/strings.xml`
- `pump/virtual/src/main/res/values-zh-rTW/strings.xml`
- `pump/virtual/src/main/res/values-iw-rIL/strings.xml`
- `pump/virtual/src/main/res/values-de-rDE/strings.xml`
- `pump/virtual/src/main/res/values-uk-rUA/strings.xml`
- `pump/virtual/src/main/res/values-nb-rNO/strings.xml`
- `pump/virtual/src/main/res/values-tr-rTR/strings.xml`
- `pump/virtual/src/main/res/values-sr-rCS/strings.xml`
- `pump/virtual/src/main/res/values-pt-rBR/strings.xml`
- `pump/virtual/src/main/res/values-ar-rSA/strings.xml`
- `pump/virtual/src/main/res/values-bg-rBG/strings.xml`
- `pump/virtual/src/main/res/values-el-rGR/strings.xml`
- `pump/virtual/src/main/res/values-hr-rHR/strings.xml`
- `pump/virtual/src/main/res/values-hu-rHU/strings.xml`
- `pump/virtual/src/main/res/values-cs-rCZ/strings.xml`
- `pump/omnipod-dash/src/main/res/values-it-rIT/strings.xml`
- `pump/omnipod-dash/src/main/res/values-da-rDK/strings.xml`
- `pump/omnipod-dash/src/main/res/values-sl-rSI/strings.xml`
- `pump/omnipod-dash/src/main/res/values-sv-rSE/strings.xml`
- `pump/omnipod-dash/src/main/res/values-fr-rFR/strings.xml`
- `pump/omnipod-dash/src/main/res/values/strings.xml`
- `pump/omnipod-dash/src/main/res/values-zh-rCN/strings.xml`
- `pump/omnipod-dash/src/main/res/values-ro-rRO/strings.xml`
- `pump/omnipod-dash/src/main/res/values-es-rES/strings.xml`
- `pump/omnipod-dash/src/main/res/values-ca-rES/strings.xml`
- `pump/omnipod-dash/src/main/res/values-nl-rNL/strings.xml`
- `pump/omnipod-dash/src/main/res/values-lt-rLT/strings.xml`
- `pump/omnipod-dash/src/main/res/values-pt-rPT/strings.xml`
- `pump/omnipod-dash/src/main/res/values-ko-rKR/strings.xml`
- `pump/omnipod-dash/src/main/res/values-sk-rSK/strings.xml`
- `pump/omnipod-dash/src/main/res/values-pl-rPL/strings.xml`
- `pump/omnipod-dash/src/main/res/values-ru-rRU/strings.xml`
- `pump/omnipod-dash/src/main/res/values-zh-rTW/strings.xml`
- `pump/omnipod-dash/src/main/res/values-iw-rIL/strings.xml`
- `pump/omnipod-dash/src/main/res/values-de-rDE/strings.xml`
- `pump/omnipod-dash/src/main/res/values-ta-rIN/strings.xml`
- `pump/omnipod-dash/src/main/res/values-uk-rUA/strings.xml`
- `pump/omnipod-dash/src/main/res/values-nb-rNO/strings.xml`
- `pump/omnipod-dash/src/main/res/values-tr-rTR/strings.xml`
- `pump/omnipod-dash/src/main/res/values-sr-rCS/strings.xml`
- `pump/omnipod-dash/src/main/res/values-pt-rBR/strings.xml`
- `pump/omnipod-dash/src/main/res/values-ar-rSA/strings.xml`
- `pump/omnipod-dash/src/main/res/values-bg-rBG/strings.xml`
- `pump/omnipod-dash/src/main/res/values-el-rGR/strings.xml`
- `pump/omnipod-dash/src/main/res/values-hr-rHR/strings.xml`
- `pump/omnipod-dash/src/main/res/values-hu-rHU/strings.xml`
- `pump/omnipod-dash/src/main/res/values-cs-rCZ/strings.xml`
- `pump/insight/src/main/res/values-it-rIT/strings.xml`
- `pump/insight/src/main/res/values-da-rDK/strings.xml`
- `pump/insight/src/main/res/values-sl-rSI/strings.xml`
- `pump/insight/src/main/res/values-sv-rSE/strings.xml`
- `pump/insight/src/main/res/values-fr-rFR/strings.xml`
- `pump/insight/src/main/res/values/strings.xml`
- `pump/insight/src/main/res/values-zh-rCN/strings.xml`
- `pump/insight/src/main/res/values-ro-rRO/strings.xml`
- `pump/insight/src/main/res/values-es-rES/strings.xml`
- `pump/insight/src/main/res/values-ca-rES/strings.xml`
- `pump/insight/src/main/res/values-nl-rNL/strings.xml`
- `pump/insight/src/main/res/values-lt-rLT/strings.xml`
- `pump/insight/src/main/res/values-pt-rPT/strings.xml`
- `pump/insight/src/main/res/values-ko-rKR/strings.xml`
- `pump/insight/src/main/res/values-sk-rSK/strings.xml`
- `pump/insight/src/main/res/values-pl-rPL/strings.xml`
- `pump/insight/src/main/res/values-ru-rRU/strings.xml`
- `pump/insight/src/main/res/values-zh-rTW/strings.xml`
- `pump/insight/src/main/res/values-iw-rIL/strings.xml`
- `pump/insight/src/main/res/values-de-rDE/strings.xml`
- `pump/insight/src/main/res/values-ta-rIN/strings.xml`
- `pump/insight/src/main/res/values-uk-rUA/strings.xml`
- `pump/insight/src/main/res/values-nb-rNO/strings.xml`
- `pump/insight/src/main/res/values-tr-rTR/strings.xml`
- `pump/insight/src/main/res/values-sr-rCS/strings.xml`
- `pump/insight/src/main/res/values-pt-rBR/strings.xml`
- `pump/insight/src/main/res/values-ar-rSA/strings.xml`
- `pump/insight/src/main/res/values-bg-rBG/strings.xml`
- `pump/insight/src/main/res/values-el-rGR/strings.xml`
- `pump/insight/src/main/res/values-hr-rHR/strings.xml`
- `pump/insight/src/main/res/values-hu-rHU/strings.xml`
- `pump/insight/src/main/res/values-cs-rCZ/strings.xml`
- `pump/omnipod-eros/src/main/res/values-it-rIT/strings.xml`
- `pump/omnipod-eros/src/main/res/values-da-rDK/strings.xml`
- `pump/omnipod-eros/src/main/res/values-sl-rSI/strings.xml`
- `pump/omnipod-eros/src/main/res/values-sv-rSE/strings.xml`
- `pump/omnipod-eros/src/main/res/values-fr-rFR/strings.xml`
- `pump/omnipod-eros/src/main/res/values/strings.xml`
- `pump/omnipod-eros/src/main/res/values-zh-rCN/strings.xml`
- `pump/omnipod-eros/src/main/res/values-ro-rRO/strings.xml`
- `pump/omnipod-eros/src/main/res/values-es-rES/strings.xml`
- `pump/omnipod-eros/src/main/res/values-ca-rES/strings.xml`
- `pump/omnipod-eros/src/main/res/values-nl-rNL/strings.xml`
- `pump/omnipod-eros/src/main/res/values-lt-rLT/strings.xml`
- `pump/omnipod-eros/src/main/res/values-pt-rPT/strings.xml`
- `pump/omnipod-eros/src/main/res/values-ko-rKR/strings.xml`
- `pump/omnipod-eros/src/main/res/values-sk-rSK/strings.xml`
- `pump/omnipod-eros/src/main/res/values-pl-rPL/strings.xml`
- `pump/omnipod-eros/src/main/res/values-ru-rRU/strings.xml`
- `pump/omnipod-eros/src/main/res/values-zh-rTW/strings.xml`
- `pump/omnipod-eros/src/main/res/values-iw-rIL/strings.xml`
- `pump/omnipod-eros/src/main/res/values-de-rDE/strings.xml`
- `pump/omnipod-eros/src/main/res/values-ta-rIN/strings.xml`
- `pump/omnipod-eros/src/main/res/values-uk-rUA/strings.xml`
- `pump/omnipod-eros/src/main/res/values-nb-rNO/strings.xml`
- `pump/omnipod-eros/src/main/res/values-tr-rTR/strings.xml`
- `pump/omnipod-eros/src/main/res/values-sr-rCS/strings.xml`
- `pump/omnipod-eros/src/main/res/values-pt-rBR/strings.xml`
- `pump/omnipod-eros/src/main/res/values-ar-rSA/strings.xml`
- `pump/omnipod-eros/src/main/res/values-bg-rBG/strings.xml`
- `pump/omnipod-eros/src/main/res/values-el-rGR/strings.xml`
- `pump/omnipod-eros/src/main/res/values-hr-rHR/strings.xml`
- `pump/omnipod-eros/src/main/res/values-hu-rHU/strings.xml`
- `pump/omnipod-eros/src/main/res/values-cs-rCZ/strings.xml`
- `pump/omnipod-common/src/main/res/values-it-rIT/strings.xml`
- `pump/omnipod-common/src/main/res/values-da-rDK/strings.xml`
- `pump/omnipod-common/src/main/res/values-sl-rSI/strings.xml`
- `pump/omnipod-common/src/main/res/values-sv-rSE/strings.xml`
- `pump/omnipod-common/src/main/res/values-fr-rFR/strings.xml`
- `pump/omnipod-common/src/main/res/values/strings.xml`
- `pump/omnipod-common/src/main/res/values-zh-rCN/strings.xml`
- `pump/omnipod-common/src/main/res/values-ro-rRO/strings.xml`
- `pump/omnipod-common/src/main/res/values-es-rES/strings.xml`
- `pump/omnipod-common/src/main/res/values-ca-rES/strings.xml`
- `pump/omnipod-common/src/main/res/values-nl-rNL/strings.xml`
- `pump/omnipod-common/src/main/res/values-lt-rLT/strings.xml`
- `pump/omnipod-common/src/main/res/values-pt-rPT/strings.xml`
- `pump/omnipod-common/src/main/res/values-ko-rKR/strings.xml`
- `pump/omnipod-common/src/main/res/values-sk-rSK/strings.xml`
- `pump/omnipod-common/src/main/res/values-pl-rPL/strings.xml`
- `pump/omnipod-common/src/main/res/values-ru-rRU/strings.xml`
- `pump/omnipod-common/src/main/res/values-zh-rTW/strings.xml`
- `pump/omnipod-common/src/main/res/values-iw-rIL/strings.xml`
- `pump/omnipod-common/src/main/res/values-de-rDE/strings.xml`
- `pump/omnipod-common/src/main/res/values-ta-rIN/strings.xml`
- `pump/omnipod-common/src/main/res/values-uk-rUA/strings.xml`
- `pump/omnipod-common/src/main/res/values-nb-rNO/strings.xml`
- `pump/omnipod-common/src/main/res/values-tr-rTR/strings.xml`
- `pump/omnipod-common/src/main/res/values-sr-rCS/strings.xml`
- `pump/omnipod-common/src/main/res/values-pt-rBR/strings.xml`
- `pump/omnipod-common/src/main/res/values-ar-rSA/strings.xml`
- `pump/omnipod-common/src/main/res/values-bg-rBG/strings.xml`
- `pump/omnipod-common/src/main/res/values-el-rGR/strings.xml`
- `pump/omnipod-common/src/main/res/values-hr-rHR/strings.xml`
- `pump/omnipod-common/src/main/res/values-hu-rHU/strings.xml`
- `pump/omnipod-common/src/main/res/values-cs-rCZ/strings.xml`
- `pump/danar/src/main/res/values-it-rIT/strings.xml`
- `pump/danar/src/main/res/values-da-rDK/strings.xml`
- `pump/danar/src/main/res/values-sv-rSE/strings.xml`
- `pump/danar/src/main/res/values-fr-rFR/strings.xml`
- `pump/danar/src/main/res/values/strings.xml`
- `pump/danar/src/main/res/values-zh-rCN/strings.xml`
- `pump/danar/src/main/res/values-ro-rRO/strings.xml`
- `pump/danar/src/main/res/values-es-rES/strings.xml`
- `pump/danar/src/main/res/values-ca-rES/strings.xml`
- `pump/danar/src/main/res/values-nl-rNL/strings.xml`
- `pump/danar/src/main/res/values-lt-rLT/strings.xml`
- `pump/danar/src/main/res/values-pt-rPT/strings.xml`
- `pump/danar/src/main/res/values-ko-rKR/strings.xml`
- `pump/danar/src/main/res/values-sk-rSK/strings.xml`
- `pump/danar/src/main/res/values-pl-rPL/strings.xml`
- `pump/danar/src/main/res/values-ru-rRU/strings.xml`
- `pump/danar/src/main/res/values-zh-rTW/strings.xml`
- `pump/danar/src/main/res/values-iw-rIL/strings.xml`
- `pump/danar/src/main/res/values-de-rDE/strings.xml`
- `pump/danar/src/main/res/values-uk-rUA/strings.xml`
- `pump/danar/src/main/res/values-nb-rNO/strings.xml`
- `pump/danar/src/main/res/values-tr-rTR/strings.xml`
- `pump/danar/src/main/res/values-sr-rCS/strings.xml`
- `pump/danar/src/main/res/values-pt-rBR/strings.xml`
- `pump/danar/src/main/res/values-ar-rSA/strings.xml`
- `pump/danar/src/main/res/values-bg-rBG/strings.xml`
- `pump/danar/src/main/res/values-el-rGR/strings.xml`
- `pump/danar/src/main/res/values-hr-rHR/strings.xml`
- `pump/danar/src/main/res/values-hu-rHU/strings.xml`
- `pump/danar/src/main/res/values-cs-rCZ/strings.xml`
- `pump/eopatch/src/main/res/values-it-rIT/strings.xml`
- `pump/eopatch/src/main/res/values-da-rDK/strings.xml`
- `pump/eopatch/src/main/res/values-sv-rSE/strings.xml`
- `pump/eopatch/src/main/res/values-fr-rFR/strings.xml`
- `pump/eopatch/src/main/res/values/strings.xml`
- `pump/eopatch/src/main/res/values-zh-rCN/strings.xml`
- `pump/eopatch/src/main/res/values-ro-rRO/strings.xml`
- `pump/eopatch/src/main/res/values-es-rES/strings.xml`
- `pump/eopatch/src/main/res/values-ca-rES/strings.xml`
- `pump/eopatch/src/main/res/values-nl-rNL/strings.xml`
- `pump/eopatch/src/main/res/values-lt-rLT/strings.xml`
- `pump/eopatch/src/main/res/values-pt-rPT/strings.xml`
- `pump/eopatch/src/main/res/values-ko-rKR/strings.xml`
- `pump/eopatch/src/main/res/values-sk-rSK/strings.xml`
- `pump/eopatch/src/main/res/values-pl-rPL/strings.xml`
- `pump/eopatch/src/main/res/values-ru-rRU/strings.xml`
- `pump/eopatch/src/main/res/values-zh-rTW/strings.xml`
- `pump/eopatch/src/main/res/values-iw-rIL/strings.xml`
- `pump/eopatch/src/main/res/values-ko/strings.xml`
- `pump/eopatch/src/main/res/values-de-rDE/strings.xml`
- `pump/eopatch/src/main/res/values-uk-rUA/strings.xml`
- `pump/eopatch/src/main/res/values-nb-rNO/strings.xml`
- `pump/eopatch/src/main/res/values-tr-rTR/strings.xml`
- `pump/eopatch/src/main/res/values-sr-rCS/strings.xml`
- `pump/eopatch/src/main/res/values-pt-rBR/strings.xml`
- `pump/eopatch/src/main/res/values-ar-rSA/strings.xml`
- `pump/eopatch/src/main/res/values-bg-rBG/strings.xml`
- `pump/eopatch/src/main/res/values-el-rGR/strings.xml`
- `pump/eopatch/src/main/res/values-hr-rHR/strings.xml`
- `pump/eopatch/src/main/res/values-hu-rHU/strings.xml`
- `pump/eopatch/src/main/res/values-cs-rCZ/strings.xml`
- `pump/diaconn/src/main/res/values-it-rIT/strings.xml`
- `pump/diaconn/src/main/res/values-da-rDK/strings.xml`
- `pump/diaconn/src/main/res/values-sl-rSI/strings.xml`
- `pump/diaconn/src/main/res/values-sv-rSE/strings.xml`
- `pump/diaconn/src/main/res/values-fr-rFR/strings.xml`
- `pump/diaconn/src/main/res/values/strings.xml`
- `pump/diaconn/src/main/res/values-zh-rCN/strings.xml`
- `pump/diaconn/src/main/res/values-ro-rRO/strings.xml`
- `pump/diaconn/src/main/res/values-es-rES/strings.xml`
- `pump/diaconn/src/main/res/values-ca-rES/strings.xml`
- `pump/diaconn/src/main/res/values-nl-rNL/strings.xml`
- `pump/diaconn/src/main/res/values-lt-rLT/strings.xml`
- `pump/diaconn/src/main/res/values-pt-rPT/strings.xml`
- `pump/diaconn/src/main/res/values-ko-rKR/strings.xml`
- `pump/diaconn/src/main/res/values-sk-rSK/strings.xml`
- `pump/diaconn/src/main/res/values-pl-rPL/strings.xml`
- `pump/diaconn/src/main/res/values-ru-rRU/strings.xml`
- `pump/diaconn/src/main/res/values-zh-rTW/strings.xml`
- `pump/diaconn/src/main/res/values-iw-rIL/strings.xml`
- `pump/diaconn/src/main/res/values-de-rDE/strings.xml`
- `pump/diaconn/src/main/res/values-ta-rIN/strings.xml`
- `pump/diaconn/src/main/res/values-uk-rUA/strings.xml`
- `pump/diaconn/src/main/res/values-nb-rNO/strings.xml`
- `pump/diaconn/src/main/res/values-tr-rTR/strings.xml`
- `pump/diaconn/src/main/res/values-sr-rCS/strings.xml`
- `pump/diaconn/src/main/res/values-pt-rBR/strings.xml`
- `pump/diaconn/src/main/res/values-ar-rSA/strings.xml`
- `pump/diaconn/src/main/res/values-bg-rBG/strings.xml`
- `pump/diaconn/src/main/res/values-el-rGR/strings.xml`
- `pump/diaconn/src/main/res/values-hr-rHR/strings.xml`
- `pump/diaconn/src/main/res/values-hu-rHU/strings.xml`
- `pump/diaconn/src/main/res/values-cs-rCZ/strings.xml`
- `pump/dana/src/main/res/values-it-rIT/strings.xml`
- `pump/dana/src/main/res/values-da-rDK/strings.xml`
- `pump/dana/src/main/res/values-sl-rSI/strings.xml`
- `pump/dana/src/main/res/values-sv-rSE/strings.xml`
- `pump/dana/src/main/res/values-fr-rFR/strings.xml`
- `pump/dana/src/main/res/values/strings.xml`
- `pump/dana/src/main/res/values-zh-rCN/strings.xml`
- `pump/dana/src/main/res/values-ro-rRO/strings.xml`
- `pump/dana/src/main/res/values-es-rES/strings.xml`
- `pump/dana/src/main/res/values-ca-rES/strings.xml`
- `pump/dana/src/main/res/values-nl-rNL/strings.xml`
- `pump/dana/src/main/res/values-lt-rLT/strings.xml`
- `pump/dana/src/main/res/values-pt-rPT/strings.xml`
- `pump/dana/src/main/res/values-ko-rKR/strings.xml`
- `pump/dana/src/main/res/values-sk-rSK/strings.xml`
- `pump/dana/src/main/res/values-pl-rPL/strings.xml`
- `pump/dana/src/main/res/values-ru-rRU/strings.xml`
- `pump/dana/src/main/res/values-zh-rTW/strings.xml`
- `pump/dana/src/main/res/values-cy-rGB/strings.xml`
- `pump/dana/src/main/res/values-iw-rIL/strings.xml`
- `pump/dana/src/main/res/values-de-rDE/strings.xml`
- `pump/dana/src/main/res/values-ta-rIN/strings.xml`
- `pump/dana/src/main/res/values-fi-rFI/strings.xml`
- `pump/dana/src/main/res/values-uk-rUA/strings.xml`
- `pump/dana/src/main/res/values-nb-rNO/strings.xml`
- `pump/dana/src/main/res/values-tr-rTR/strings.xml`
- `pump/dana/src/main/res/values-sr-rCS/strings.xml`
- `pump/dana/src/main/res/values-pt-rBR/strings.xml`
- `pump/dana/src/main/res/values-ar-rSA/strings.xml`
- `pump/dana/src/main/res/values-bg-rBG/strings.xml`
- `pump/dana/src/main/res/values-el-rGR/strings.xml`
- `pump/dana/src/main/res/values-hr-rHR/strings.xml`
- `pump/dana/src/main/res/values-hu-rHU/strings.xml`
- `pump/dana/src/main/res/values-cs-rCZ/strings.xml`
- `pump/combov2/src/main/res/values-it-rIT/strings.xml`
- `pump/combov2/src/main/res/values-da-rDK/strings.xml`
- `pump/combov2/src/main/res/values-sv-rSE/strings.xml`
- `pump/combov2/src/main/res/values-fr-rFR/strings.xml`
- `pump/combov2/src/main/res/values/strings.xml`
- `pump/combov2/src/main/res/values-zh-rCN/strings.xml`
- `pump/combov2/src/main/res/values-ro-rRO/strings.xml`
- `pump/combov2/src/main/res/values-es-rES/strings.xml`
- `pump/combov2/src/main/res/values-ca-rES/strings.xml`
- `pump/combov2/src/main/res/values-nl-rNL/strings.xml`
- `pump/combov2/src/main/res/values-lt-rLT/strings.xml`
- `pump/combov2/src/main/res/values-pt-rPT/strings.xml`
- `pump/combov2/src/main/res/values-ko-rKR/strings.xml`
- `pump/combov2/src/main/res/values-sk-rSK/strings.xml`
- `pump/combov2/src/main/res/values-pl-rPL/strings.xml`
- `pump/combov2/src/main/res/values-ru-rRU/strings.xml`
- `pump/combov2/src/main/res/values-zh-rTW/strings.xml`
- `pump/combov2/src/main/res/values-iw-rIL/strings.xml`
- `pump/combov2/src/main/res/values-de-rDE/strings.xml`
- `pump/combov2/src/main/res/values-uk-rUA/strings.xml`
- `pump/combov2/src/main/res/values-nb-rNO/strings.xml`
- `pump/combov2/src/main/res/values-tr-rTR/strings.xml`
- `pump/combov2/src/main/res/values-sr-rCS/strings.xml`
- `pump/combov2/src/main/res/values-pt-rBR/strings.xml`
- `pump/combov2/src/main/res/values-ar-rSA/strings.xml`
- `pump/combov2/src/main/res/values-bg-rBG/strings.xml`
- `pump/combov2/src/main/res/values-el-rGR/strings.xml`
- `pump/combov2/src/main/res/values-hr-rHR/strings.xml`
- `pump/combov2/src/main/res/values-hu-rHU/strings.xml`
- `pump/combov2/src/main/res/values-cs-rCZ/strings.xml`
- `pump/medtrum/src/main/res/values-it-rIT/strings.xml`
- `pump/medtrum/src/main/res/values-da-rDK/strings.xml`
- `pump/medtrum/src/main/res/values-sv-rSE/strings.xml`
- `pump/medtrum/src/main/res/values-fr-rFR/strings.xml`
- `pump/medtrum/src/main/res/values/strings.xml`
- `pump/medtrum/src/main/res/values-zh-rCN/strings.xml`
- `pump/medtrum/src/main/res/values-ro-rRO/strings.xml`
- `pump/medtrum/src/main/res/values-es-rES/strings.xml`
- `pump/medtrum/src/main/res/values-ca-rES/strings.xml`
- `pump/medtrum/src/main/res/values-nl-rNL/strings.xml`
- `pump/medtrum/src/main/res/values-lt-rLT/strings.xml`
- `pump/medtrum/src/main/res/values-pt-rPT/strings.xml`
- `pump/medtrum/src/main/res/values-ko-rKR/strings.xml`
- `pump/medtrum/src/main/res/values-sk-rSK/strings.xml`
- `pump/medtrum/src/main/res/values-pl-rPL/strings.xml`
- `pump/medtrum/src/main/res/values-ru-rRU/strings.xml`
- `pump/medtrum/src/main/res/values-zh-rTW/strings.xml`
- `pump/medtrum/src/main/res/values-iw-rIL/strings.xml`
- `pump/medtrum/src/main/res/values-de-rDE/strings.xml`
- `pump/medtrum/src/main/res/values-uk-rUA/strings.xml`
- `pump/medtrum/src/main/res/values-nb-rNO/strings.xml`
- `pump/medtrum/src/main/res/values-tr-rTR/strings.xml`
- `pump/medtrum/src/main/res/values-sr-rCS/strings.xml`
- `pump/medtrum/src/main/res/values-pt-rBR/strings.xml`
- `pump/medtrum/src/main/res/values-ar-rSA/strings.xml`
- `pump/medtrum/src/main/res/values-bg-rBG/strings.xml`
- `pump/medtrum/src/main/res/values-el-rGR/strings.xml`
- `pump/medtrum/src/main/res/values-hr-rHR/strings.xml`
- `pump/medtrum/src/main/res/values-hu-rHU/strings.xml`
- `pump/medtrum/src/main/res/values-cs-rCZ/strings.xml`
- `wear/src/main/res/values-it-rIT/strings.xml`
- `wear/src/main/res/values-da-rDK/strings.xml`
- `wear/src/main/res/values-sl-rSI/strings.xml`
- `wear/src/main/res/values-sv-rSE/strings.xml`
- `wear/src/main/res/values-fr-rFR/strings.xml`
- `wear/src/main/res/values/strings.xml`
- `wear/src/main/res/values-zh-rCN/strings.xml`
- `wear/src/main/res/values-ro-rRO/strings.xml`
- `wear/src/main/res/values-es-rES/strings.xml`
- `wear/src/main/res/values-ca-rES/strings.xml`
- `wear/src/main/res/values-nl-rNL/strings.xml`
- `wear/src/main/res/values-lt-rLT/strings.xml`
- `wear/src/main/res/values-pt-rPT/strings.xml`
- `wear/src/main/res/values-ko-rKR/strings.xml`
- `wear/src/main/res/values-sk-rSK/strings.xml`
- `wear/src/main/res/values-pl-rPL/strings.xml`
- `wear/src/main/res/values-ru-rRU/strings.xml`
- `wear/src/main/res/values-zh-rTW/strings.xml`
- `wear/src/main/res/values-cy-rGB/strings.xml`
- `wear/src/main/res/values-iw-rIL/strings.xml`
- `wear/src/main/res/values-de-rDE/strings.xml`
- `wear/src/main/res/values-ta-rIN/strings.xml`
- `wear/src/main/res/values-fi-rFI/strings.xml`
- `wear/src/main/res/values-uk-rUA/strings.xml`
- `wear/src/main/res/values-nb-rNO/strings.xml`
- `wear/src/main/res/values-tr-rTR/strings.xml`
- `wear/src/main/res/values-sr-rCS/strings.xml`
- `wear/src/main/res/values-pt-rBR/strings.xml`
- `wear/src/main/res/values-ar-rSA/strings.xml`
- `wear/src/main/res/values-bg-rBG/strings.xml`
- `wear/src/main/res/values-el-rGR/strings.xml`
- `wear/src/main/res/values-hr-rHR/strings.xml`
- `wear/src/main/res/values-hu-rHU/strings.xml`
- `wear/src/main/res/values-cs-rCZ/strings.xml`
- `app/src/main/res/values-it-rIT/strings.xml`
- `app/src/main/res/values-da-rDK/strings.xml`
- `app/src/main/res/values-sl-rSI/strings.xml`
- `app/src/main/res/values-sv-rSE/strings.xml`
- `app/src/main/res/values-fr-rFR/strings.xml`
- `app/src/main/res/values/strings.xml`
- `app/src/main/res/values-zh-rCN/strings.xml`
- `app/src/main/res/values-ro-rRO/strings.xml`
- `app/src/main/res/values-es-rES/strings.xml`
- `app/src/main/res/values-ca-rES/strings.xml`
- `app/src/main/res/values-nl-rNL/strings.xml`
- `app/src/main/res/values-lt-rLT/strings.xml`
- `app/src/main/res/values-pt-rPT/strings.xml`
- `app/src/main/res/values-ko-rKR/strings.xml`
- `app/src/main/res/values-sk-rSK/strings.xml`
- `app/src/main/res/values-pl-rPL/strings.xml`
- `app/src/main/res/values-ru-rRU/strings.xml`
- `app/src/main/res/values-zh-rTW/strings.xml`
- `app/src/main/res/values-cy-rGB/strings.xml`
- `app/src/main/res/values-iw-rIL/strings.xml`
- `app/src/main/res/values-de-rDE/strings.xml`
- `app/src/main/res/values-ta-rIN/strings.xml`
- `app/src/main/res/values-fi-rFI/strings.xml`
- `app/src/main/res/values-uk-rUA/strings.xml`
- `app/src/main/res/values-nb-rNO/strings.xml`
- `app/src/main/res/values-tr-rTR/strings.xml`
- `app/src/main/res/values-sr-rCS/strings.xml`
- `app/src/main/res/values-pt-rBR/strings.xml`
- `app/src/main/res/values-ar-rSA/strings.xml`
- `app/src/main/res/values-bg-rBG/strings.xml`
- `app/src/main/res/values-el-rGR/strings.xml`
- `app/src/main/res/values-hr-rHR/strings.xml`
- `app/src/main/res/values-hu-rHU/strings.xml`
- `app/src/main/res/values-cs-rCZ/strings.xml`

## Missing Strings Addressed

Total missing strings: 123

1. `a11y_graph_scale`
2. `a11y_graph_scale_12h`
3. `a11y_graph_scale_18h`
4. `a11y_graph_scale_24h`
5. `a11y_graph_scale_6h`
6. `algorithm_long`
7. `algorithm_short`
8. `autoISF_settings_summary`
9. `autoISF_settings_title`
10. `autoisf_shortname`
11. `autosens_long`
12. `autosens_short`
13. `careportal_settings_export`
14. `careportal_settings_export_message`
15. `choose_from_map`
16. `description_auto_isf`
17. `dyn_isf_adjust_summary`
18. `dyn_isf_adjust_title`
19. `enableSMB_EvenOn_OddOff_always`
20. `enableSMB_EvenOn_OddOff_always_summary`
21. `export_alert`
22. `export_disabled`
23. `export_expired`
24. `export_failed`
25. `export_ok`
26. `export_result_message_about_to_expire`
27. `export_result_message_disabled`
28. `export_result_message_expired`
29. `export_result_message_exported`
30. `export_result_message_failed`
31. `export_settings_short`
32. `export_warning`
33. `exportsettings`
34. `exportsettings_message`
35. `extended_bolus_data_point_graph`
36. `extended_bolus_full`
37. `extended_bolus_medium`
38. `fallback_to_isf_no_tdd`
39. `graph_long_scale_12h`
40. `graph_long_scale_18h`
41. `graph_long_scale_24h`
42. `graph_long_scale_6h`
43. `graph_scale_12h`
44. `graph_scale_18h`
45. `graph_scale_24h`
46. `graph_scale_6h`
47. `half_basal_exercise_target_summary`
48. `half_basal_exercise_target_title`
49. `ic_dynamic_label_warning`
50. `isf_dynamic_label_warning`
51. `isf_for_carbs`
52. `location_permission_not_granted`
53. `nav_export`
54. `openaps_auto_isf`
55. `openapsama_autoISF_max`
56. `openapsama_autoISF_max_summary`
57. `openapsama_autoISF_min`
58. `openapsama_autoISF_min_summary`
59. `openapsama_bgAccel_ISF_weight`
60. `openapsama_bgAccel_ISF_weight_summary`
61. `openapsama_bgBrake_ISF_weight`
62. `openapsama_bgBrake_ISF_weight_summary`
63. `openapsama_dura_ISF_weight`
64. `openapsama_dura_ISF_weight_summary`
65. `openapsama_enable_autoISF`
66. `openapsama_higher_ISFrange_weight`
67. `openapsama_higher_ISFrange_weight_summary`
68. `openapsama_iob_threshold_percent`
69. `openapsama_iob_threshold_percent_summary`
70. `openapsama_lower_ISFrange_weight`
71. `openapsama_lower_ISFrange_weight_summary`
72. `openapsama_pp_ISF_weight`
73. `openapsama_pp_ISF_weight_summary`
74. `openapsama_smb_delivery_ratio`
75. `openapsama_smb_delivery_ratio_bg_range`
76. `openapsama_smb_delivery_ratio_bg_range_summary`
77. `openapsama_smb_delivery_ratio_max`
78. `openapsama_smb_delivery_ratio_max_summary`
79. `openapsama_smb_delivery_ratio_min`
80. `openapsama_smb_delivery_ratio_min_summary`
81. `openapsama_smb_delivery_ratio_summary`
82. `openapsama_smb_max_range_extension`
83. `openapsama_smb_max_range_extension_summary`
84. `overview_show_steps`
85. `overview_show_variable_sens`
86. `percent_rate_duration`
87. `percent_rate_duration_formatted`
88. `pump_disconnected`
89. `rate_percent_duration`
90. `rate_percent_duration_formatted`
91. `secs`
92. `sensitivity`
93. `settingsexport`
94. `simple_mode_enabled`
95. `smb_delivery_settings_summary`
96. `smb_delivery_settings_title`
97. `steps_shortname`
98. `temp_basal_overview_short_name`
99. `temp_basal_tsf_absolute`
100. `temp_basal_tsf_fake_extended`
101. `temp_basal_tsf_percent`
102. `triggerCannulaAgeDesc`
103. `triggerCannulaAgeLabel`
104. `triggerInsulinAgeDesc`
105. `triggerInsulinAgeLabel`
106. `triggerPodChangeDesc`
107. `triggerPodChangeLabel`
108. `triggerPumpBatteryAgeDesc`
109. `triggerPumpBatteryAgeLabel`
110. `triggerPumpBatteryLevelDesc`
111. `triggerPumpBatteryLevelLabel`
112. `triggerReservoirLevelDesc`
113. `triggerReservoirLevelLabel`
114. `triggerSensorAgeDesc`
115. `triggerSensorAgeLabel`
116. `triggerStepsCountDesc`
117. `triggerStepsCountDropdownLabel`
118. `triggerStepsCountLabel`
119. `uel_reset_aps_results`
120. `uel_select_directory`
121. `use_dynamic_sensitivity_summary`
122. `use_dynamic_sensitivity_title`
123. `variable_sensitivity_shortname`

## Recommended Build Process

### For Android Studio Meerkat 2024.3.1:

1. **Open Project**: Open the target directory in Android Studio Meerkat
2. **Let AS Handle JVM**: Allow Android Studio to configure JVM settings automatically
3. **Gradle Settings**:
   - File → Settings → Build Tools → Gradle
   - Gradle JDK: Use embedded JDK (recommended)
   - Let Android Studio manage the JVM version
4. **Clean Build**:
   ```bash
   ./gradlew clean
   ./gradlew build
   ```

## Troubleshooting

### If Build Still Fails:

1. **Check the error log**: Look for specific error messages
2. **Restore from backups**: `.backup` files are created for all modified files
3. **Compare with working AndroidAPS**: Use the main AAPS project as reference
4. **Gradle issues**: Try `./gradlew --stop` and restart
5. **JVM conflicts**: Check if multiple JVM versions are specified

### Common Issues:

- **JVM version conflicts**: Remove explicit JVM toolchain configurations
- **Resource linking errors**: Check string resource names and translations
- **Module dependencies**: Ensure all required modules are present
- **Gradle version**: Verify Gradle wrapper is using supported version

## Recovery Instructions

If the build fails and you need to restore:

```bash
# Restore all backup files
find . -name '*.backup' -exec sh -c 'mv "$1" "${1%.backup}"' _ {} \;
```

## Next Steps

1. **Review TODO strings**: Replace placeholder strings with proper translations
2. **Test functionality**: Verify EatingNow features work correctly
3. **Monitor build logs**: Watch for any remaining warnings or errors
4. **Consider incremental fixes**: Make small changes and test frequently
5. **Document working configuration**: Save successful build settings
