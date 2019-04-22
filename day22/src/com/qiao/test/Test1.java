package com.qiao.test;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test1 {

	/**
	 * @param args
	 * @throws IOException 
	 * 定义一个文件输入流,调用read(byte[] b)方法,将a.txt文件中的内容打印出来(byte数组大小限制为5)
	 * 
	 * 分析:
	 * 1.read(byte[] b)是字节流输入的方法,创建FileInputStream,关联a.txt
	 * 2.创建内存输出流,将读到的数据写到内存输出流中
	 * 3.创建字节数组,长度为5
	 * 4.将内存输出流的数去全部转换为字符串打印
	 * 5.关闭流
	 */
	public static void main(String[] args) throws IOException {
		//1.read(byte[] b)是字节流输入的方法,创建FileInputStream,关联a.txt
		FileInputStream fis = new FileInputStream("a.txt");
		//2.创建内存输出流
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		//3.创建字节数组,长度为5
		byte[] arr = new byte[5];
		int len;
		while((len = fis.read(arr)) != -1) {
			//将读到的数据写到内存输出流中
			baos.write(arr,0,len);
		}
		//4.将内存输出流的数去全部转换为字符串打印
		System.out.println(baos.toString());
		//5.关闭流
		fis.close();
		baos.close();					//关闭无效,可以不关
	}

}
