package com.qiao.test;

import java.util.Scanner;

public class Test2 {

	/**
	 * ���ַ�����ת
	 * 		����:����¼��"abc"
	 * 		������:"cba"
	 * 		��StringBuffer����ʵ��
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//��������¼�����
		System.out.println("������һ���ַ���:");
		String line = sc.nextLine();//������¼����ַ����洢��line��
		
		/*StringBuffer sb = new StringBuffer(line);//���ַ���ת��ΪStringBuffer����
		sb.reverse();//�����������ݷ�ת
		
		System.out.println(sb.toString());*/
		
		System.out.println(reverseString(line));
	}

	/*
	 * ���ַ�����ת
	 * 1.����ֵ����String
	 * 2.�����б�String line
	 */
	public static String reverseString(String line) {
		StringBuffer sb = new StringBuffer(line);//���ַ���ת��ΪStringBuffer����
		sb.reverse();//�����������ݷ�ת
		
		return sb.toString();//����ת���StringBufferת��ΪString����
	}
}
