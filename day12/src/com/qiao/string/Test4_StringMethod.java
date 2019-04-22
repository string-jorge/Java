package com.qiao.string;

public class Test4_StringMethod {

	/**
	 * boolean equals(Object obj):�Ƚ��ַ����������Ƿ����,���ִ�Сд
	 * boolean equalsIgnoreCase(String str):�Ƚ��ַ����������Ƿ����,���Դ�Сд 
	 * boolean contains(String str):�жϴ��ַ������Ƿ����С�ַ���
	 * boolean startsWith(String str):�ж��ַ����Ƿ���ĳ��ָ�����ַ�����ͷ
	 * boolean endsWith(String str):�ж��ַ����Ƿ���ĳ��ָ�����ַ�����β 
	 * boolean isEmpty():�ж��ַ����Ƿ�Ϊ��
	 * 
	 * ""��null������
	 * ""���ַ�������,ͬʱҲ��һ��String��Ķ���,��Ȼ�Ƕ���Ȼ���Ե���String���еķ���
	 * null�ǿճ���,���ܵ����κη���,�������ֿ�ָ���쳣,null�������Ը�����������������͸�ֵ
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
	}

	private static void demo3() {
		String s1 = "shiqiao";
		String s2 = "";
		String s3 = null;
		
		System.out.println(s1.isEmpty());//false,�ж��ַ����Ƿ�Ϊ���ַ���
		System.out.println(s2.isEmpty());//true
		//System.out.println(s3.isEmpty());//java.lang.NullPointerException
	}

	private static void demo2() {
		String s1 = "love you,haha";
		String s2 = "you";		
		String s3 = "me";
		String s4 = "love you";
		String s5 = "haha";
		System.out.println(s1.contains(s2));//true,�ж��Ƿ����������ַ���
		System.out.println(s1.contains(s3));//false
		
		System.out.println(s1.startsWith(s4));//true,�ж��Ƿ��Դ�����ַ�����ͷ
		System.out.println(s1.startsWith(s5));//false
		
		System.out.println(s1.endsWith(s4));//false,�ж��Ƿ��Դ�����ַ�����β
		System.out.println(s1.endsWith(s5));//true
	}

	private static void demo1() {
		String s1 = "shiqiao";
		String s2 = "shiqiao";
		String s3 = "ShiQiao";
		//�Ƚ��ַ����������Ƿ����,���ִ�Сд
		System.out.println(s1.equals(s2));// true
		System.out.println(s2.equals(s3));// false
		
		//�Ƚ��ַ����������Ƿ����,���Դ�Сд
		System.out.println(s1.equalsIgnoreCase(s2));//true
		System.out.println(s2.equalsIgnoreCase(s3));//true,�����ִ�Сд
	}

}
