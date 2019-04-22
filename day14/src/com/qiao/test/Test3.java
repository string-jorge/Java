package com.qiao.test;

import java.util.Calendar;
import java.util.Scanner;

public class Test3 {

	/**
	 * 键盘录入任意的年份,判断该年是闰年还是平年
	 * 
	 * Calendar c = Calendar.getInstance();
	 * 
	 * 分析:
	 * 		1.键盘录入年Scanner
	 * 		2.创建Calendar对象
	 * 		3.通过set方法设置为那一年的3月1日
	 * 		4.将日向前减去1
	 * 		5.判断日是多少天,如果是29天返回true否则返回false
	 */
	public static void main(String[] args) {
		//1.键盘录入年Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份,判断该年份是否是闰年:");
		//int year = sc.nextInt();//录入数字年份
		
		String line = sc.nextLine();//录入数字字符串
		int year = Integer.parseInt(line);//将数字字符串转换成int类型
		boolean b = judgeYear(year);//judge判断的意思
		System.out.println(b);
	}

	private static boolean judgeYear(int year) {
		//2.创建Calendar对象
		Calendar c = Calendar.getInstance();
		//3.通过set方法设置为那一年的3月1日
		c.set(year, 2, 1);//设置的某年的3月1日
		//4.将日向前减去1
		c.add(Calendar.DAY_OF_MONTH, -1);
		//5判断是否是29天?
		return c.get(Calendar.DAY_OF_MONTH) == 29;
	}

}
