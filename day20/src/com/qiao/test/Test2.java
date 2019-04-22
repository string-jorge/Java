package com.qiao.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test2 {

	/**
	 * 在控制台录入文件的路径,将文件拷贝到当前项目下
	 * 
	 * 1.定义方法对键盘录入的路径进行判断,如果是文件就返回
	 * 2.在主方法中接收该文件
	 * 3.读和写该文件
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File file = getFile();			//获取File(文件)对象
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file.getName()));
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		bis.close();
		bos.close();
	}
	public static File getFile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个文件:");
		while(true) {
			String line = sc.nextLine();
			File file = new File(line);
			if(!file.exists()) {								//判断是否是目录
				System.out.println("您输入的不是文件,请重新录入:");
			} else if (file.isDirectory()) {					//判断是否是文件夹
				System.out.println("你输入的是一个文件夹,请重新录入:");
			} else {
				return file;
			}
		}
	}
}
