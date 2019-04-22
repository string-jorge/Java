package com.qiao.otherclass;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test8_Calendar {

	/**
	 * A:Calendar��ĸ���(������)
	 * 		Calendar����һ��������,��Ϊ�ض�˲����һ������ YERAR.MONTH.DAY_OF_MONTH.HOUR�������ֶ�֮���ת���ṩ��һЩ����,��Ϊ���������ֶ�(�����������ڵ�����)�ṩ��һЩ����
	 * B:��Ա����
	 * 		public static Calendar getInstance():ʹ��Ŀǰ��ʱ�������Ի����ķ����õ�һ��������
	 * 		public int get(int field):��ȡ�����е�ֵ
	 * C:��Ա����
	 * 		public void add(int field,int amonth)��������
	 * 		public final void set(int year,int month,int date)//�޸�����
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
	}

	private static void demo2() {
		Calendar c = Calendar.getInstance();//��������ָ���������
		/*//��ָ���ֶν�����ǰ��������
		c.add(Calendar.YEAR,-1);//��-1
		c.add(Calendar.MONTH,1);//�·�+1*/
		//�޸�ָ���ֶ�
		c.set(Calendar.YEAR,2000);//�޸�ָ���ֶ�,����޸�Ϊ2000��
		c.set(2000,7,8);
		System.out.println(c.get(Calendar.YEAR) + "��" + getNum((c.get(Calendar.MONTH) + 1)) + "��" + getNum(c.get(Calendar.DAY_OF_MONTH)) + "��" + " " + getWeek(c.get(Calendar.DAY_OF_WEEK)));
	}

	private static void demo1() {
		Calendar c = Calendar.getInstance();//��������ָ���������,new GregorianCalendar(zone, aLocale)
		//System.out.println(c);//֤����дtoString������ӡ�˶�������������
		System.out.println(c.get(Calendar.YEAR));//ͨ���ֶλ�ȡ��
		System.out.println(c.get(Calendar.MONTH) + 1);//ͨ���ֶλ�ȡ��,�·��Ǵ�0��ʼ��ŵ�,��Ҫ��1���ǵ�ǰ�·�
		System.out.println(c.get(Calendar.DAY_OF_MONTH));//ͨ���ֶλ�ȡ��,���еĵڼ���
		System.out.println(c.get(Calendar.DAY_OF_WEEK));//�����ǵ�һ��,���������һ��
		
		System.out.println(c.get(Calendar.YEAR) + "��" + getNum((c.get(Calendar.MONTH) + 1)) + "��" + getNum(c.get(Calendar.DAY_OF_MONTH)) + "��" + " " + getWeek(c.get(Calendar.DAY_OF_WEEK)));
	}
	
	/*
	 * �����ڴ洢���н��в��
	 * 1.����ֵString
	 * 2.�����б�int week
	 */
	public static String getWeek(int week) {
		String[] arr = {"","������","����һ","���ڶ�","������","������","������","������"};
		return arr[week];
	}
	
	/*
	 * ����Ǹ�λ����ǰ�油0
	 * 1.����ֵ����String
	 * 2.�����б�int num
	 */
	public static String getNum(int num) {
		/*if(num > 9) {
			return "" + num;
		}else {
			return "0" + num;
		}*/
		return num > 9 ? "" + num : "0" + num;
	}
}
