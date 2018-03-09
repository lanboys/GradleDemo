package com.bing.lan.bean

import com.bing.lan.app.MyLogger

/**
 * Created by 蓝兵 on 2018/3/9.
 */
class Student {
    var name = null;
    var age = null;
    override fun toString(): String {
        MyLogger.i("Student", "name: $name")
        MyLogger.i("Student", "age: $age")
        return "Student(name=$name, age=$age)"
    }

}