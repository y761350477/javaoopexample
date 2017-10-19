package com.yc.other;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2017/8/7 0007.
 */
public class RegExample {
    public static void main(String[] args) {
        String num="1234567890";
        String Reg="\\d*";
        Pattern r = Pattern.compile(Reg);//Pattern.compile("传入正则表达式的字符串")
        Matcher m = r.matcher(num);//r.matcher("传入要验证的表达式的字符串")
        System.out.println(m.matches());//Matcher对象的matches()方法；来判断时候满足条件，返回值是boolean!
    }
}
