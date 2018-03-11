package com.bing.lan.helloPlugin

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by 蓝兵 on 2018/3/9.
 */
//apply plugin: HelloPlugin
//helloExt.message = 'Hi,this from configure Gradle message.'

class HelloPlugin implements Plugin<Project> {

    void apply(Project project) {

        project.extensions.create("helloExt", HelloPluginExtension)

        def hello = project.task('helloTask') {
            println "-----message-----" + project.helloExt.name
            println "-----message1-----" + project.helloExt.age

            println "-----helloExt-----" + project.extensions.findByName("helloExt")

        }

        hello << {
            println "-----hello doLast()-----"
            println "-----message-----" + project.helloExt.name
            println "-----message1-----" + project.helloExt.age
            println "-----hello doLast()-----"
        }

        project.task('myHelloTask', type: MyHelloTask) {
            println "-----myHelloTask closure()-----"

        }


    }
}

