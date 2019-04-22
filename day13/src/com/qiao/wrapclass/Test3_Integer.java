package com.qiao.wrapclass;

public class Test3_Integer {

	/**
	 * A:int -- String
	 * 		a:和""进行拼接
	 * 		b:public static String valueOf(int i)
	 * 		c:int -- Integer -- String(Integer类的toString方法())
	 * 		d:public static String toString(int i)(Integer类的静态方法)
	 * B:String -- int
	 * 		a:String -- Integer -- int
	 * 		public static int parseInt(String s)
	 * 
	 * 基本数据类型包装类有八种,其中七种都有parseXxx的方法,可以将这七种的字符串表现形式转换成基本数据类型
	 */
	public static void main(String[] args) {
		//demo1();
		//boolean类型
		String s1 = "true";
		boolean b = Boolean.parseBoolean(s1);
		System.out.println(b);
		
		String s2 = "abc";
		//char c = Character.p	//char的包装类Character中没有parseXxx的方法
		char[] arr = s2.toCharArray();//字符串到字符的转换通过toCharArray()就可以把字符串转换为字符数组
	}

	private static void demo1() {
		//int 转换成 String
		int i = 100;
		//i和""进行拼接成字符串
		String s1 = i + "";//(推荐)
		System.out.println(s1);
		
		//public static String valueOf(int i)
		String s2 = String.valueOf(i);//(推荐)
		System.out.println(s2);
		
		//int -- Integer -- String(Integer类的toString方法())
		Integer i2 = new Integer(i);
		String s3 = i2.toString();
		System.out.println(s3);
		
		String s4 = Integer.toString(i);
		System.out.println(s4);
		
		//String 转换成 int
		//String -- Integer -- int
		String s = "2000";
		Integer i3 = new Integer(s);
		int i4 = i3.intValue();//将Integer对象转换成int
		System.out.println(i4);
		
		int i5 = Integer.parseInt(s);//将String转换为int(推荐)
		System.out.println(i5);
	}

}
