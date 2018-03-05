package com.yc.io;

import java.io.*;

/**
 * Created by Administrator on 2017/7/7 0007.
 * 输入流的四种方式
 */
public class InputExample {

    public static void main(String[] args) throws IOException {
//        method1();
        method2();
//        method3();
//        method4();
    }

    /**
     * 问题:
     *  ->结尾处出现乱码
     *
     * @author YC
     * @create 2018/3/5 17:21
     */
    public static void method1() throws IOException {
        File file = new File("C:\\Users\\YC\\Desktop\\测试IO1.txt");
        FileInputStream fileInput = new FileInputStream(file);
        int i = 0;
        byte[] bytes = new byte[1024];
        String data = "";

        while ((i = fileInput.read(bytes)) != -1) {
            data = new String(bytes, 0, i);
        }
        System.out.println(data);
    }

    /**
     * 通过FileInputStream的read(byte[] b)方法来输出显示，不乱码！
     * 关键点：把输入流信息存进byte[]数组之后，通过string s=new String(b),转换成字符串形式，然后输出！
     * （注意：如果txt文件编码格式不是utf-8，依然会出现乱码！）
     *
     * @author YC
     * @create 2018/3/5 17:09
     */
    public static void method2() {
        FileInputStream is = null;
        try {
            is = new FileInputStream("C:\\Users\\YC\\Desktop\\测试IO1.txt");
            byte[] b = new byte[1024];
            int i = 0;
            while ((i = is.read(b)) != -1) {
                String s = new String(b);
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 可以通过InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"UTF-8");的方法来解决乱码问题，如果不使用则乱码！
     * 通过While(i != -1)判断输出的结果，会在信息头部有空格；如果是通过while(inputStreamReader.read())判断则不会出现空格，原因是i是从0开始判断的，第一次输出字符为空格！
     * （注意：如果txt文件编码格式不出utf-8，依然会出现乱码！）
     *
     * @author YC
     * @create 2018/3/5 17:12
     */
    public static void method3() throws IOException {
        File file = new File("C:\\Users\\YC\\Desktop\\测试IO1.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
        int i = 0;

        while (i != -1) {
            System.out.print((char) i);
            i = inputStreamReader.read();
        }
    }

    public static void method4() throws FileNotFoundException {
        FileReader reader = new FileReader("C:\\Users\\YC\\Desktop\\测试IO1.txt");
        int i = 0;
        try {
            while (i != -1) {
                System.out.print((char) i);
                i = reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
