package com.bing.lan.helloPlugin
/**
 * Created by 蓝兵 on 2018/3/9.
 */
class SubClosureTest extends Closure {

    SubClosureTest(Object owner, Object thisObject) {
        super(owner, thisObject)
    }

    SubClosureTest(Object owner) {
        super(owner)
    }


    public Object doCall(Object... args) {

        return call(args);
    }

}