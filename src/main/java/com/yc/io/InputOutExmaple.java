package com.yc.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 2017/7/7 0007.
 * JAVA IO流操作
 * 注意： 1、使用流之后要关闭；
 *       2、把异常处理放到主方法中，发生异常，不会执行异常代码之后的代码；
 */
public class InputOutExmaple {

    /**
     * 通过输出流读取数据的方法一；（使用下面的方法，输出的信息头部会有空格；）
     */
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Administrator\\Desktop\\ceui.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");//通过字符流设置读取编码格式
        int i = 0;

        while (i != -1) {
            System.out.print((char) i);
            i = inputStreamReader.read();
        }
        fileInputStream.close();
    }

        /**
         * 通过输入流读取数据的方法二；
         */
    /*public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Administrator\\Desktop\\ceui.txt");
        byte[] bytes = new byte[1024];
        int i = 0;
        String data = null;
        while ((i = fileInputStream.read(bytes)) != -1) {
            data = new String(bytes);
        }
        System.out.println(data);

    }*/

        /**
         * 通过输入流读取数据方法三；
         */
    /*public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Administrator\\Desktop\\ceui.txt");
        int i = 0 ;
        while ((i = fileInputStream.read()) != -1) {
            System.out.print((char) i);
        }
    }*/

        /**
         * 通过输出流写入数据；
         */
    /*public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\YangChen.txt");
        String data = "我是杨晨！";
        byte[] bytes = data.getBytes();
        fileOutputStream.write(bytes);
    }*/

        /**
         * 通过输出流写入数据；
         */
    /*public static void main(String[] args) throws IOException {
        FileWriter wt = new FileWriter("C:\\\\Users\\\\Administrator\\\\Desktop\\\\YangChen.txt");
        wt.write("哈哈");
        wt.close();//关闭流
//        wt.flush();//不关闭流
    }*/

        /**
         * 通过字符流读取数据；
         */
    /*public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\Administrator\\Desktop\\YangChen.txt");
        int i = 0;
        while ((i = fileReader.read()) != -1) {
            System.out.print((char)i);
        }
    }*/

        /**
         * 通过缓冲流来读取数据；
         */
    /*public static void main(String[] args) throws IOException {
//        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Administrator\\Desktop\\YangChen.txt");
        FileReader fileReader = new FileReader("C:\\Users\\Administrator\\Desktop\\YangChen.txt");
//        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int i = 0;
        while ((i = bufferedReader.read()) != -1) {
            System.out.print((char) i);
        }
    }*/

        /**
         * 通过缓冲流来写入数据；
         */
    /*public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Administrator\\Desktop\\YangChen.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\\\Users\\\\Administrator\\\\Desktop\\\\Yang.txt");


    }*/

        /**
         * 通过FileInputStream的read(byte[])的方法读取数据；（也验证了FileReader的read()方法不能读取byte[]数组）
         */
    /*public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\\\Users\\\\Administrator\\\\Desktop\\\\YangChen.txt");
        FileInputStream fileInputStream = new FileInputStream("C:\\\\Users\\\\Administrator\\\\Desktop\\\\YangChen.txt");
        String data = "";
        byte[] bytes = new byte[1024];
        int length = 0;
        while ((length = fileInputStream.read(bytes)) != -1) {
            data = new String(bytes,0,bytes.length);
        }
        System.out.println(data);
    }*/

        /**
         * 文件复制的操作
         */
    /*public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\\\Users\\\\Administrator\\\\Desktop\\\\YangChen.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\Yang.txt");
        byte[] bytes = new byte[1024];
        String data = "";
        int length = 0;
        while ((length = fileInputStream.read(bytes)) != -1) {
            fileOutputStream.write(bytes,0,bytes.length);
        }
    }*/


    }
