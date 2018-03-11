package com.bing.lan.helloPlugin
/**
 * Created by 蓝兵 on 2018/3/9.
 */

public class Test {
    def x = 30
    def y = 40
    def z = 50

    public static void main(String[] args) {
        new Test().run1()
        new Test().run2()
        new Test().run3()
    }

    def run1() {
        def data = [x: 10, y: 20]
        def cl = { y = x + y + z }
        cl.delegate = data
        cl.resolveStrategy = Closure.OWNER_FIRST
        cl()
        println x
        println y
        println data
//        30
//        70
//        [x:10, y:20]
    }

    def run2() {
        def data = [x: 10, y: 20]
        def cl = { y = x + y + z }
        cl.delegate = data
        cl.resolveStrategy = Closure.DELEGATE_FIRST
        cl()
        println x
        println y
        println data
//        30
//        40
//        [x:10, y:30]
    }

    def run3() {
        def data = [x: 10, y: 20, z: 30]
        def cl = { y = x + y + z }
        cl.delegate = data
        cl.resolveStrategy = Closure.OWNER_ONLY
        cl()
        println x
        println y
        println data
    }
}

