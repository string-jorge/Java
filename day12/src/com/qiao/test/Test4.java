package com.qiao.test;

public class Test4 {

	/**
	 * 把一个字符串的首字母转成大写,其余为小写(只考虑英文大小写字母字符)
	 * 链式编程:只要保证每次调用完方法返回的是对象,就可以继续调用
	 */
	public static void main(String[] args) {
		String s1 = "woaishiqiaoniaima";
		String s2 = s1.substring(0, 1).toUpperCase().concat(s1.substring(1).toLowerCase());
		System.out.println(s2);
	}

}
