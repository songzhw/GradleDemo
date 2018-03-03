package ca.six.lib

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction

class ReaderTask extends DefaultTask{
    @InputFile File sourceFile
    @OutputFile File outputFile

    @TaskAction
    def convertFile(){
        def xml = new XmlSlurper().parse(sourceFile)
        println "szw 01 $xml"
        outputFile.withPrintWriter {writer ->
            println "szw 02 ${xml.user}"
            xml.user.each { ur ->
                writer.println("${ur.name} - ${ur.email}")
            }
        }
    }

}
