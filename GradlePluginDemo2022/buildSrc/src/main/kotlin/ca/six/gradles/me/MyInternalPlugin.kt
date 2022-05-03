package ca.six.gradles.me

import org.gradle.api.Plugin
import org.gradle.api.Project

class MyInternalPlugin: Plugin<Project>  {
    override fun apply(project: Project) {
        project.task("s4") {
            doLast{
                println("szw << s4 task")
            }
        }
    }
}