package com.yc.thread;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Administrator on 2017/7/6 0006.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Administrator\\Desktop\\测试肉鸡列表.txt");
        FileInputStream fileInput = new FileInputStream(file);
        int len = 0;
        byte[] buf = new byte[1024];
        String a = "";
        while ((len = fileInput.read(buf)) != -1) {
            String b = new String(buf, 0, len);
            a = a + b;
        }
        String[] str = a.split("\n");
        System.out.println(str.length);
        System.out.println(a.length());
        System.out.println(str[1]);
    }
}
