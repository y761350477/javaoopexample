package com.yc.test_string;

/**
 * 测试String为空字符串的问题
 * Sting不等于空字符串的三种比较思路:
 * String对象使用equals()方法与空字符串""比较;
 * 空字符串""使用equals()方法与String对象比较;
 * 根据String对象的字符串长度不等于0来比较;
 *
 * @author YangChen
 * @create 2017-12-29 23:27
 */
public class StingIsEmpty {
    public static void main(String[] args) {
        String a = null;

        // 最安全的方案, 防止异常发生
        if (!"".equals(a)) {
            System.out.printf("a的值为空!");
        }

        // 发生异常
        if (!a.equals("")) {
            System.out.println("a的值为空!");
        }

        // 发生异常
        if (a.length() != 0) {
            System.out.println("a的值为空!");
        }
    }
}
