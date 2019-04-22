package com.qiao.stringbuffer;

public class Test6_StringBuffer {

	/**
	 * A:String -- StringBuffer
	 * 		a:通过构造方法
	 * 		b:通过append()方法
	 * B:StringBuffer -- String
	 * 		a:通过构造方法
	 * 		b:通过同toString()方法
	 * 		c:通过substring(0,length);
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
	}

	private static void demo2() {
		//StringBuffer -- String
		//通过构造方法将StringBuffer转换为String
		StringBuffer sb1 = new StringBuffer("shiqiao");
		String s1 = new String(sb1);
		System.out.println(s1);
		
		//通过toString方法将StringBuffer转换为String
		String s2 = sb1.toString();
		System.out.println(s2);
		System.out.println(sb1.toString());
		
		//通过substring(0,length)截取子字符串,将StringBuffer转换为String
		String s3 = sb1.substring(0,sb1.length());//sb1.length()是字符串的长度,包含头不包含尾长度是7,从0索引取到6索引
		System.out.println(s3);
	}

	private static void demo1() {
		//String -- StringBuffer
		//通过构造方法将字符串转换为StringBuffer对象
		StringBuffer sb1 = new StringBuffer("shiqiao");
		System.out.println(sb1);
		
		//通过append()方法将字符串转换为StringBuffer对象
		StringBuffer sb2 = new StringBuffer();
		sb2.append("shiqiao");
		System.out.println(sb2);
	}

}
