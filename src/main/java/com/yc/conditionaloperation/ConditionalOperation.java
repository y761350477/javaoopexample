package com.yc.conditionaloperation;

/**
 * Created by Administrator on 2017/8/7 0007.
 * 条件运算符的使用:
 * variable x = (expression) ? value if true : value if false;
 */
public class ConditionalOperation {
    public static void main(String[] args) {
        int num = 10;
        int testNum = num > 0 ? 11 : 1;
        System.out.println(testNum);
    }
}
