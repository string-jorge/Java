package com.qiao.test;

import java.util.Calendar;
import java.util.Scanner;

public class Test3 {

	/**
	 * ����¼����������,�жϸ��������껹��ƽ��
	 * 
	 * Calendar c = Calendar.getInstance();
	 * 
	 * ����:
	 * 		1.����¼����Scanner
	 * 		2.����Calendar����
	 * 		3.ͨ��set��������Ϊ��һ���3��1��
	 * 		4.������ǰ��ȥ1
	 * 		5.�ж����Ƕ�����,�����29�췵��true���򷵻�false
	 */
	public static void main(String[] args) {
		//1.����¼����Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("���������,�жϸ�����Ƿ�������:");
		//int year = sc.nextInt();//¼���������
		
		String line = sc.nextLine();//¼�������ַ���
		int year = Integer.parseInt(line);//�������ַ���ת����int����
		boolean b = judgeYear(year);//judge�жϵ���˼
		System.out.println(b);
	}

	private static boolean judgeYear(int year) {
		//2.����Calendar����
		Calendar c = Calendar.getInstance();
		//3.ͨ��set��������Ϊ��һ���3��1��
		c.set(year, 2, 1);//���õ�ĳ���3��1��
		//4.������ǰ��ȥ1
		c.add(Calendar.DAY_OF_MONTH, -1);
		//5�ж��Ƿ���29��?
		return c.get(Calendar.DAY_OF_MONTH) == 29;
	}

}
