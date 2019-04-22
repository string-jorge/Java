package com.qiao.test;

import java.io.File;


/*
 * 判断E盘目录下是否有后缀名为.jpg的文件,如果有,就输出该文件名称
 */
public class Test3 {
	public static void main(String[] args) {
		File dir = new File("E:\\");
		
//		String[] arr = dir.list();				//获取E盘下所有的文件名称或者文件夹名称
//		for (String string : arr) {
//			if(string.endsWith(".jpg")) {
//				System.out.println(string);
//			}
//		}
		
		File[] subFiles = dir.listFiles();		//获取E盘下所有的文件对象或文件夹对象
		
		for (File subFile : subFiles) {
			if(subFile.isFile() && subFile.getName().endsWith(".jpg")) {		//开发用这种
				System.out.println(subFile);
			}
		}
	}
}
