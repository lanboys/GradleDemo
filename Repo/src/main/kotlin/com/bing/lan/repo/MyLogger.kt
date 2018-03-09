package com.bing.lan.app

/**
 * Created by 蓝兵 on 2018/3/9.
 */


open class MyLogger {


    //    伴生对象
    companion object {
        fun i(tag: String, info: String) {
            println(">>>$tag>>>: $info")
        }

        fun d(tag: String, info: String) {
            println(">>>$tag>>>: $info")
        }
    }
}


