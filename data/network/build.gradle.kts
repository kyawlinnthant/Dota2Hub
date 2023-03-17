@file:Suppress("UnstableApiUsage")
@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.kapt)
    alias(libs.plugins.hilt)
    alias(libs.plugins.kotlin.serialization)
}
android{
    namespace = "com.kyawlinnthant.network"
    compileSdk = 33
    defaultConfig {
        minSdk = 24
        targetSdk = 33
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        buildConfigField(
            type = "String",
            name = "BASE_URL",
            value = "\"https://api.opendota.com/api/\""
        )
    }
}

dependencies {
    implementation(project(":core:model"))
    implementation(libs.hilt.android)
    implementation(libs.bundles.retrofit)
    kapt(libs.hilt.compiler)
    implementation(libs.kotlinx.serialization.json)
}