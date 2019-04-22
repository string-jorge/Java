package com.qiao.otherio;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test09_Data {

	/**
	 * @param args
	 * @throws IOException 
	 * 数据流输入输出流
	 * 00000000 00000000 00000011 11100101 int型997
	 * 写:去掉前面的3位:11100101 byte型229
	 * 读:00000000 00000000 00000000 11100101 int型229
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		//demo2();
		//demo3();
		DataInputStream dis = new DataInputStream(new FileInputStream("k.txt"));
		int x = dis.readInt();
		int y = dis.readInt();
		int z = dis.readInt();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		dis.close();
	}

	private static void demo3() throws FileNotFoundException, IOException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("k.txt"));
		dos.writeInt(997);
		dos.writeInt(998);
		dos.writeInt(999);
		
		dos.close();
	}

	private static void demo2() throws FileNotFoundException, IOException {
		FileInputStream fos = new FileInputStream("k.txt");
		int x = fos.read();
		int y = fos.read();
		int z = fos.read();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		fos.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileOutputStream fis = new FileOutputStream("k.txt");
		fis.write(997);
		fis.write(998);
		fis.write(999);
		
		fis.close();
	}

}
