package com.yc.innerclass;

/**
 * 内部类(成员内部类)的学习使用
 * 成员内部类： 声明在类(外部类)中的类(内部类)
 * 结论：
 *     1、内部类的方法可以调用外部类的私有属性；
 *     2、外部类的方法中可以通过new内部类后调用内部类的方法；
 * @author YangChen
 * @create 2017-12-05 20:45
 */
public class OuterClass {

    /*
     * 内部类： 在一个类内部的类；
     * 外部类： 包含内部类的类；
     * 内部类的调用： 内部类可以看作是外部类的成员变量或者是方法，所以通过 外部类.内部类 x = 外部类的引用对象.new 内部类() 来构造内部类;
     */
    private String out_string = "这是外部类的私有属性： out_string";

    /* 外部类的方法中调用内部类的方法*/
    public void useInnerClass() {
        InnerClass innerClass = new InnerClass();
        innerClass.print();
    }

    /* 内部类的创建*/
    class InnerClass {
        public void print() {
            System.out.println(out_string);
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.useInnerClass();

        // 构造内部类的方法
        OuterClass.InnerClass innerClass = (outerClass).new InnerClass();
        innerClass.print();
    }

}
