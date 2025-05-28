// Modified for Eating Now
import org.gradle.api.JavaVersion

object Versions {

    const val appVersion = "3.3.2.0"+"-EatingNow"
    const val versionCode = 1500
    const val kotlin = "1.9.22"
    const val jvmTarget = "17"             // Change from "11" to "17"
    const val ndkVersion = "21.1.6352462"

    const val compileSdk = 35
    const val minSdk = 30
    const val targetSdk = 34
    const val wearMinSdk = 26
    const val wearTargetSdk = 29

    val javaVersion = JavaVersion.VERSION_17
    const val jacoco = "0.8.11"
}
