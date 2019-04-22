package com.qiao.regex;

public class Test6_ReplaceAll {

	/**
	 * 正则表达式的替换功能
	 * 		String类的功能:public String replaceAll(String regex,String replacement)
	 */
	public static void main(String[] args) {
		String s1 = "wo11231ai2shi213213qiao";
		String regex = "\\d";//\\d代表的是任意数字
		
		String s2 = s1.replaceAll(regex, "");//把字符串里的数字用空串替换
		System.out.println(s2);
	}

}
