
package com.qiao.string;

public class Test2_StringCon {

	/**
	 * String类
	 * public String():空构造
	 * public String(byte[] bytes):把字节数组转成字符串
	 * public String(byte[] bytes,int index,int length):把字节数组的一部分转成字符串
	 * public String(char[] value):把字符数组转成字符串
	 * public String(char[] value,int index,int count):把字符数组的一部分转成字符串
	 * public String(String original):把字符串常量值转成字符串
	 */
	public static void main(String[] args) {
		// 空构造(创建一个空字符串)
		String s1 = new String();
		System.out.println(s1);

		// 把字节数组转成字符串
		byte[] arr1 = { 97, 98, 99 };
		String s2 = new String(arr1);// 解码,将计算机读得懂的转换成我们读得懂的
		System.out.println(s2);

		// 把字节数组的一部分转成字符串
		byte[] arr2 = { 97, 98, 99, 100, 101, 102 };
		String s3 = new String(arr2, 2, 3);// 将arr2字节数组从2索引转换3个
		System.out.println(s3);

		// 把字符数组转成字符串
		char[] arr3 = { 'a', 'b', 'c', 'd', 'e' };
		String s4 = new String(arr3);// 'a','b','c','d','e' 等效于 "abcde"
		System.out.println(s4);

		// 把字符数组的一部分转成字符串
		char[] arr4 = { 'a', 'b', 'c', 'd', 'e', 'f' };
		String s5 = new String(arr4, 3, 2);// 将arr4字符数组从3索引转换2个
		System.out.println(s5);

		// 把字符串常量值转成字符串
		String s6 = new String("abcdefg");//将字符串转换成从字符串(没有意义)
		System.out.println(s6);
	}

}
