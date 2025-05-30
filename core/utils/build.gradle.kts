plugins {
    alias(libs.plugins.android.library)
    id("kotlin-android")
    kotlin("plugin.allopen")
    id("android-module-dependencies")
    id("all-open-dependencies")
    id("test-module-dependencies")
    id("jacoco-module-dependencies")
}

android {
    namespace = "app.aaps.core.utils"
    
    compileOptions {
        // Let Meerkat/AS handle JVM version selection
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    
    kotlinOptions {
        // Conservative JVM target - let toolchain override if needed
        jvmTarget = "1.8"
    }
}

dependencies {

    api(libs.net.danlew.android.joda)

    //Firebase
    api(platform(libs.com.google.firebase.bom))
    api(libs.com.google.firebase.analytics)
    api(libs.com.google.firebase.crashlytics)
    // StatsActivity not in use now
    // api(libs.com.google.firebase.messaging)
    // api(libs.com.google.firebase.auth)
    // api(libs.com.google.firebase.database)

    //CryptoUtil
    api(libs.com.madgag.spongycastle)
    api(libs.com.google.crypto.tink)

    //WorkManager
    api(libs.androidx.work.runtime) // DataWorkerStorage

    api(libs.com.google.dagger.android)
    api(libs.com.google.dagger.android.support)
}