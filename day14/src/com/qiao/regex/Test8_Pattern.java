package com.qiao.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test8_Pattern {

	/**
	 * ���͵ĵ���˳���� 
			 Pattern p = Pattern.compile("a*b");
			 Matcher m = p.matcher("aaaaab");
			 boolean b = m.matches();
	 * A:������ʽ�Ļ�ȡ����
	 * 		Pattern��Matcher�Ľ��ʹ��
	 * B:����
	 * 		�����һ���ַ������ֻ������ȡ����
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
	}

	private static void demo2() {
		//��һ���ַ������ֻ������ȡ����
		String s = "�ҵ��ֻ�������18988888888,�����ù�18987654321,���ù�18812345678";
		
		String regex = "1[3578]\\d{9}";//�ֻ�����������ʽ
		/*Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		boolean b = m.matches();
		
		System.out.println(b);*/
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		/*boolean b1 = m.find();
		String s1 = m.group();
		System.out.println(s1);*/
		
		while(m.find())
			System.out.println(m.group());
	}

	private static void demo1() {
		Pattern p = Pattern.compile("a*b");//��ȡ��������ʽ
		 Matcher m = p.matcher("aaaaab");//��ȡƥ����
		 boolean b = m.matches();//���Ƿ���ƥ��,ƥ��ͷ���true
		 
		 System.out.println(b);
		 
		 System.out.println("aaaaab".matches("a*b"));//������Ľ��һ��
	}

}
