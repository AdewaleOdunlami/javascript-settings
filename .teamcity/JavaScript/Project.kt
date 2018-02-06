package JavaScript

import JavaScript.buildTypes.*
import JavaScript.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "383f8572-f241-4790-a6bc-bbcb605a7b75"
    id = "JavaScript"
    parentId = "_Root"
    name = "JavaScript"

    vcsRoot(JavaScript_HttpsGithubComG0t4teamcityCourseCards)

    buildType(JavaScript_03DeployToStaging)
    buildType(JavaScript_02Chrome)
    buildType(JavaScript_02Firefox)
    buildType(JavaScript_01FastTests)

    template(JavaScript_Template)

    features {
        versionedSettings {
            id = "PROJECT_EXT_2"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = "HttpsGithubComAdewaleOdunlamiJavascriptSettingsGit"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
