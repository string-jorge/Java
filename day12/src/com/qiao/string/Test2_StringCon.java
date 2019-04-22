
package com.qiao.string;

public class Test2_StringCon {

	/**
	 * String��
	 * public String():�չ���
	 * public String(byte[] bytes):���ֽ�����ת���ַ���
	 * public String(byte[] bytes,int index,int length):���ֽ������һ����ת���ַ���
	 * public String(char[] value):���ַ�����ת���ַ���
	 * public String(char[] value,int index,int count):���ַ������һ����ת���ַ���
	 * public String(String original):���ַ�������ֵת���ַ���
	 */
	public static void main(String[] args) {
		// �չ���(����һ�����ַ���)
		String s1 = new String();
		System.out.println(s1);

		// ���ֽ�����ת���ַ���
		byte[] arr1 = { 97, 98, 99 };
		String s2 = new String(arr1);// ����,����������ö���ת�������Ƕ��ö���
		System.out.println(s2);

		// ���ֽ������һ����ת���ַ���
		byte[] arr2 = { 97, 98, 99, 100, 101, 102 };
		String s3 = new String(arr2, 2, 3);// ��arr2�ֽ������2����ת��3��
		System.out.println(s3);

		// ���ַ�����ת���ַ���
		char[] arr3 = { 'a', 'b', 'c', 'd', 'e' };
		String s4 = new String(arr3);// 'a','b','c','d','e' ��Ч�� "abcde"
		System.out.println(s4);

		// ���ַ������һ����ת���ַ���
		char[] arr4 = { 'a', 'b', 'c', 'd', 'e', 'f' };
		String s5 = new String(arr4, 3, 2);// ��arr4�ַ������3����ת��2��
		System.out.println(s5);

		// ���ַ�������ֵת���ַ���
		String s6 = new String("abcdefg");//���ַ���ת���ɴ��ַ���(û������)
		System.out.println(s6);
	}

}
