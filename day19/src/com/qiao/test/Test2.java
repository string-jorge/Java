package com.qiao.test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Test2 {

	/**
	 * Alt + Shift + z(try catch��ݼ�)
	 * ����¼��һ��int���͵�����,����������Ƶı�����ʽ
	 * ���¼�����������,������ʾ,¼�����������������¼��һ������BigInteger
	 * ���¼�����С��,������ʾ,¼�����С��,������¼��һ������
	 * ���¼��������ַ�,������ʾ,¼����ǷǷ��ַ�,������¼��һ������
	 * 
	 * ����:
	 * 1.��������¼�����
	 * 2.������¼��Ľ���洢��String���͵��ַ�����,�洢int����������ֲ�����������ֱ�ӱ���,�޷����к����ж�
	 * 3.����¼��Ľ��ת����int���͵�����,����ȷ�Ļ��Ǵ����
	 * 4.��ȷ��ֱ��ת��
	 * 5.�����Ҫ���ж�Ӧ�ж�
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������:");
		
		while(true) {
			String line = sc.nextLine();//������¼��Ľ���洢��line��
			try {
				int num = Integer.parseInt(line);//���ַ���ת��Ϊ����
				System.out.println(Integer.toBinaryString(num));
				break;
			} catch(Exception e1) {
				try {
					new BigInteger(line);
				System.out.println("¼�����,��¼�����һ����������,����������һ������:");
				} catch(Exception e2) {
					try {
						new BigDecimal(line);
						System.out.println("¼�����,��¼�����һ��С��,����������һ������:");
					} catch (Exception e3) {
						System.out.println("¼�����,��¼����ǷǷ��ַ�,����������һ������:");
					}
				}
			}
		}
	}
}
