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
        outputFile.withPrintWriter {writer ->
            xml.users.each { user ->
                writer.println("${user.name} - ${user.email}")
            }
        }
    }

}
