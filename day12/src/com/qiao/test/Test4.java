package com.qiao.test;

public class Test4 {

	/**
	 * ��һ���ַ���������ĸת�ɴ�д,����ΪСд(ֻ����Ӣ�Ĵ�Сд��ĸ�ַ�)
	 * ��ʽ���:ֻҪ��֤ÿ�ε����귽�����ص��Ƕ���,�Ϳ��Լ�������
	 */
	public static void main(String[] args) {
		String s1 = "woaishiqiaoniaima";
		String s2 = s1.substring(0, 1).toUpperCase().concat(s1.substring(1).toLowerCase());
		System.out.println(s2);
	}

}
