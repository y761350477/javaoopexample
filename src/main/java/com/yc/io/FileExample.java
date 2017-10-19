package com.yc.io;

import java.io.File;

/**
 * Created by Administrator on 2017/7/7 0007.
 * File的常用属性
 */
public class FileExample {
    public static void main(String[] args) {
        File file = new File("I:\\YC录\\yc");

        /**
         * 获取文件名；
         * 获取文件绝对路径；
         * 获取文件的上级名；
         * 判断文件是否存在；
         */
        System.out.println("getFileName:\t"+file.getName());
        System.out.println("getFilePath:\t"+file.getPath());
        System.out.println("getFileParent:\t"+file.getParent());
        System.out.println("getFileExists:\t"+file.exists());

        /**
         * 创建文件夹的方法：
         * mkdir()方法如果没有上级目录，就不创建；
         * mkdirs()方法如果没有上级目录，就都创建；
         */
        System.out.println(file.mkdir());
//        System.out.println(file.mkdirs());
    }
}
