package ca.six.lib

import org.gradle.api.Plugin
import org.gradle.api.Project

class MidPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        // extensions即ExtensionContainer getExtensions()方法. 是总的extension集合.
        project.extensions.create("mid", MidExtension) //最后一参实为MidExtension.class

        project.task('midTask') {
            doLast {
                println "midTask : valueFromExtension = ${project.mid.midKey}"
            }
        }
    }
}
