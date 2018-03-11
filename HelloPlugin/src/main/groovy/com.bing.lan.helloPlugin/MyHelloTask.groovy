package com.bing.lan.helloPlugin

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

/**
 * Created by 蓝兵 on 2018/3/11.
 */

class MyHelloTask extends DefaultTask {


    @TaskAction
    void myHelloTaskOutput() {
        println "-----myHelloTaskOutput()-----"
    }
}