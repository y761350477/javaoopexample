package com.yc.innerclass;

/**
 * 局部内部类的学习
 * 局部内部类： 声明在局部方法中的类
 *
 * @author YangChen
 * @create 2017-12-05 22:50
 */
public class PartOuterClass {
    private String name = "测试局部内部类访问外部类的成员变量";

    public void show() {
        class PartClass {
            private int x = 0;

            public void show(int x) {
                int xx = 0;
                System.out.println(name);
                System.out.println(x);
                System.out.println(xx);
            }
        }

        PartClass partClass = new PartClass();
        partClass.show(1);
    }

    public static void main(String[] args) {
        PartOuterClass partOuterClass = new PartOuterClass();
        partOuterClass.show();
    }
}
