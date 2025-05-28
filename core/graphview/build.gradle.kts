plugins {
    alias(libs.plugins.android.library)
    id("kotlin-android")
    id("android-module-dependencies")
}


android {

    namespace = "com.jjoe64.graphview"
    
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
    api(libs.androidx.core)
}