package com.qiao.test;

import java.io.File;
import java.util.Scanner;

public class Test1 {

	/**
	 * @param args
	 * 键盘录入一个文件夹路径,统计该文件夹大小
	 */
	public static void main(String[] args) {
		File dir = getDir();
		System.out.println(getFileLength(dir));
	}
	//从键盘接收一个文件夹路径
	public static File getDir() {
		///创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个文件夹路径:");
		//定义一个无限循环
		while(true) {
			////将接收的内容存储并封装成File对象
			String line = sc.nextLine();
			File dir = new File(line);
			//判断该文件夹路径是否存在
			if(!dir.exists()) {
				System.out.println("您输入的文件夹路径不存在,请重新输入:");
			//判断是否是文件
			} else if(dir.isFile()) {
				System.out.println("您输入的是一个文件,请重新输入:");
			} else {
				//将文件夹路径对象返回
				return dir;
			}
		}
	}
	//统计该文件夹大小
	public static long getFileLength(File dir) {
		//定义求和变量
		long len = 0;
		//获取该文件夹下的所有文件和文件夹listFiles();
		File[] subFiles = dir.listFiles();
		//遍历数组
		for (File subFile : subFiles) {
			//判断是文件就计算大小并累加
			if(subFile.isFile()) {
				len = len + subFile.length();
			//判断是文件夹就递归调用
			} else {
				len = len + getFileLength(subFile);
			}
		}
		return len;
	}
}
