package com.qiao.regex;

public class Test6_ReplaceAll {

	/**
	 * ������ʽ���滻����
	 * 		String��Ĺ���:public String replaceAll(String regex,String replacement)
	 */
	public static void main(String[] args) {
		String s1 = "wo11231ai2shi213213qiao";
		String regex = "\\d";//\\d���������������
		
		String s2 = s1.replaceAll(regex, "");//���ַ�����������ÿմ��滻
		System.out.println(s2);
	}

}
