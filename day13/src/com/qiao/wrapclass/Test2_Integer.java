package com.qiao.wrapclass;

public class Test2_Integer {

	/**
	 * A:Integer类的概述
	 * 		Integer类在对象中包装了一个基本类型int的值
	 * 		该类提供了多个方法,能在int类型和String类型之间互相转换
	 * 		还提供了处理int类型时非常有用的其他一些常量和方法
	 * B:构造方法
	 * 		public Integer(int value)
	 * 		public Integer(String s)
	 */
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);//int取值范围最大值
		System.out.println(Integer.MIN_VALUE);//int取值范围最小值
		
		Integer i1 = new Integer(100);
		System.out.println(i1);
		
		//Integer i2 = new Integer("abc");//java.lang.NumberFormatException数字格式异常,因为abc不是数字字符串,所以转换会报错
		//System.out.println(i2);
		
		Integer i3 = new Integer("100");
		System.out.println(i3);
	}

}
