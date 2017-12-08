package com.yc.genericity;

public class UsingGenericity {
    public static <T> T batter(T t) {
        return t;
    }

    public static void main(String[] args) {
        String a = "1";
        System.out.println("------YC------batter(a)的值 = " + batter(a) + ", " + "当前类 = UsingGenericity, 当前方法 = main;");
    }
}
