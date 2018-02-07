package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object JavaScript_03DeployToStaging : BuildType({
    uuid = "31754e2a-a07d-4a9c-8b09-8bfd78a04e2e"
    id = "JavaScript_03DeployToStaging"
    name = "03. DeployToStaging"

    vcs {
        root(JavaScript.vcsRoots.JavaScript_HttpsGithubComG0t4teamcityCourseCards)

    }

    steps {
        script {
            name = "IIS Deploy"
            id = "RUNNER_5"
            scriptContent = """
                xcopy /S /I /Y /R "C:\BuildAgent\work\1dd1c8ec653ef30a\app" "C:\inetpub\wwwroot"
                """
        }
    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_02Chrome) {
            snapshot {
            }
        }
        dependency(JavaScript.buildTypes.JavaScript_02Firefox) {
            snapshot {
            }
        }
    }

    triggers {
        vcs {
            id = "vcsTrigger"
        }
    }
})
