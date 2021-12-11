pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}

rootProject.name = "PvPLite-Server"
include("PvPLite-API", "PvPLite-Server")
