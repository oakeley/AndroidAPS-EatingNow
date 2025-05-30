plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.ksp)
    id("kotlin-android")
    id("android-module-dependencies")
    id("test-module-dependencies")
    id("jacoco-module-dependencies")
}

android {
    namespace = "app.aaps.shared.impl"
    defaultConfig {
        minSdk = Versions.wearMinSdk  // for wear
    
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
    implementation(project(":core:data"))
    implementation(project(":core:interfaces"))
    implementation(project(":core:keys"))

    //Logger
    api(libs.org.slf4j.api)
    api(libs.com.github.tony19.logback.android)

    api(libs.com.caverock.androidsvg)

    api(libs.io.reactivex.rxjava3.rxandroid)
    api(libs.net.danlew.android.joda)

    api(libs.com.google.dagger.android.support)
    ksp(libs.com.google.dagger.compiler)
    ksp(libs.com.google.dagger.android.processor)
}