package com.yc.operation;

/**
 * 递增递减的使用
 * 关于递增递减运算符在前在后的区别
 *  ->运算符在前, 先计算在显示
 *  ->运算符在后, 先显示再计算
 *
 * @author YangChen
 * @create 2018-01-09 9:01
 */
public class IncreasingDecline {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("++i:\t" + ++i);
        System.out.println("--i:\t" + --i);
        System.out.println("i++:\t" + i++);
        System.out.println("i--:\t" + i--);
    }
}
