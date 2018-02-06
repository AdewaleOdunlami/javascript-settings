package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object JavaScript_Template : Template({
    uuid = "630f1501-47c9-4615-879d-fe41591b6312"
    id = "JavaScript_Template"
    name = "Template"

    vcs {
        root(JavaScript.vcsRoots.JavaScript_HttpsGithubComG0t4teamcityCourseCards)

    }

    steps {
        script {
            name = "Restore NPM Packages"
            id = "RUNNER_5"
            scriptContent = "npm install"
        }
        script {
            name = "Browser Integrated Tests"
            id = "RUNNER_6"
            scriptContent = "npm test -- --single-run --browsers %Browser% --colors false --reporters teamcity"
        }
        stepsOrder = arrayListOf("RUNNER_5", "RUNNER_6")
    }

    triggers {
        vcs {
            id = "vcsTrigger"
        }
    }
})
