package ca.six.gradles.me

import org.gradle.api.Plugin
import org.gradle.api.Project

class SecondPlugin: Plugin<Project> {
    override fun apply(project: Project) {
        project.task("s5") {
            doLast {
                println("szw s5 task done")
            }
        }
    }
}