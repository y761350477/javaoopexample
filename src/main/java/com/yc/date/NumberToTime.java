package com.yc.date;

/**
 * 把"(数字)秒"转换为"天-时-分-秒"
 *
 * @author YangChen
 * @create 2017-12-26 18:13
 */
public class NumberToTime {
    // a integer to xx:xx:xx
    public static String secToTime(int time) {
        String timeStr = null;
        int day = 0;
        int hour = 0;
        int minute = 0;
        int second = 0;

        if (time <= 0) {
            return "0秒";
        } else {
            minute = time / 60;
            if (minute < 60) {
                second = time % 60;
                if (minute == 0) {
                    timeStr = second + "秒";
                } else {
                    timeStr = minute + "分" + second + "秒";
                }

            } else {
                hour = minute / 60;
                if (hour > 24) {
                    day = hour / 24;
                    time = time - day * 86400;
                    hour = time / 3600;
                    minute = time / 60;
                    minute = minute % 60;
                    second = time - hour * 3600 - minute * 60;
                    timeStr = day + "天" + hour + "小时" + minute + "分" + second + "秒";
                } else {
                    minute = minute % 60;
                    second = time - hour * 3600 - minute * 60;
                    timeStr = hour + "小时" + minute + "分" + second + "秒";
                }
            }
        }
        return timeStr;
    }

    public static String unitFormat(int i) {
        secToTime(10);
        String retStr = null;
        if (i >= 0 && i < 10) {
            retStr = "0" + Integer.toString(i);
        } else {
            retStr = "" + i;
        }
        return retStr;
    }

    public static void main(String[] args) {
        String testStr = "1900045";
        int getValue = Integer.parseInt(testStr);
        System.out.println(getValue);
        System.out.println(secToTime(1900045));
        System.out.println(unitFormat(121));
    }


}

class extract {

    private int anInt;
    private int anInt1;

    public void method() {
        anInt1 = 10;
        int one = 1;
        int two = 2;
        int three = one + two;
        int four = one + three;
    }


    public boolean test() {
        return 10 > 10;
    }



}
