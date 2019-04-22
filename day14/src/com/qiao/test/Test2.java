package com.qiao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {

	/**
	 * 算一下你来到这个世界多少天?
	 * 分析:
	 * 1.将生日字符串和今天字符串存储在String类型变量中
	 * 2.定义日期格式化对象
	 * 3.将日期字符串转换成日期对象
	 * 4.通过日期对象获取时间毫秒值
	 * 5.将两个时间毫秒相减除以100,再除以60,再除以60,再除以24de'dao天数
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		//1.将生日字符串和今天字符串存储在String类型变量中
		String birthday = "1999年06月028日";
		String today = "2018年11月27日";
		//2.定义日期格式化对象
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		//3.将日期字符串转换成日期对象
		Date d1 = sdf.parse(birthday);
		Date d2 = sdf.parse(today);
		//4.通过日期对象获取时间毫秒值
		long time = d2.getTime() - d1.getTime();
		//5.将两个时间毫秒相减除以100,再除以60,再除以60,再除以24de'dao天数
		System.out.println(time / 1000 / 60 / 60 / 24);
	}

}
