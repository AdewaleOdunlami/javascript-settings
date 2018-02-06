package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*

object JavaScript_02Edge : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template)
    uuid = "javascript_02Edge"
    id = "JavaScript_02Edge"
    name = "02. Microsoft Edge"

    params {
        param("Browser", "Edge")
    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_01FastTests) {
            snapshot {
            }
        }
    }
})
