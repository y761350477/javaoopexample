package com.yc.date;

import java.text.SimpleDateFormat;

/**
 * Created by Administrator on 2017/8/7 0007.
 */
public class Date {
    public static void main(String[] args) {
//        Date date=new Date();
//        System.out.println(date.toString());
        // 初始化 Date 对象
        java.util.Date date = new java.util.Date();

        // 使用toString()显示日期和时间
        String str = String.format("Current Date/Time : %tc", date);
        System.out.println(str);

        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
        System.out.println(sdf.format(date));
    }
}
