package com.yc.testFile;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by Administrator on 2017/5/5 0005.
 */
public class TestWrite {
    public static void main(String[] args) throws IOException {
        Writer w=new FileWriter("C:\\Users\\Administrator\\Desktop\\ceshi.txt");
        w.write("我是杨晨，我以后要更加努力的生活！做到有技术，有思想，有能力，稳重大方，知难而上的成熟人士！");
        w.close();//不关闭流的话没法输出上面的语句！
    }
}
