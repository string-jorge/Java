package com.qiao.test;

import java.math.BigInteger;

public class Test6 {

	/**
	 * 1000的阶乘所有零和尾部零的个数
	 */
	public static void main(String[] args) {
		/*int result = 1;
		for (int i = 1; i <= 1000; i++) {
			result = result * i;
		}
		System.out.println(result);*/		//1000!超出了int数的取值范围
		//demo1();
		//demo2();
	}
	////1000的阶乘尾部零的个数
	public static void demo2() {
		BigInteger bi1 = new BigInteger("1");
		for(int i = 1;i <= 1000;i++) {
			BigInteger bi2 = new BigInteger(i + "");
			bi1 = bi1.multiply(bi2);						//将bi1和bi2相乘的结果赋值给bi1
		}
		String s = bi1.toString();							//获取字符串表现形式
		StringBuilder sb = new StringBuilder(s);
		String str = sb.reverse().toString();				//将字符串反转后转换成字符串
		int count = 0;
		for(int i = 0;i <= str.length();i++) {
			if('0' != str.charAt(i)) {
				break;
			}else{
				count++;
			}
		}
		System.out.println(count);
	}
	//1000阶乘的所有零
	public static void demo1() {
		BigInteger bi1 = new BigInteger("1");
		for(int i = 1;i <= 1000;i++) {
			BigInteger bi2 = new BigInteger(i + "");
			bi1 = bi1.multiply(bi2);						//将bi1和bi2相乘的结果赋值给bi1
		}
		String s = bi1.toString();							//获取字符串表现形式
		int count = 0;										//定义计数器
		for(int i = 0;i < s.length();i++) {
			if('0' == s.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
