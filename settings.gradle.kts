pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}

rootProject.name = "PvPLiteServer"
include("PvPLite-API", "PvPLite-Server")
