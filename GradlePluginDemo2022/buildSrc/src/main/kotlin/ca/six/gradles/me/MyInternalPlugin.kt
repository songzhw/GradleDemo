package ca.six.gradles.me

import com.github.kittinunf.fuel.httpGet
import org.gradle.api.Plugin
import org.gradle.api.Project

class MyInternalPlugin: Plugin<Project>  {
    override fun apply(project: Project) {
        project.task("s4") {
            doLast{
                "http://192.168.2.246:8899/info?id=11"
                    .httpGet()
                    .responseString{req, resp, result ->
                        println(result.get())
                    }
            }
        }
    }
}