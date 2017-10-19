package com.yc.testFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Administrator on 2017/5/5 0005.
 */
public class CopyFlie {
        /*
        * 创建一个通用的复制方法，来实现输入一个源文件路径，输入到另一个生成文件路径位置！*/

    public static void copyFile(File fromFile, File toFile) throws IOException {
        FileInputStream ins = new FileInputStream(fromFile);
        FileOutputStream out = new FileOutputStream(toFile);
        byte[] b = new byte[1024];
//        ins.read(b);从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中。然后让FileOutputStream使用write方法来获取！
        int n = 0;
        while ((n = ins.read(b)) != -1) {
            System.out.print(n+"\t");
            out.write(b, 0, b.length);
        }

        ins.close();
        out.close();
    }
}

