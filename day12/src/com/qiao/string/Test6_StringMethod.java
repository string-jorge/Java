package com.qiao.string;

import com.qiao.bean.Person;

public class Test6_StringMethod {

	/**
	 * byte[] getBytes():把字符串转换为字节数组
	 * char[] toCharArray():把字符串转换为字符数组
	 * static String valueOf(char[] chs):把字符数组转成字符串
	 * static String valueOf(int i):把int类型的数据转成字符串
	 * *注意:String类的valueOf方法可以把任意类型数据转成字符串
	 * String toLowerCase():把字符串转成小写
	 * String toUpperCase():把字符串转成大写
	 * String concat(String str):把字符串拼接
	 */
	public static void main(String[] args) {
		demo1();
		demo2();
		demo3();
		demo4();
	}

	private static void demo4() {
		//把字符串转成小写
		String s1 = "shiQiao";
		String s3 = s1.toLowerCase();
		System.out.println(s3);
		
		//把字符串转成大写
		String s2 = "chengxuYuan";
		String s4 = s2.toUpperCase();
		System.out.println(s4);
		
		//把字符串拼接
		System.out.println(s3 + s4);//用+拼接字符串更强大,可以用字符串与任意类型相加
		System.out.println(s3.concat(s4));//concat方法调用的和传入的都必须是字符串
	}

	private static void demo3() {
		//把字符数组转成字符串
		char[] arr1 = {'a','b','c'};
		String s1 = String.valueOf(arr1);//底层是由String类的构造方法完成的
		System.out.println(s1);
		
		//把int类型的数据转成字符串
		String s2 = String.valueOf(100);//将100转换为字符串
		System.out.println(s2 + 100);
		
		Person p = new Person("张三",23);
		System.out.println(p);
		String s3 = String.valueOf(p);
		System.out.println(s3);
	}

	private static void demo2() {
		//把字符串转换为字符数组(遍历字符数组的另一种方法)
		String s1 = "shiqiao";
		char[] arr1 = s1.toCharArray();//将字符串转换为字符数组
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}

	private static void demo1() {
		//把字符串转换为字节数组
		String s1 = "abc";
		byte[] arr1 = s1.getBytes();
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();//换行
		
		String s2 = "你好你好";
		byte[] arr2 = s2.getBytes();//通过GBK码表将字符串转换成字节数组
		for (int i = 0; i < arr2.length; i++) {//编码:把我们看的懂的转换成计算机看得懂的
			System.out.print(arr2[i] + " ");//GBK码表一个中文代表两个字节,//GBK码表的特点:中文的第一个字节肯定是负数
		}
		
		System.out.println();//换行
		
		String s3 = "琲";
		byte[] arr3 = s3.getBytes();
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
	}
}
