package ca.six.gradles.me

import com.github.kittinunf.fuel.httpGet
import org.gradle.api.Plugin
import org.gradle.api.Project

class MyInternalPlugin: Plugin<Project>  {
    override fun apply(project: Project) {
        // 注册extension, 其实就是由用户来提供数据
        project.extensions.create("myBackend", MyInternalExtension::class.java)
        // 注册一个新task, 提供name与具体干活的class
        project.tasks.register("fuelCall", MyInternalTask::class.java)
    }
}