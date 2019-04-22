package com.qiao.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test7_TryFinally {

	/**
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		//1.7版本流的标准处理处理异常代码
		try(
			FileInputStream fis = new FileInputStream("xxx.txt");
			FileOutputStream fos = new FileOutputStream("yyy.txt");
			MyClose mc = new MyClose();
		){
			int b;
			while((b = fis.read()) != -1) {
			fos.write(b);
			}
		}
	}

	private static void demo1() throws FileNotFoundException, IOException {
		//1.6版本流的标准处理处理异常代码
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try{
			fis = new FileInputStream("xxx.txt");
			fos = new FileOutputStream("yyy.txt");
			int b;
			while((b = fis.read()) != -1) {
				fos.write(b);
			}
		} finally {
			try{
				if(fis != null)
					fis.close();
			} finally {					//try finally的嵌套目的是为了能关一个尽量关一个
				if(fos != null)
					fos.close();
			}
		}
	}
}
class MyClose implements AutoCloseable {
	public void close() {
		System.out.println("我关了");
	}
}