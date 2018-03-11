package com.bing.lan.app

import com.bing.lan.bean.Student
import com.bing.lan.helloPlugin.HelloPlugin

/**
 * Created by 蓝兵 on 2018/3/9.
 */
fun main(args: Array<String>) {
    val student = Student("xiaoming", 12)

    println(student)
    println(student.age)
    println(student.name)

    HelloPlugin()

}

