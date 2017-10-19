package com.yc.testFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFile {
	/**
	 * 思考如何生成文件，而不是文件夹？
	 * 验证结果是File对象的mkdirs会创建多个文件夹，而输出流会自动创建目标文件！
	 * @param args
	 */
	public static void main(String[] args) {
		File f=new File("C:\\Users\\Administrator\\Desktop\\nihs.txt");
//		File f1=new File("C:\\Users\\Administrator\\Desktop");
//		if(!f1.exists()){
//			f1.mkdirs();
//		}
		try {
			BufferedWriter bfw=new BufferedWriter(new FileWriter("C:\\Users\\Administrator\\Desktop\\ce.txt"));
			bfw.write("再一次！HelloWorld");
			bfw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
