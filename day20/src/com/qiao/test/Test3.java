package com.qiao.test;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test3 {

	/**
	 * 键盘录入的数据拷贝到当前项目下的text.txt文件中去,键盘录入数据当遇到quit时就退出
	 * 
	 * 分析
	 * 1.创建键盘录入对象
	 * 2.创建输出流对象,关联text.txt文件
	 * 3.定义无限循环
	 * 4.遇到quit退出循环
	 * 5.如果不是quit就将内容写出
	 * 6.关闭流
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//1.创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要拷贝内容:");
		//2.创建输出流对象,关联text.txt文件
		FileOutputStream fos = new FileOutputStream("text.txt");
		//3.定义无限循环
		while(true) {
			String line = sc.nextLine();
			//4.遇到quit退出循环
			if("quit".equals(line)) {
				break;
			} 
			//5.如果不是quit就将内容写出
			fos.write(line.getBytes());
			fos.write("\r\n".getBytes());
		}
		//6.关闭流
		fos.close();
	}

}
