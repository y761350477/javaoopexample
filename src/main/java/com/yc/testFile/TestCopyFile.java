package com.yc.testFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2017/5/5 0005.
 */
public class TestCopyFile {
    public static void main(String[] args) throws IOException {
        CopyFlie.copyFile(new File("C:\\Users\\Administrator\\Desktop\\nihs.jpg"),new File("C:\\Users\\Administrator\\Desktop\\hk.jpg"));
    }
}
