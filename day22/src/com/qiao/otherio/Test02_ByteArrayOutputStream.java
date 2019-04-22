package com.qiao.otherio;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test02_ByteArrayOutputStream {

	/**
	 * @param args
	 * @throws IOException 
	 * 内存输出流:可以向内存中写入数据,把内存当作一个缓冲区,写出之后可以一次性获取出所有数据
	 * 
	 * FileInputStream读取中文时出现了乱码
	 * 
	 * 解决方案:
	 * 1.字符流读取
	 * 2.内存流读取
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		FileInputStream fis = new FileInputStream("e.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();			//在内存中创建了可以增长的内存数组
		
		int b;
		while((b= fis.read()) != -1) {
			baos.write(b);													//将读到的数据逐个写到内存中
		}
		//byte[] arr = baos.toByteArray();									//将缓冲区中的数据全部获取出来,并赋值给arr数组
		//System.out.println(new String(arr));
		
		System.out.println(baos.toString());								//将缓冲区的内容转化为字符串,在输出语句中可以省略调用toString方法
		
		fis.close();
		baos.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("e.txt");
		byte[] arr = new byte[3];
		int len;
		while((len = fis.read(arr)) != -1) {
			System.out.println(new String(arr,0,len));
		}
		fis.close();
	}

}
