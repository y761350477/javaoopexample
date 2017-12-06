package com.yc.innerclass;

/**
 * 静态内部类的学习
 * 静态内部类： 声明在类中并用static修饰的类
 * 结论：
 *     1、静态内部类只能访问外部类的静态变量；
 *     2、静态内部类中构造内部类的方式为 外部类.内部类 x = new 外部类.内部类；
 *     3、静态内部类中可以声明静态变量，而非静态内部类不可以；
 *
 * @author YangChen
 * @create 2017-12-05 22:38
 */
public class StaticInnerClass {
    private static String out_string = "out_string";

    static class StaticClass {
        private static String name;
        private String address;

        public void getOutParam() {
            System.out.println(out_string);
        }
    }

    public static void main(String[] args) {
        StaticInnerClass.StaticClass staticClass = new StaticInnerClass.StaticClass();
        staticClass.getOutParam();
    }
}
