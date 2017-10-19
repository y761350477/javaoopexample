package com.yc.setdate;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/23 0023.
 */
public class SetDate {
    public static void main(String[] args) {
        //把主机日期设置成：年/月/日 时/分/秒 的方法
        SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd HH:mm:ss");
        Date date=new Date();
        System.out.println(sdf.format(date));
        InetAddress localhost = null;
        try {
            localhost = InetAddress.getLocalHost();

        } catch (UnknownHostException e) {
            e.printStackTrace();
            System.out.println("出错！未能获取到IP");
        }
        System.out.println ("localhost: "+localhost.getHostAddress());
        System.out.println ("localhost: "+localhost.getHostName());
        Map<String,String> map;

        String file = "D:\\exceptionTest.txt";
        FileReader reader;
        try {
            reader = new FileReader(file);
            Scanner in = new Scanner(reader);
            String string = in.next();
            System.out.println(string + "不知道我有幸能够执行到不.....");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("对不起,你执行不到...");
        }
        finally{
            System.out.println("finally 在执行...");
        }
        System.out.println("程序虽然抛出异常之后，还是可以继续执行的！");
    }
}
