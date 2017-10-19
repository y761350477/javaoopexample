package com.yc.testFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Administrator on 2017/5/5 0005.
 */
public class TestReader {
    /**
     * 通过FileReader来实现中文信息不乱码的操作！
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        FileReader reader = new FileReader("C:\\Users\\Administrator\\Desktop\\YangChen.txt");
        int i = 0;
        try {
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(reader!=null)
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
