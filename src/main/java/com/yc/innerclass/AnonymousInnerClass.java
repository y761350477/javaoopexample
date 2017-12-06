package com.yc.innerclass;

/**
 * 匿名内部类的学习
 *
 * @author YangChen
 * @create 2017-12-05 21:23
 */
public class AnonymousInnerClass {

    public static void main(String[] args) {
        OuterI outerI = new OuterI() {
            public void show() {
                System.out.println("匿名内部类");
            }
        };
        outerI.show();

        FatherC fatherC = new FatherC() {
            @Override
            public void show() {
                System.out.println("子类的方法");
            }
        };
        fatherC.show();
    }
}

interface OuterI {

    public void show();
}

class SonI implements OuterI {

    public void show() {
        System.out.println("OuterI子类的方法");
    }
}

class FatherC {

    public void show() {
        System.out.println("父类的方法");
    }
}

