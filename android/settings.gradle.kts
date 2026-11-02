pluginManagement {
    def repositoryHandler = {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    repositories repositoryHandler
}

plugins {
    id("dev.flutter.flutter-plugin-loader") version "1.0.0"
    id("com.android.application") version "8.2.1"
    id("org.jetbrains.kotlin.android") version "1.9.20" apply false
}

include(":app")
