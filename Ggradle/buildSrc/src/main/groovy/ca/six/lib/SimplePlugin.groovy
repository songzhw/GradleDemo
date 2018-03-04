package ca.six.lib

import org.gradle.api.Plugin
import org.gradle.api.Project

class SimplePlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        // 新增一个插件
        project.task("simpleTask") {
            doLast {
                println "SimplePlugin SimpleTask : ${project.gradle.gradleVersion}  -- ${project.gradle.gradleHomeDir.getPath()} "
            }
        }
    }
}
//=> SimplePlugin SimpleTask : C:\Users\songzhw\.gradle\wrapper\dists\gradle-4.0-all\ac27o8rbd0ic8ih41or9l32mv\gradle-4.0 4.0

// 每次改动SimplePlugin, 不用重新build. 在gradlew simpleTask时会自动去看plugin是否改动了

// 另外, 注意, 这里没有写resource文件, 指明plugin在哪哦. 看来是import代替了这块.