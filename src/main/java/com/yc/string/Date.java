package com.yc.string;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 计算两个日期的时间差
 *
 * @author YangChen
 * @create 2017-11-13 9:55
 */

public class Date {
    public static void main(String[] args) throws ParseException {
       /* String str = "2014-07-09 10:48:23";
//        Date d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str);

        java.util.Date d = new SimpleDateFormat("yyyy-MM-dd").parse(str);
//        String dateString = formatter.format(str);
//        System.out.println(dateString);

        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
        System.out.println(sdf.format(str));*/

        String str = "2014-07-09";
        java.util.Date d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String test = sdf.format(d);
        System.out.println(sdf.format(d));
        System.out.println(d);
    }
}
