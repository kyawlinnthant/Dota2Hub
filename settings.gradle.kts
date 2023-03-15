@file:Suppress("UnstableApiUsage")
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "Dota2Hub"
include(":app")
include(
    ":core:navigation",
    ":core:theme",
    ":core:model"
)
include(
    ":data:database",
    ":data:network"
)
include(
    ":feature:players",
    ":feature:heros"
)



