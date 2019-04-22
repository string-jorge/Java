package com.qiao.stringbuffer;

public class Test6_StringBuffer {

	/**
	 * A:String -- StringBuffer
	 * 		a:ͨ�����췽��
	 * 		b:ͨ��append()����
	 * B:StringBuffer -- String
	 * 		a:ͨ�����췽��
	 * 		b:ͨ��ͬtoString()����
	 * 		c:ͨ��substring(0,length);
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
	}

	private static void demo2() {
		//StringBuffer -- String
		//ͨ�����췽����StringBufferת��ΪString
		StringBuffer sb1 = new StringBuffer("shiqiao");
		String s1 = new String(sb1);
		System.out.println(s1);
		
		//ͨ��toString������StringBufferת��ΪString
		String s2 = sb1.toString();
		System.out.println(s2);
		System.out.println(sb1.toString());
		
		//ͨ��substring(0,length)��ȡ���ַ���,��StringBufferת��ΪString
		String s3 = sb1.substring(0,sb1.length());//sb1.length()���ַ����ĳ���,����ͷ������β������7,��0����ȡ��6����
		System.out.println(s3);
	}

	private static void demo1() {
		//String -- StringBuffer
		//ͨ�����췽�����ַ���ת��ΪStringBuffer����
		StringBuffer sb1 = new StringBuffer("shiqiao");
		System.out.println(sb1);
		
		//ͨ��append()�������ַ���ת��ΪStringBuffer����
		StringBuffer sb2 = new StringBuffer();
		sb2.append("shiqiao");
		System.out.println(sb2);
	}

}
