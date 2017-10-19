package com.yc.modify;

/**
 * Created by Administrator on 2017/8/7 0007.
 * 测试同一个包中的各个修饰访问权限
 * 验证结果:
 * 除了private 修饰不能在同一个包中访问，其余的都可以在同一个包中访问;
 *
 * 思考:
 * 1、包里面的嵌套包的情况,访问权限一样吗？
 * 2、如果在IDEA中创建嵌套包？
 * 1、测试结果:
 * 一样的;
 * 2、通过在src目录下创建包.其他包的形式，创建嵌套包;
 */
public class TestDemo {
    public static void main(String[] args) {
        /*正常访问name*/
        TestPublic testPublic = new TestPublic();
        System.out.println(testPublic.name);

        /*正常访问name*/
        TestProtected testProtected = new TestProtected();
        System.out.println(testProtected.name);

        /*正常访问name*/
        TestDefault testDefault = new TestDefault();
        System.out.println(testDefault.name);

        /*拒绝访问name*/
        TestPrivate testPrivate = new TestPrivate();
//        System.out.println(testPrivate.name);
    }
}
