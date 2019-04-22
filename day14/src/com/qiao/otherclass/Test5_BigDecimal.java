package com.qiao.otherclass;

import java.math.BigDecimal;

public class Test5_BigDecimal {

	/**
	 * A:BigDecimal类的概述
	 * 		由于运算的时候,float类型和double类型很容易丢失精度
	 * 		所以,为了能精确的表示,计算浮点数,Java提供了BigDecimal
	 * 
	 * 		不可变的,任意精度的有符号十进制数
	 * B:构造方法
	 * 		public BigDecimal(String val)
	 * C:成员方法
	 * 		public BigDecimal add(BigDecimal augend)
	 * 		public BigDecimal subtract(BigDecimal subtrahend)
	 * 		public BigDecimal multiply(BigDecimal multiplicand)
	 * 		public BigDecimal divide(BigDecimal divisor)
	 */
	public static void main(String[] args) {
		//相减
		//System.out.println(2.0 - 1.1);//0.8999999999999999
		/*BigDecimal bd1 = new BigDecimal(2.0);//这种方式在开发中不推荐,因为不够精确
		BigDecimal bd2 = new BigDecimal(1.1);
		System.out.println(bd1.subtract(bd2));*/
		
		BigDecimal bd1 = new BigDecimal("2.0");//精确,通过构造中传入字符串的方式,开发时推荐
		BigDecimal bd2 = new BigDecimal("1.1");
		System.out.println(bd1.subtract(bd2));//0.9
		
		BigDecimal bd3 = BigDecimal.valueOf(2.0);//精确,这种方式在开发中也是推荐的
		BigDecimal bd4 = BigDecimal.valueOf(1.1);
		System.out.println(bd3.subtract(bd4));//0.9
		
		//相加
		System.out.println(bd1.add(bd2));//3.1
		
		System.out.println(bd3.add(bd4));//3.1
		
		//相乘
		System.out.println(bd1.multiply(bd2));//2.20
		System.out.println(bd3.multiply(bd4));//2.20
		
		//相除
		BigDecimal bd5 = new BigDecimal("2.0");
		BigDecimal bd6 = new BigDecimal("1.0");
		System.out.println(bd5.divide(bd6));//2
		
		BigDecimal bd7 = BigDecimal.valueOf(2.0);
		BigDecimal bd8 = BigDecimal.valueOf(1.0);
		System.out.println(bd7.divide(bd8));//2
	}

}
