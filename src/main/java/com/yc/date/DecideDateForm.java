package com.yc.date;

import com.yc.string.Str;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 判断字符串日期格式是否满足指定格式条件
 *
 * @author YangChen
 * @create 2017-11-15 14:29
 */

public class DecideDateForm {
    public static boolean isValidDate(String str) {
        boolean convertSuccess = true;
        // 指定日期格式为四位年/两位月份/两位日期，注意yyyy/MM/dd区分大小写；
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try {
            // 设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
            format.setLenient(false);
            format.parse(str);
        } catch (ParseException e) {
            // e.printStackTrace();
            // 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
            convertSuccess = false;
        }

        return convertSuccess;
    }

    public static boolean isValidDate1(String str) {
        boolean convertSuccess = true;
        // 指定日期格式为四位年/两位月份/两位日期，注意yyyy/MM/dd区分大小写；
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        try {
            // 设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
            format.setLenient(false);
            format.parse(str);
        } catch (ParseException e) {
            // e.printStackTrace();
            // 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
            convertSuccess = false;
        }

        return convertSuccess;
    }

    public static void main(String[] args) throws ParseException {
        String testDate = "2016/09/01 21:12:00";
        String getDate = "";
        boolean test = isValidDate(testDate);
        boolean test1 = isValidDate1(testDate);
        if (test || test1) {
            getDate = testDate.replace("/", "-");
            System.out.println(getDate);
        }
    }
}
