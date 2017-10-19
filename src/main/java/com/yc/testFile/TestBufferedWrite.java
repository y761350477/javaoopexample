package com.yc.testFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by Administrator on 2017/5/5 0005.
 */
public class TestBufferedWrite {
    /**
     * 关于BufferedWriter的使用，他是作为一个缓冲流使用，起作用就是高效输出信息！
     * @param args
     */
    public static void main(String[] args) {
        try {
            Writer w = new FileWriter("C:\\Users\\Administrator\\Desktop\\ceshi.txt");
            BufferedWriter bfw = new BufferedWriter(w);
            bfw.write("想念以前的日子，工作之后，一切都是为了生活！");
            bfw.close();//不关闭流的话没法输出上面的语句！
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
