package com.qiao.scanner;

import java.util.Scanner;

public class Test1_Scanner {

	/**
	 * A:Scanner�ĸ���
	 * B:Scanner�Ĺ��췽��ԭ��
	 * 		Scanner(InputStream source)
	 * 		System�����и���̬�ֶ�
	 * 			public static final InputStream in;��׼��������,��Ӧ�ż���¼��
	 * C:һ�㷽��
	 * hasNextXxx() �ж��Ƿ�����һ��һ��������,����Int������Int,Double��.�����Ҫ�жϰ�����һ���ַ���,�����ʡ��Xxx		//hasNext()�Д��Ƿ���ַ���
	 * nextXxx() ��ȡ��һ��������,Xxx�ĺ�����ϸ������е�Xxx��ͬ,Ĭ�������,Scannerʹ�ÿո�,�س�����Ϊ�ָ���
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//����¼��
		//int i = sc.nextInt();//����¼�������洢����
		//System.out.println(i);
		if(sc.hasNextInt()) {//�ж��Ƿ�Ϊint���͵���
			int i = sc.nextInt();//�����,����i����¼�����
			System.out.println(i);
		}else{//������ʾ"�������ʹ���"
		System.out.println("�������ʹ���");
		}
	}

}
