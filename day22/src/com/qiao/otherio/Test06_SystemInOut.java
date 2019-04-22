package com.qiao.otherio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class Test06_SystemInOut {

	/**
	 * @param args
	 * System.in��InputStream,��׼������,����Ĭ�ϴӼ��������ȡ�ֽ�����
	 * System.out��PrintStream,�Ǳ�׼�����,����Ĭ����Console(����̨)�������ַ����ֽ�����
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		System.setIn(new FileInputStream("h.txt"));		//�ı�������
		System.setOut(new PrintStream("i.txt"));		//�ı������
		
		InputStream is = System.in;				//��ȡ��׼�ļ���������,Ĭ��ָ�����,�ı���ָ���ļ�
		PrintStream ps = System.out;			//��ȡ��׼�����,Ĭ��ָ�����̨,�ı���ָ���ļ�
		
		int b;
		while((b = is.read()) != -1) {
			ps.write(b);
		}
		//System.out.println();					//Ҳ��һ�������,���ù�,��Ϊû�к�Ӳ���ϵ��ļ����������Ĺܵ�
		is.close();
		ps.close();
	}

	private static void demo1() throws IOException {
		InputStream is1 = System.in;
		int x = is1.read();
		System.out.println(x);
		
		is1.close();
		
		InputStream is2 = System.in;
		int y = is2.read();
		System.out.println(is2);
	}

}
