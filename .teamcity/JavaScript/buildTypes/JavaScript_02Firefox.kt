package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*

object JavaScript_02Firefox : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template)
    uuid = "9a49cab7-1799-4c71-8f47-9112b4fbbe40"
    id = "JavaScript_02Firefox"
    name = "02. Firefox"

    params {
        param("Browser", "Firefox")
    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_01FastTests) {
            snapshot {
            }
        }
    }
})
