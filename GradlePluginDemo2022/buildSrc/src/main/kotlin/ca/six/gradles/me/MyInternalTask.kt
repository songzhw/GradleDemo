package ca.six.gradles.me

import com.github.kittinunf.fuel.httpGet
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class MyInternalTask : DefaultTask() {

    @TaskAction
    fun callBackend() {
        // fuel三方库, 用来Http请求
        "http://192.168.2.246:8899/info?id=21"
            .httpGet()
            .responseString{req, resp, result ->
                println(result.get())
            }
    }
}