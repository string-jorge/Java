package com.qiao.scanner;

import java.util.Scanner;

public class Test2_Scanner {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//����¼������int������
		/*System.out.println("�������һ������:");
		int i = sc.nextInt();
		System.out.println("������ڶ�������:");
		int j = sc.nextInt();
		System.out.println("i = " + i + ",j = " + j);*/
	
		//����¼�������ַ���
		/*System.out.println("�������һ���ַ���:");
		String line1 = sc.nextLine();
		System.out.println("������ڶ����ַ���:");
		String line2 = sc.nextLine();
		System.out.println("line1 = " + line1 + ",line2 = " + line2);*/
		
		/*
		 * nextInt()�Ǽ���¼�������ķ���,������¼��10��ʱ����ʵ�ڼ�����¼�����10��\r\n,nextInt()����ֻ��ȡ10�ͽ�����
		 * nextLine()�Ǽ���¼���ַ����ķ���,���Խ�����������,������ƾʲô��ȡһ����?
		 * ͨ��\r\n,ֻҪ����\r\n��֤��һ�н���
		 */
		
		//����¼��һ��int���͵�����һ���ַ���
		/*System.out.println("������һ����:");
		int x = sc.nextInt();
		System.out.println("������һ���ַ���:");
		String line = sc.nextLine();
		System.out.println("x = " + x + ",line = " + line);
		System.out.println(x);
		System.out.print("123456789");
		System.out.print(line);
		System.out.println("9876564321");*/
		
		/*
		 * �������
		 * 1.�������ζ���,�����˷ѿռ�
		 * 2.����¼��Ķ��Ǵ��ַ���,����nextLine����,�������ַ���ת���������ķ���(����ķ���)
		 */
		
		int x = sc.nextInt();
		Scanner sc2 = new Scanner(System.in);
		String line = sc2.next();
		System.out.println(x);
		System.out.println(line);
	}

}
