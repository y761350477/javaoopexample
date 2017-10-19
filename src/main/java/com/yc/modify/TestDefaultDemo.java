package com.yc.modify;

/**
 * Created by Administrator on 2017/8/7 0007.
 * 测试结果:
 * default修饰的，在同一个包中，子孙类中也是可以正常访问的;
 */
public class TestDefaultDemo extends TestDefault{
    void sayHello() {
        this.testPublic();
    }
}
