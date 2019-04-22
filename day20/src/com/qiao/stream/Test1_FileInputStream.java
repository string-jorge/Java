package com.qiao.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test1_FileInputStream {

	/**
	 * @throws IOException 
	 * read()方法读取的是一个字节,为什么返回值是int,而不是byte
	 * 因为11111111是-1的二进制
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		FileInputStream fis = new FileInputStream("xxx.txt");//创建流对象,开启流
		int b;
		while((b = fis.read()) != -1) {
			System.out.println(b);
		}
		fis.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");//创建流对象,开启流
		int x = fis.read();				//从硬盘上读取一个字节
		System.out.println(x);
		int y = fis.read();
		System.out.println(y);
		int z = fis.read();
		System.out.println(z);
		int a = fis.read();
		System.out.println(a);
		int b = fis.read();
		System.out.println(b);
		fis.close();					//关流释放资源
	}

}
