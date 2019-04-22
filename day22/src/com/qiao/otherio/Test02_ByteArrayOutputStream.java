package com.qiao.otherio;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test02_ByteArrayOutputStream {

	/**
	 * @param args
	 * @throws IOException 
	 * �ڴ������:�������ڴ���д������,���ڴ浱��һ��������,д��֮�����һ���Ի�ȡ����������
	 * 
	 * FileInputStream��ȡ����ʱ����������
	 * 
	 * �������:
	 * 1.�ַ�����ȡ
	 * 2.�ڴ�����ȡ
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		FileInputStream fis = new FileInputStream("e.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();			//���ڴ��д����˿����������ڴ�����
		
		int b;
		while((b= fis.read()) != -1) {
			baos.write(b);													//���������������д���ڴ���
		}
		//byte[] arr = baos.toByteArray();									//���������е�����ȫ����ȡ����,����ֵ��arr����
		//System.out.println(new String(arr));
		
		System.out.println(baos.toString());								//��������������ת��Ϊ�ַ���,���������п���ʡ�Ե���toString����
		
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
