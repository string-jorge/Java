package com.qiao.otherclass;

import java.math.BigInteger;

public class Test4_BigInteger {

	/**
	 * A:BigInteger类的概述
	 * 		可以让超过Integer范围内的数据进行运算
	 * B:构造方法
	 * 		public BigInteger(String val)
	 * C:成员方法
	 * 		public BigInteger add(BigInteger val):相加
	 * 		public BigInteger subtract(BigInteger val):相减
	 * 		public BigInteger multiply(BigInteger val):相乘
	 * 		public BigInteger divide(BigInteger val):相除
	 * 		public BigInteger[] divideAndRemainder(BigInteger val)
	 */
	public static void main(String[] args) {
		//long num = 12345678998765432112L;//装不下了
		//String s = "12345678998765432112";//不会报错
		
		BigInteger bi1 = new BigInteger("100");
		BigInteger bi2 = new BigInteger("2");
		
		//相加
		System.out.println(bi1.add(bi2));//bi1 + bi2 = 102
		
		//相减
		System.out.println(bi1.subtract(bi2));//bi1 - bi2 = 98
		
		//相乘
		System.out.println(bi1.multiply(bi2));//bi1 * bi2 = 200
		
		//相除
		System.out.println(bi1.divide(bi2));//bi1 / bi2 = 50
		
		//取除数和余数
		BigInteger[] arr = bi1.divideAndRemainder(bi2);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);//除数50,余数0
		}
	}

}
