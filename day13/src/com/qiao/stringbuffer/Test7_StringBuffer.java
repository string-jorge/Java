package com.qiao.stringbuffer;

public class Test7_StringBuffer {

	/**
	 * 形式参数问题
	 * 		String作为参数传递
	 * 		StringBuffer作为参数传递
	 * 
	 * 基本数据类型的值传递,不改变其值
	 * 引用数据类型的值传递,改变其值
	 * 
	 * String类虽然是引用数据类型,但是它当作参数传递时和基本数据类型是一样的
	 */
	public static void main(String[] args) {
		String s = "shiqiao";
		System.out.println(s);//"shiqiao"
		change(s);
		System.out.println(s);//"shiqiao"
		
		StringBuffer sb = new StringBuffer();
		sb.append("shiqiao");
		System.out.println(sb);//"shiqiao"
		change(sb);
		System.out.println(sb);//"shiqiaoitcast"
	}

	public static void change(StringBuffer sb) {
		sb.append("itcast");
	}

	public static void change(String s) {
		s += "itcast";
	}

}
