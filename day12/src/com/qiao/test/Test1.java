package com.qiao.test;

import java.util.Scanner;

public class Test1 {

	/**
	 * A:����:
	 * 		1.ģ���½,�����λ���,����ʾ���м���
	 * 		2.�û��������붼��admin
	 * B:����:
	 * 		1.ģ���½,��Ҫ����¼��,Scanner
	 * 		2.�����λ���,��Ҫѭ��,for
	 * 		3.����ʾ�м���,��Ҫ�ж�,if
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//��������¼�����
		for(int x = 1;x <= 3;x++){//�����λ���
			System.out.println("�������û���:");
			String userName = sc.nextLine();//��¼¼����û���
			System.out.println("����������:");
			String passWord = sc.nextLine();//��¼¼�������
		
			if("admin".equals(userName) && "admin".equals(passWord)) {//�ж��û����������Ƿ���ȷ
				System.out.println("��ӭ");
				break;//��ȷ����ѭ��
			}else{
				if(x == 3) {
					System.out.println("�����Ĵ�������,����������!");
				}else{
					System.out.println("�û������������!" + "������" + (3-x) + "�λ���");
				}
			}
		}
	}
}
