package com.bing.lan.task;

import com.bing.lan.bean.Student
import org.junit.Assert
import org.junit.Test

/**
 * Created by 蓝兵 on 2018/3/9.
 */

class ATest {

    @Test
    fun gradleTest() {
        val student = Student("xiaoming", 12)

        println(student)
        Assert.assertEquals(12, student.age)
        println(student.age)
        println(student.name)
    }
}
