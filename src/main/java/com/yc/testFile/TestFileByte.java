package com.yc.testFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Administrator on 2017/5/5 0005.
 */
public class TestFileByte {
    /**
     * 通过FileInputStream的read(byte[] b)方法来输出显示，不乱码！
     * 关键点：把输入流信息存进byte[]数组之后，通过string s=new String(b),转换成字符串形式，然后输出！
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        FileInputStream is = null;
        try {
            is = new FileInputStream("C:\\Users\\Administrator\\Desktop\\ceshi.txt");
            byte[] b = new byte[1024];
            int i=0;
            while((i=is.read(b))!=-1){
                String s = new String(b);
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
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
}
