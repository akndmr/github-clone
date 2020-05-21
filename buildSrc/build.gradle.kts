plugins {
    `java-gradle-plugin`
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}

repositories {
    google()
    jcenter()
    mavenCentral()
    maven { url = uri("https://plugins.gradle.org/m2/") }
}

object PluginsVersions {
    const val GRADLE_ANDROID = "3.6.3"
    const val KOTLIN = "1.3.72"
    const val DETEKT = "1.2.2"
}


dependencies {
    implementation("com.android.tools.build:gradle:${PluginsVersions.GRADLE_ANDROID}")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${PluginsVersions.KOTLIN}")
    implementation("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:${PluginsVersions.DETEKT}")
}