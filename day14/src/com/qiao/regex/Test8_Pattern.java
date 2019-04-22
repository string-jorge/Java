package com.qiao.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test8_Pattern {

	/**
	 * 典型的调用顺序是 
			 Pattern p = Pattern.compile("a*b");
			 Matcher m = p.matcher("aaaaab");
			 boolean b = m.matches();
	 * A:正则表达式的获取功能
	 * 		Pattern和Matcher的结合使用
	 * B:案例
	 * 		需求把一个字符串的手机号码获取出来
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
	}

	private static void demo2() {
		//把一个字符串的手机号码获取出来
		String s = "我的手机号码是18988888888,曾经用过18987654321,还用过18812345678";
		
		String regex = "1[3578]\\d{9}";//手机号码正则表达式
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
		Pattern p = Pattern.compile("a*b");//获取到正则表达式
		 Matcher m = p.matcher("aaaaab");//获取匹配器
		 boolean b = m.matches();//看是否能匹配,匹配就返回true
		 
		 System.out.println(b);
		 
		 System.out.println("aaaaab".matches("a*b"));//与上面的结果一样
	}

}
