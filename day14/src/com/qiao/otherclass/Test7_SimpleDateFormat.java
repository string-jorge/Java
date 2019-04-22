package com.qiao.otherclass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test7_SimpleDateFormat {

	/**
	 * A:SimpleDateFormat��ĸ���
	 * 		DateFormat ������/ʱ���ʽ������ĳ�����,�����������޹صķ�ʽ��ʽ�����������ڻ�ʱ��.
	 * B:SimpleDateFormat���췽��
	 * 		public SimpleDateFormat()
	 * 		public SimpleDateFormat(String pattern)
	 * C:��Ա����
	 * 		public final String format(Date date)//��ʽ������
	 * 		public Date parse(String source)//���ַ���ת�������ڶ���
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		//demo1();
		//demo2();
		//demo3();
		//demo4();
	}

	private static void demo4() throws ParseException {
		//��ʱ���ַ���ת�������ڶ���
		String str = "2017��10��18�� 05:02:01";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		Date d = sdf.parse(str);//��ʱ���ַ���ת�������ڶ���
		System.out.println(d);//Wed Oct 18 05:02:01 CST 2017
	}

	private static void demo3() {
		Date d = new Date();//��ȡ��ǰʱ�����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");//�������ڸ�ʽ�������
		System.out.println(sdf.format(d));//�����ڶ���ת�����ַ���
	}

	private static void demo2() {
		//�ղι���
		Date d = new Date();//��ȡ��ǰʱ�����
		SimpleDateFormat sdf = new SimpleDateFormat();//�������ڸ�ʽ�������
		System.out.println(sdf.format(d));//��ӡ�Ľ��,18-11-27 ����8:00
	}

	private static void demo1() {
		//DateFormat df = new DateFormat();//DateFormat�ǳ�����,������ʵ����
		
		DateFormat df1 = DateFormat.getDateInstance();//�൱��DateFormat df1 = new SimpleDateFormat();��������ָ���������,�ұߵķ�������һ���������
	}

}
