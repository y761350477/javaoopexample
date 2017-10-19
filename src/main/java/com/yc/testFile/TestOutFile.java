package com.yc.testFile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by Administrator on 2017/5/5 0005.
 */
public class TestOutFile {
    public static void main(String[] args) {
        OutputStream os = null;
        try {
//            String s = "再一次！nihs";
            os = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\YangChen.txt");
//            byte[] b = s.getBytes();
//            os.write(b);
            for (int i = 0; i < 500; i++) {
                String s = "172.16.102."+i+";\r\n";
                byte[] b = s.getBytes();
                os.write(b);
            }
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
