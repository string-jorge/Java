package com.qiao.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3_Copy {
	
	public static void main(String[] args) throws IOException {
		//demo1();
		//demo2();
		//�ڶ��ֿ���,���Ƽ�ʹ��,��Ϊ�п��ܵ����ڴ����
		FileInputStream fis = new FileInputStream("���Ϻ� - �ɲ�����.mp3");
		FileOutputStream fos = new FileOutputStream("copy.mp3");
		
		/*int length = fis.available();
		System.out.println(length);*/
		
		byte[] arr = new byte[fis.available()];		//�������ļ�һ����С��
		fis.read(arr);								//���ļ��ϵ��ֽ�����ȡ���ڴ�
		fos.write(arr);								//���ֽ������е��ֽ�����д���ļ���

		fis.close();
		fos.close();
	}
	//��һ��copy,��дЧ�ʵ�,�������Ƽ�ʹ��
	private static void demo2() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("���Ϻ� - �ɲ�����.mp3");
		FileOutputStream fos = new FileOutputStream("copy.mp3");
		int b;
		while((b = fis.read()) != -1) {					//��ȡ�ֽ�Ч�ʵ�
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
