package com.qiao.otherio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import com.qiao.bean.Person;

public class Test05_PrintStream {

	/**
	 * @param args
	 * @throws IOException 
	 * PrintStream��PrintWrite�ֱ��Ǵ�ӡ���ֽ������ַ���
	 * ֮��������Ŀ�ĵ�
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		PrintWriter pw = new PrintWriter(new FileOutputStream("g.txt"),true);
		pw.println(97);				//�Զ�ˢ������ֻ���println����
		//pw.print(97);
		//pw.write(97);
		
		//pw.close();
	}

	private static void demo1() {
		System.out.println("aaa");
		PrintStream ps = System.out;		//��ȡ��׼�����
		ps.println(97);						//�ײ�ͨ��Integer.toString()��97ת�����ַ�����ӡ
		ps.write(97);						//�������,�ҵ���Ӧ��a��ӡ
		
		Person p1 = new Person("����",23);	//Ĭ�ϵ���p��toString����
		ps.println(p1);
		
		Person p2 = null;
		System.out.println(p2);				//��ӡ������������,�����null,�ʹ�ӡnull,�������null�ʹ�ӡ�����toString����
		ps.close();
	}

}
