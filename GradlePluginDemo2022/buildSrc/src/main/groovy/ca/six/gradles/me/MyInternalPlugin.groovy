package ca.six.gradles.me

import org.gradle.api.Plugin
import org.gradle.api.Project;

class MyInternalPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        println "this is songzhw's G2 plugin"

        project.task("s2") {
            doLast {
                println "songzhw s2"
            }
        }
    }
}