package com.qiao.otherclass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test7_SimpleDateFormat {

	/**
	 * A:SimpleDateFormat类的概述
	 * 		DateFormat 是日期/时间格式化子类的抽象类,它以与语言无关的方式格式化并解析日期或时间.
	 * B:SimpleDateFormat构造方法
	 * 		public SimpleDateFormat()
	 * 		public SimpleDateFormat(String pattern)
	 * C:成员方法
	 * 		public final String format(Date date)//格式化日期
	 * 		public Date parse(String source)//将字符串转换成日期对象
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		//demo1();
		//demo2();
		//demo3();
		//demo4();
	}

	private static void demo4() throws ParseException {
		//将时间字符串转换成日期对象
		String str = "2017年10月18日 05:02:01";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		Date d = sdf.parse(str);//将时间字符串转换成日期对象
		System.out.println(d);//Wed Oct 18 05:02:01 CST 2017
	}

	private static void demo3() {
		Date d = new Date();//获取当前时间对象
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");//创建日期格式化类对象
		System.out.println(sdf.format(d));//将日期对象转换成字符串
	}

	private static void demo2() {
		//空参构造
		Date d = new Date();//获取当前时间对象
		SimpleDateFormat sdf = new SimpleDateFormat();//创建日期格式化类对象
		System.out.println(sdf.format(d));//打印的结果,18-11-27 下午8:00
	}

	private static void demo1() {
		//DateFormat df = new DateFormat();//DateFormat是抽象类,不允许被实例化
		
		DateFormat df1 = DateFormat.getDateInstance();//相当于DateFormat df1 = new SimpleDateFormat();父类引用指向子类对象,右边的方法返回一个子类对象
	}

}
