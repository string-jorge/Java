package com.qiao.string;

import com.qiao.bean.Person;

public class Test6_StringMethod {

	/**
	 * byte[] getBytes():���ַ���ת��Ϊ�ֽ�����
	 * char[] toCharArray():���ַ���ת��Ϊ�ַ�����
	 * static String valueOf(char[] chs):���ַ�����ת���ַ���
	 * static String valueOf(int i):��int���͵�����ת���ַ���
	 * *ע��:String���valueOf�������԰�������������ת���ַ���
	 * String toLowerCase():���ַ���ת��Сд
	 * String toUpperCase():���ַ���ת�ɴ�д
	 * String concat(String str):���ַ���ƴ��
	 */
	public static void main(String[] args) {
		demo1();
		demo2();
		demo3();
		demo4();
	}

	private static void demo4() {
		//���ַ���ת��Сд
		String s1 = "shiQiao";
		String s3 = s1.toLowerCase();
		System.out.println(s3);
		
		//���ַ���ת�ɴ�д
		String s2 = "chengxuYuan";
		String s4 = s2.toUpperCase();
		System.out.println(s4);
		
		//���ַ���ƴ��
		System.out.println(s3 + s4);//��+ƴ���ַ�����ǿ��,�������ַ����������������
		System.out.println(s3.concat(s4));//concat�������õĺʹ���Ķ��������ַ���
	}

	private static void demo3() {
		//���ַ�����ת���ַ���
		char[] arr1 = {'a','b','c'};
		String s1 = String.valueOf(arr1);//�ײ�����String��Ĺ��췽����ɵ�
		System.out.println(s1);
		
		//��int���͵�����ת���ַ���
		String s2 = String.valueOf(100);//��100ת��Ϊ�ַ���
		System.out.println(s2 + 100);
		
		Person p = new Person("����",23);
		System.out.println(p);
		String s3 = String.valueOf(p);
		System.out.println(s3);
	}

	private static void demo2() {
		//���ַ���ת��Ϊ�ַ�����(�����ַ��������һ�ַ���)
		String s1 = "shiqiao";
		char[] arr1 = s1.toCharArray();//���ַ���ת��Ϊ�ַ�����
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}

	private static void demo1() {
		//���ַ���ת��Ϊ�ֽ�����
		String s1 = "abc";
		byte[] arr1 = s1.getBytes();
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();//����
		
		String s2 = "������";
		byte[] arr2 = s2.getBytes();//ͨ��GBK����ַ���ת�����ֽ�����
		for (int i = 0; i < arr2.length; i++) {//����:�����ǿ��Ķ���ת���ɼ�������ö���
			System.out.print(arr2[i] + " ");//GBK���һ�����Ĵ��������ֽ�,//GBK�����ص�:���ĵĵ�һ���ֽڿ϶��Ǹ���
		}
		
		System.out.println();//����
		
		String s3 = "�i";
		byte[] arr3 = s3.getBytes();
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
	}
}
