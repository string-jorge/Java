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
	 * close����
	 * �߱�ˢ�¹���,�ٹر���֮ǰ,�ͻ���ˢ��һ�λ�����,�����������ֽ�ȫ����ˢ�µ��ļ���,�ٹر�,close����ˢ����֮��Ͳ���д��
	 * flush����
	 * �߱�ˢ�¹���,ˢ����֮�󻹿��Լ���д
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		//flush��close����������
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("���Ϻ� - �ɲ�����.mp3"));
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
		FileInputStream fis = new FileInputStream("���Ϻ� - �ɲ�����.mp3");		//��������������,�������Ϻ� - �ɲ�����.mp3
		FileOutputStream fos = new FileOutputStream("copy.mp3");			//�������������,����copy.mp3
		BufferedInputStream bis = new BufferedInputStream(fis);				//��������������,�����������а�װ�����ø���ǿ��
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		bis.close();
		bos.close();
	}

}