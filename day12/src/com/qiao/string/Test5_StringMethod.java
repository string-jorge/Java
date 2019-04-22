package com.qiao.string;

public class Test5_StringMethod {
	/**
	 * int length():获取字符串长度
	 * char charAt(int index):获取指定索引的位置的字符
	 * int indexOf(intch):返回指定字符在此字符串中第一次出现的的索引 
	 * int indexOf(String str):返回指定字符串在此字符串中第一次出现的的索引
	 * int indexOf(int ch,int fromIndex):返回指定字符在此字符串中从指定位置后第一次出现的索引 
	 * int indexOf(String str,int fromIndex):返回指定字符串在此字符串中从指定位置后第一次出现的索引 
	 * lastIndexOf
	 * String substring(int start):从指定位置开始截取字符串,默认到结尾 
	 * String substring(int start,int end):从指定位置开始到指定位置结束截取字符串
	 */
	public static void main(String[] args) {
		// demo1();
		// demo2();
		// demo3();
		// demo4();
		// demo5();
	}

	private static void demo5() {
		//面试题
		String s = "woaishiqiao";
		s.substring(4);// 这里没有记录新生成的字符串,substring会产生一个新的字符串,需要将新的字符串记录
		System.out.println(s);// "woaishiqiao",打印的是对象s
	}

	private static void demo4() {
		// 从指定位置开始截取字符串,默认到末尾
		String s1 = "shiqiaowudi";
		String s2 = s1.substring(7);// 从指定位置(索引7)开始截取到末尾
		System.out.println(s2);

		// 从指定位置开始到指定位置结束截取字符串
		String s3 = s1.substring(0, 7);// 截取"shiqiao",从0索引开始到7索引,不包含索引7,包含头,不包含尾,左闭右开
		System.out.println(s3);
	}

	private static void demo3() {
		// 返回指定字符在此字符串中从指定位置后第一次出现的索引
		String s1 = "woaishiqiao";
		int index1 = s1.indexOf('a', 3);// 9,从指定位置(索引3)开始向后找字符'a'
		System.out.println(index1);

		// 返回指定字符串在此字符串中从指定位置后第一次出现的索引
		String s2 = "woai,woaini";
		int index2 = s2.indexOf("ai", 4);// 7,从指定位置(索引4)开始向后找字符串"ai"
		System.out.println(index2);

		// lastIndexOf;从后向前找,第一次出现的字符
		int index3 = s2.lastIndexOf('a');// 7,从后向前找,第一次出现的字符'a'
		System.out.println(index3);

		int index4 = s2.lastIndexOf('a', 6);// 2,从指定位置(索引6)开始向前找字符'a'
		System.out.println(index4);
	}

	private static void demo2() {
		// 返回指定字符在此字符串中第一次出现的的索引
		String s1 = "shiqiao";
		int index1 = s1.indexOf('h');// 1,参数接受的是int类型的,传递char类型的会自动提升
		System.out.println(index1);

		int index2 = s1.indexOf('x');
		System.out.println(index2);// -1,如果不存在返回就是-1

		// 返回指定字符串在此字符串中第一次出现的的索引
		int index3 = s1.indexOf("qiao");// 3,获取字符串中第一个字符出现的位置
		System.out.println(index3);

		int index4 = s1.indexOf("io");// -1没有相连,找不到字符串
		System.out.println(index4);
	}

	private static void demo1() {
		/*
		 * int[] arr = {10,20,30};
		 * System.out.println(arr.length);//数组中的length是属性
		 */
		// 获取字符串长度
		String s1 = "shiqiao";
		System.out.println(s1.length());// 长度是7
		String s2 = "你要减肥,造吗?";
		System.out.println(s2.length());// 长度是8,length是一个方法获取的是每一个字符的个数,中文也是一个字符

		// 获取指定索引的位置的字符
		char c1 = s2.charAt(5);// 根据索引获取对应位置的字符
		System.out.println(c1);

		char c2 = s2.charAt(10);// StringIndexOutOfBoundsException字符串索引越界异常
		System.out.println(c2);
	}

}
