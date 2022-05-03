package ca.six.gradles.me

import com.github.kittinunf.fuel.Fuel
import org.gradle.api.Plugin
import org.gradle.api.Project;

class MyInternalPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        Fuel.get("192.168.2.246:8899/info?id=12")
            .responseString{ req, resp, result ->

            }
    }
}