package com.qiao.regex;

public class Test5_Split {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "������.������.��dayone";
		String[] arr = s.split("\\.");//.��ʾ�����ַ�,Ҫ��.�и������\\.����,ͨ��������ʽ�и����
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
