package com.yc.operation;

import java.util.Random;

/**
 * 生成随机数
 *
 * @author YangChen
 * @create 2018-01-09 9:39
 */
public class GenerateRandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int randNumber = rand.nextInt(1000 + 1) + 15000;
        System.out.println(randNumber);
    }
}
