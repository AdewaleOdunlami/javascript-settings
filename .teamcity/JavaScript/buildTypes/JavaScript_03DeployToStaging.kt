package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*

object JavaScript_03DeployToStaging : BuildType({
    uuid = "31754e2a-a07d-4a9c-8b09-8bfd78a04e2e"
    id = "JavaScript_03DeployToStaging"
    name = "03. DeployToStaging"

    vcs {
        root(JavaScript.vcsRoots.JavaScript_HttpsGithubComG0t4teamcityCourseCards)

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
        dependency(JavaScript.buildTypes.JavaScript_02Edge) {
            snapshot {
            }
        }
    }
})
