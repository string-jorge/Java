package com.qiao.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test1_FileInputStream {

	/**
	 * @throws IOException 
	 * read()������ȡ����һ���ֽ�,Ϊʲô����ֵ��int,������byte
	 * ��Ϊ11111111��-1�Ķ�����
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		FileInputStream fis = new FileInputStream("xxx.txt");//����������,������
		int b;
		while((b = fis.read()) != -1) {
			System.out.println(b);
		}
		fis.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");//����������,������
		int x = fis.read();				//��Ӳ���϶�ȡһ���ֽ�
		System.out.println(x);
		int y = fis.read();
		System.out.println(y);
		int z = fis.read();
		System.out.println(z);
		int a = fis.read();
		System.out.println(a);
		int b = fis.read();
		System.out.println(b);
		fis.close();					//�����ͷ���Դ
	}

}
