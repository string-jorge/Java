package com.qiao.test;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Test2 {

	/*
	 * ʹ��Scanner�Ӽ��̶�ȡһ������,ȥ�������ظ��ַ�,��ӡ����ͬ����Щ�ַ�
	 * 
	 * ����:
	 * 1.����Scanner����
	 * 2.����HashSet����,���ַ��洢,ȥ���ظ�
	 * 3.���ַ���ת�����ַ�����,��ȡÿһ���ַ��洢��HashSet������,�Զ�ȥ���ظ�
	 * 4.����HashSet,��ӡÿһ���ַ�
	 */
	
	public static void main(String[] args) {
		//1.����Scanner����
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���:");
		//2.����HashSet����,���ַ��洢,ȥ���ظ�
		LinkedHashSet<Character> lhs = new LinkedHashSet<>();
		//3.���ַ���ת�����ַ�����,��ȡÿһ���ַ��洢��HashSet������,�Զ�ȥ���ظ�
		String line = sc.nextLine();
		char[] arr = line.toCharArray();
		for (char c : arr) {//�����ַ�����
			lhs.add(c);
		}
		//4.����HashSet,��ӡÿһ���ַ�
		for (Character ch : lhs) {
			System.out.print(ch);
		}
	}
}
