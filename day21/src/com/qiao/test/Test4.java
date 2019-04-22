package com.qiao.test;

import java.io.File;
import java.util.Scanner;

public class Test4 {

	/**
	 * 从键盘输入接收一个文件夹路径,打印出该文件夹下所有的.java文件名
	 * 
	 * 分析:
	 * 从键盘接收一个文件夹路经
	 * 1.如果录入的是不存在,请给予提示
	 * 2.如果是录入的是文件路径,给予提示
	 * 3.如果是文件夹路径,直接返回
	 * 
	 * 打印出该文件下所有的.java文件名
	 * 1.获取到该文件夹路径下的所有的文件和文件夹,存储在File数组中
	 * 2.遍历数组,对每个文件或者文件夹做判断
	 * 3.如果是文件,并且后缀是.java的,就打印
	 * 4.如果是文件夹,就递归调用
	 */
	public static void main(String[] args) {
		File dir = getDir();		//获取到文件夹路径
		printJavaFile(dir);
	}
	//从键盘接收一个文件夹路经,如果是文件夹路径就返回
	public static File getDir() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个文件夹路径:");
		while(true) {
			String line = sc.nextLine();
			File dir = new File(line);
			if(!dir.exists()) {
				System.out.println("您输入的文件夹不存在,请重新输入!");
			} else if(dir.isFile()){
				System.out.println("您输入的是一个文件,请重新输入!");
			} else {
				return dir;
			}
		}
	}
	
	public static void	printJavaFile(File dir) {
		// 1.获取到该文件夹路径下的所有的文件和文件夹,存储在File数组中
		File[] subFiles = dir.listFiles();
		// 2.遍历数组,对每个文件或者文件夹做判断
		for (File subFile : subFiles) {
			// 3.如果是文件,并且后缀是.java的,就打印
			if(subFile.isFile() && subFile.getName().endsWith(".java")) {
				System.out.println(subFile);
			// 4.如果是文件夹,就递归调用
			} else if(subFile.isDirectory()) {
				printJavaFile(subFile);
			}
		}
		
		
	}
}
