package ca.six.gradles.me

import com.github.kittinunf.fuel.httpGet
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

open class MyInternalTask : DefaultTask() {

    @TaskAction
    fun callBackend() {
        // 拿到extension实例
        val ext = project.extensions.getByType(MyInternalExtension::class.java) // "project"来自DefaultTask中

        // fuel三方库, 用来Http请求
        "http://192.168.2.246:8899/info?id=${ext.id}"
            .httpGet()
            .responseString{req, resp, result ->
                println(result.get())
            }
    }
}