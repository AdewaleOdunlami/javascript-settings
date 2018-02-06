package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*

object JavaScript_01FastTests : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template)
    uuid = "dc1d4b17-244a-4a66-ba1f-9107f0dc2515"
    id = "JavaScript_01FastTests"
    name = "01. Fast Tests"

    params {
        param("Browser", "PhantomJS")
    }
})
