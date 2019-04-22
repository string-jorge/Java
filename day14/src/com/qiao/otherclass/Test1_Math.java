package com.qiao.otherclass;

public class Test1_Math {

	/**
	 * A:Math的概述
	 * 		Math类包含用于执行基本数学运算的方法,如初等指数,对数,平方根和三角函数
	 * B:成员方法
	 * 		public static int abs(int a):取绝对值
	 * 		public static double ceil(double a):ceil是天花板的意思;向上取整,进一法
	 * 		public static double floor(double a):floor是地板的意思;向下取整,舍尾法
	 * 		public static int max(int a,int b):取较大值
	 * 		public static int min(int a,int b):取较小值
	 * 		public static double pow(double a,double b):2.0 ^ 3.0,前面的是底数,后面的是指数
	 * 		public static double random():随机生成0.0 - 1.0之间的小数;包含头,不包含尾
	 * 		public static int round(float a):四舍五入法
	 * 		public static double sqrt(double a):求平方根
	 */
	public static void main(String[] args) {
		//圆周率
		System.out.println(Math.PI);//3.141592654...圆周率
		
		//取绝对值
		System.out.println(Math.abs(-10));//10
		System.out.println(Math.abs(10));//10
		
		//进一法
		System.out.println(Math.ceil(12.3));//13.0
		
		//舍尾法
		System.out.println(Math.floor(12.3));//12.0
		
		//取较大值
		System.out.println(Math.max(20,30));//30
		
		//取较小值
		System.out.println(Math.min(20, 30));//20
		
		//求幂,前面的是底数,后面的是指数
		System.out.println(Math.pow(2.0, 3.0));//2.0 ^ 3.0 = 8.0,都是double类型
		
		//随机生成0.0 - 1.0之间的小数;包含头,不包含尾
		System.out.println(Math.random());//生成随机数
		
		//四舍五入
		System.out.println(Math.round(12.3f));//12,float类型
		System.out.println(Math.round(12.9f));//13,float类型
		System.out.println(Math.round(12.3));//12,double类型
		System.out.println(Math.round(12.9));//13,double类型
		
		//求平方根
		System.out.println(Math.sqrt(4));//2.0
		System.out.println(Math.sqrt(3));//1.732...
	}

}
