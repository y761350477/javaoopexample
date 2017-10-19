package com.yc.string;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DecideString {
    public static Date strToDateLong(String strDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ParsePosition pos = new ParsePosition(0);
        Date strtodate = formatter.parse(strDate, pos);
        return strtodate;
    }

    public static void main(String[] args) {
        String a = "未评价";
        String b = "未评价";
        System.out.println("------YC------a.contains(b)的值 = " + b.contains(a) + ", " + "当前类 = DecideString, 当前方法 = main;");
        Date date = strToDateLong("2017-10-12 13:24:23");
        long time = date.getTime();
        System.out.println(date);
        System.out.println(time);
    }

}
