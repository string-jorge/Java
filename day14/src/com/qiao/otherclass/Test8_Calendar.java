package com.qiao.otherclass;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test8_Calendar {

	/**
	 * A:Calendar类的概述(日历类)
	 * 		Calendar类是一个抽象类,它为特定瞬间与一组诸如 YERAR.MONTH.DAY_OF_MONTH.HOUR等日历字段之间的转换提供了一些方法,并为操作日历字段(例如获得下星期的日期)提供了一些方法
	 * B:成员方法
	 * 		public static Calendar getInstance():使用目前的时区和语言环境的方法得到一个日历。
	 * 		public int get(int field):获取日历中的值
	 * C:成员方法
	 * 		public void add(int field,int amonth)操作日期
	 * 		public final void set(int year,int month,int date)//修改日期
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
	}

	private static void demo2() {
		Calendar c = Calendar.getInstance();//父类引用指向子类对象
		/*//对指定字段进行向前减或向后加
		c.add(Calendar.YEAR,-1);//年-1
		c.add(Calendar.MONTH,1);//月分+1*/
		//修改指定字段
		c.set(Calendar.YEAR,2000);//修改指定字段,年份修改为2000年
		c.set(2000,7,8);
		System.out.println(c.get(Calendar.YEAR) + "年" + getNum((c.get(Calendar.MONTH) + 1)) + "月" + getNum(c.get(Calendar.DAY_OF_MONTH)) + "日" + " " + getWeek(c.get(Calendar.DAY_OF_WEEK)));
	}

	private static void demo1() {
		Calendar c = Calendar.getInstance();//父类引用指向子类对象,new GregorianCalendar(zone, aLocale)
		//System.out.println(c);//证明重写toString方法打印了对象中所有属性
		System.out.println(c.get(Calendar.YEAR));//通过字段获取年
		System.out.println(c.get(Calendar.MONTH) + 1);//通过字段获取月,月份是从0开始编号的,需要加1才是当前月份
		System.out.println(c.get(Calendar.DAY_OF_MONTH));//通过字段获取日,月中的第几天
		System.out.println(c.get(Calendar.DAY_OF_WEEK));//周日是第一天,周六是最后一天
		
		System.out.println(c.get(Calendar.YEAR) + "年" + getNum((c.get(Calendar.MONTH) + 1)) + "月" + getNum(c.get(Calendar.DAY_OF_MONTH)) + "日" + " " + getWeek(c.get(Calendar.DAY_OF_WEEK)));
	}
	
	/*
	 * 将星期存储表中进行查表
	 * 1.返回值String
	 * 2.参数列表int week
	 */
	public static String getWeek(int week) {
		String[] arr = {"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
		return arr[week];
	}
	
	/*
	 * 如果是各位数字前面补0
	 * 1.返回值类型String
	 * 2.参数列表int num
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
