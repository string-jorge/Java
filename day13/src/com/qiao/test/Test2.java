package com.qiao.test;

import java.util.Scanner;

public class Test2 {

	/**
	 * 把字符串反转
	 * 		举例:键盘录入"abc"
	 * 		输出结果:"cba"
	 * 		用StringBuffer功能实现
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//创建键盘录入对象
		System.out.println("请输入一个字符串:");
		String line = sc.nextLine();//将键盘录入的字符串存储在line中
		
		/*StringBuffer sb = new StringBuffer(line);//将字符串转换为StringBuffer对象
		sb.reverse();//将缓冲区内容反转
		
		System.out.println(sb.toString());*/
		
		System.out.println(reverseString(line));
	}

	/*
	 * 将字符串反转
	 * 1.返回值类型String
	 * 2.参数列表String line
	 */
	public static String reverseString(String line) {
		StringBuffer sb = new StringBuffer(line);//将字符串转换为StringBuffer对象
		sb.reverse();//将缓冲区内容反转
		
		return sb.toString();//将反转后的StringBuffer转换为String返回
	}
}
