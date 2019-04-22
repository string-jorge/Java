package com.qiao.test;

public class Test2 {

	/**
	 * 遍历字符串中的每个字符
	 */
	public static void main(String[] args) {
		String s = "shiqiao";
		for(int x = 0;x < s.length();x++) {//通过for循环获取到字符串中每个字符的索引
			/*char c = s.charAt(x);//通过索引获取每个字符
			System.out.print(c + " ");*/
			System.out.print(s.charAt(x) + " ");//通过索引获取每个字符,打印
		}
	}
}
