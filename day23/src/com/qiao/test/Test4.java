package com.qiao.test;

import java.io.File;

public class Test4 {
	/*
	 * 从键盘接收一个文件夹路径,把文件夹中的所有文件以及文件夹的名字按层级打印,例如:
	 * 把文件夹中的所有文件以及文件夹的名字按层级打印
	 * 
	 * 分析:
	 * 1.获取所有的文件和文件夹,返回File数组
	 * 2.遍历
	 * 3.无论是文件还是文件夹,都与要直接打印
	 * 4.如果是文件夹,就递归调用
	 */
	public static void main(String[] args) {
		File dir = Test1.getDir();
		printFile(dir,0);
	}
	public static void printFile(File dir,int lev) {
		//获取所有的文件和文件夹,返回File数组
		File[] subFiles = dir.listFiles();
		//遍历
		for (File subFile : subFiles) {
			for (int i = 0; i <= lev; i++) {
				System.out.print("\t");
			}
			//无论是文件还是文件夹,都与要直接打印
			System.out.println(subFile);
			//如果是文件夹,就递归调用
			if(subFile.isDirectory()) {
				printFile(subFile,lev + 1);
			}
		}
	}
}
