package com.qiao.string;

public class Test1_String {

	/**
	 * a:�ַ�������ֵ"abc"Ҳ���Կ�����һ���ַ�������
	 * b:�ַ����ǳ���,һ������ֵ,�Ͳ��ܸı�
	 */
	public static void main(String[] args) {
		String str = "abc";//"abc"���Կ���һ���ַ����Ķ���
		str = "def";//����"def"��ֵ��str,ԭ����"abc"�ͱ��������
		System.out.println(str.toString());//String����д��toString�������ص��Ǹö�����
	}

}
