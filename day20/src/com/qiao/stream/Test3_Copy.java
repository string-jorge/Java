package com.qiao.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3_Copy {
	
	public static void main(String[] args) throws IOException {
		//demo1();
		//demo2();
		//第二种拷贝,不推荐使用,因为有可能导致内存溢出
		FileInputStream fis = new FileInputStream("张紫豪 - 可不可以.mp3");
		FileOutputStream fos = new FileOutputStream("copy.mp3");
		
		/*int length = fis.available();
		System.out.println(length);*/
		
		byte[] arr = new byte[fis.available()];		//创建与文件一样大小的
		fis.read(arr);								//将文件上的字节数读取到内存
		fos.write(arr);								//将字节数组中的字节数据写到文件上

		fis.close();
		fos.close();
	}
	//第一种copy,读写效率低,开发不推荐使用
	private static void demo2() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("张紫豪 - 可不可以.mp3");
		FileOutputStream fos = new FileOutputStream("copy.mp3");
		int b;
		while((b = fis.read()) != -1) {					//读取字节效率低
			fos.write(b);
		}
		fis.close();
		fos.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("head.png");
		FileOutputStream fos = new FileOutputStream("copy.png");
		int b;
		while((b = fis.read()) != -1) {
			fos.write(b);
		}
		fis.close();
		fos.close();
	}

}
