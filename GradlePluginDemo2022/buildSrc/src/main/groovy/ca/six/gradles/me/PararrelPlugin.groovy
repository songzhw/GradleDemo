package ca.six.gradles.me

import org.gradle.api.Plugin
import org.gradle.api.Project;

class PararrelPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        println "this is songzhw's G3 plugin"

        project.task("s3") {
            doLast {
                println "songzhw s3"
            }
        }
    }
}