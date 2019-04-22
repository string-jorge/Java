package com.qiao.otherio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Test08_RandomAccessFile {

	/**
	 * @param args
	 * @throws IOException 
	 * 随机访问流
	 */
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("j.txt", "rw");
		//raf.write(97);
		//int x = raf.read();
		//System.out.println(x);
		
		raf.seek(0);				//在指定位置设置指针
		raf.write(98);
		
		raf.close();
	}

}
