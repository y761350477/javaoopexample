package com.yc.modifytest;

/**
 * Created by Administrator on 2017/8/7 0007.
 * 测试protected和default的子孙类访问的权限;
 * 测试结果:
 * Protected修饰的父类就算不在同一个包中，也是可以正常访问的，
 * 而default修饰的父类在不同的包中，是不能拒绝访问的;
 * 注:如果多个包中有同样的父类，需要在前面加上报名以作区分，不然的话，默认的是继承同一个包中的父类,即同一包中的优先级更高;
 */
public class TestDemo extends modify.TestProtected{
    void sayHello() {
        this.testPublic();
    }
}
