package com.qiao.test;

public class Test3 {

	/**
	 * 统计一个字符串中大写字母,小写字母,数字字符和其他字符出现的次数.
	 * "ABCDEabcde123456!@#$%^";
	 * 
	 * 分析:字符串是由字符组成的,而字符串的值都是由范围的,通过范围来判断是否包含该字符
	 * 如果包含就让计数器变量自增
	 */
	public static void main(String[] args) {
		String s = "ABCDEabcde123456!@#$%^";
		int big = 0;
		int small = 0;
		int num = 0;
		int other = 0;
		//1.获取每个字符,通过for循环遍历
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			//2.判断字符是否在这个范围内
			if(c >= 'A' && c <= 'Z') {
				big++;
			}else if(c >= 'a' && c <= 'z') {
				small++;
			}else if(c >= '0' && c <= '9') {
				num++;
			}else{
				other++;
			}
		}
		//3.打印每个计数器的结果
		System.out.println(s + "字符串中大写字母有:" + big + "个,小写字母有:" + small + "个,数字字符有:" + num + "个,其他字符有:" + other + "个.");
	}
}
