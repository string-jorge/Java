package com.qiao.regex;

public class Test5_Split {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "金三胖.郭美美.李dayone";
		String[] arr = s.split("\\.");//.表示任意字符,要用.切割必须是\\.才行,通过正则表达式切割对象
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
