package com.qiao.otherclass;

import java.util.Date;

public class Test6_Date {

	/**
	 * A:Date��ĸ���,��util���µ�,���ܵ���sql����
	 * 		��Date��ʾ�ض���˲��,��ȷ������
	 * B:���췽��
	 * 		public date()
	 * 		public date(long date)
	 * C:��Ա����
	 * 		public long getTime()
	 * 		public void setTime(long time)
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
	}

	private static void demo3() {
		//���ú���ֵ
		Date d1 = new Date();
		d1.setTime(1000);//���ú���ֵ,�ı�ʱ�����
		System.out.println(d1);
	}

	private static void demo2() {
		//��ȡ������
		Date d1 = new Date();
		System.out.println(d1.getTime());//ͨ��ʱ������ȡ����ֵ
		
		System.out.println(System.currentTimeMillis());//ͨ��ϵͳ��ķ�����ȡ��ǰʱ��ĺ���ֵ
	}

	private static void demo1() {
		//�ղι���
		Date d1 = new Date();//���û�в�������,������ǵ�ǰʱ��
		System.out.println(d1);
		//�вι���
		Date d2 = new Date(0);//������췽���в�����Ϊ0,�������1970��1��1��
		System.out.println(d2);//ͨ������ֵ����ʱ�����
	}

}
