package com.qiao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {

	/**
	 * ��һ��������������������?
	 * ����:
	 * 1.�������ַ����ͽ����ַ����洢��String���ͱ�����
	 * 2.�������ڸ�ʽ������
	 * 3.�������ַ���ת�������ڶ���
	 * 4.ͨ�����ڶ����ȡʱ�����ֵ
	 * 5.������ʱ������������100,�ٳ���60,�ٳ���60,�ٳ���24de'dao����
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		//1.�������ַ����ͽ����ַ����洢��String���ͱ�����
		String birthday = "1999��06��028��";
		String today = "2018��11��27��";
		//2.�������ڸ�ʽ������
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
		//3.�������ַ���ת�������ڶ���
		Date d1 = sdf.parse(birthday);
		Date d2 = sdf.parse(today);
		//4.ͨ�����ڶ����ȡʱ�����ֵ
		long time = d2.getTime() - d1.getTime();
		//5.������ʱ������������100,�ٳ���60,�ٳ���60,�ٳ���24de'dao����
		System.out.println(time / 1000 / 60 / 60 / 24);
	}

}
