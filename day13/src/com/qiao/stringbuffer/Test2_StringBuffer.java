package com.qiao.stringbuffer;

public class Test2_StringBuffer {

	/**
	 * A:StringBuffer的添加功能
	 * 		public StringBuffer append(String str):
	 * 			可以把任意类型数据添加到字符串缓冲区里面,并返回字符串缓冲区本身
	 * 		public StringBuffer insert(int offset,String str):
	 * 			在指定位置把任意数据类型插入到字符串缓冲区里面,并返回字符串缓冲区本身
	 * 			StringBuffer是字符串缓冲区,当new的时候是在堆内存创建了一个对象,底层是一个长度是16的字符数组
	 * 		当调用添加的方法时,不会再重新创建对象,在不断向原缓冲区添加字符
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
	}

	private static void demo2() {
		//StringBuffer的添加功能,在指定位置把任意数据类型插入到字符串缓冲区里面
		StringBuffer sb1 = new StringBuffer("1234");
		sb1.insert(3, "shiqiao");//在指定位置添加元素,如果没有指定位置的索引就会报索引越界异常
		System.out.println(sb1);
	}

	private static void demo1() {
		//StringBuffer的添加功能,把任意类型数据添加到字符串缓冲区里面
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = sb1.append(true);
		StringBuffer sb3 = sb1.append("shiqiao");
		StringBuffer sb4 = sb1.append(100);
		
		System.out.println(sb1.toString());//trueshiqiao100,StringBuffer类中重写了toString方法,显示的是对象中的属性值
		System.out.println(sb2);//trueshiqiao100,如果直接打印对象引用,会默认调用toString方法
		System.out.println(sb3);//trueshiqiao100
		System.out.println(sb4);//trueshiqiao100
	}

}