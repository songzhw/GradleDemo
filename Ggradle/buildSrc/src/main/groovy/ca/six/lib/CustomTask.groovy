package ca.six.lib

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class CustomTask extends DefaultTask {
    def prefix = 'buildSrc'

    @TaskAction
    def act() {
        println "SecondTask [$prefix] $project.gradle.gradleVersion"
    }
}

