package com.qiao.string;

public class Test3_String {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// demo1();������1
		// demo2();������2
		// demo3();������3
		// demo4();������4
		// demo5();������5
	}

	private static void demo5() {
		String s1 = "ab";// ����
		String s2 = "abc";// ����
		String s3 = s1 + "c";// ͨ������StringBuffer�������append����ʵ�����s1 + "c" = "abc",Ȼ��ͨ��toString����ת��ΪString�ַ���
		System.out.println(s3 == s2);// false,s2�ǳ����صĵ�ֵַ,s3��toString����ĵ�ֵַ
		System.out.println(s3.equals(s2));// ture
	}

	private static void demo4() {
		// byte b = 3 + 4;// �ڱ���ʱ�ͱ����7,��7��ֵ��b,�����Ż�����
		String s1 = "a" + "b" + "c";
		String s2 = "abc";
		System.out.println(s1 == s2);// true,java���г����Ż�����
		System.out.println(s1.equals(s2));// true
	}

	private static void demo3() {
		String s1 = new String("abc");// ��¼���Ƕ��ڴ�ĵ�ֵַ
		String s2 = "abc";// ��¼���ǳ������еĵ�ֵַ
		System.out.println(s1 == s2);// false
		System.out.println(s1.equals(s2));// true
	}

	private static void demo2() {
		/*
		 * String s1 = new String("abc")������������? 
		 * ������������,һ���ڳ�������,һ���ڶ��ڴ���
		 */
		String s1 = new String("abc");
		System.out.println(s1);
	}

	private static void demo1() {// ��������û������ַ�������,�ʹ���һ��,�����ֱ���ü���
		String s1 = "abc";// ����1
		String s2 = "abc";// ����2
		System.out.println(s1 == s2);// true
		System.out.println(s1.equals(s2));// ture
	}

}
