package com.qiao.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test5_BufferCopy {

	/**
	 * @param args
	 * @throws IOException 
	 * close方法
	 * 具备刷新功能,再关闭流之前,就会先刷新一次缓冲区,将缓冲区的字节全部都刷新到文件上,再关闭,close方法刷新完之后就不能写了
	 * flush方法
	 * 具备刷新功能,刷新完之后还可以继续写
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		//flush和close方法的区别
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("张紫豪 - 可不可以.mp3"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.mp3"));
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		//bos.flush();
		bis.close();
		bos.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("张紫豪 - 可不可以.mp3");		//创建输入流对象,关联张紫豪 - 可不可以.mp3
		FileOutputStream fos = new FileOutputStream("copy.mp3");			//创建输出流对象,关联copy.mp3
		BufferedInputStream bis = new BufferedInputStream(fis);				//创建缓冲区对象,对输入流进行包装让其变得更加强大
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		bis.close();
		bos.close();
	}

}