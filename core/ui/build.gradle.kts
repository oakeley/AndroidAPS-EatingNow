plugins {
    alias(libs.plugins.android.library)
    id("kotlin-android")
    id("android-module-dependencies")
}

android {
    namespace = "app.aaps.core.ui"
    defaultConfig {
        minSdk = Versions.wearMinSdk
    
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
}

dependencies {
    api(libs.androidx.core)
    api(libs.androidx.appcompat)
    api(libs.androidx.preference)
    api(libs.androidx.gridlayout)


    api(libs.com.google.android.material)

    api(libs.com.google.dagger.android)
    api(libs.com.google.dagger.android.support)
}