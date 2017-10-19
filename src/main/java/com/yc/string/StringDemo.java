package com.yc.string;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Administrator on 2017/7/7 0007.
 * String字符串切割成String[]的方法
 */
public class StringDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Administrator\\Desktop\\测试肉鸡列表.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        int length = 0;
        String data = "";
        byte[] bytes = new byte[1024];
        /*System.out.println(fileInputStream.read(bytes));有点意思，没想到输出也是执行代码的！第一次执行返回的是66，第二次执行就直接返回-1了，所以下面循环的看不出效果！
        System.out.println(fileInputStream.read(bytes));*/
        while ((length = fileInputStream.read(bytes)) != -1) {
            data = new String(bytes, 0, bytes.length);
            System.out.println(data);
        }

//        String[] str = data.split("\r\n");//txt换行就是\r\n
//        String getData = str[1];
//        System.out.println(getData.trim());//String的trim()方法的作用：去掉字符串首尾空格,防止不必要的空格导致错误
    }
}
