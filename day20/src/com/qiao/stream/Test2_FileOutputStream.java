package com.qiao.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2_FileOutputStream {

	/**
	 * @throws IOException 
	 * FileOutputStream�ڴ��������ʱ�����û������ļ�������Ǵ�������
	 * ���������ļ��ͻ��Ƚ��ļ����
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		FileOutputStream fos = new FileOutputStream("yyy.txt",true);	//�������д,�ڵڶ���������true
		fos.write(100);
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream("yyy.txt");//�����ֽ����������,���û�оʹ���һ��
		fos.write(97);			//��Ȼд������һ��int��,���ǵ��ļ��ϵ���һ���ֽ�,���Զ�ȥ��ǰ����8λ
		fos.write(98);
		fos.write(99);
		
		fos.close();
	}

}
