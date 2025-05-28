plugins {
    alias(libs.plugins.android.library)
    id("kotlin-android")
    id("android-module-dependencies")
    id("test-module-dependencies")
    id("jacoco-module-dependencies")
}

android {
    namespace = "info.nightscout.comboctl"
    sourceSets.getByName("main") {
        kotlin.srcDir("src/commonMain/kotlin")
        kotlin.srcDir("src/androidMain/kotlin")
        manifest.srcFile("src/androidMain/AndroidManifest.xml")
    
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
    sourceSets.getByName("test") {
        kotlin.srcDir("src/jvmTest/kotlin")
    }
}

dependencies {

    api(platform(libs.kotlinx.coroutines.bom))
    api(libs.kotlinx.coroutines.core)
    api(libs.kotlinx.datetime)
    api(libs.androidx.core)

    testImplementation(kotlin("test"))
    testImplementation(libs.io.kotlintest.runner.junit5)
    testRuntimeOnly(libs.org.junit.jupiter.engine)
}