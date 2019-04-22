package com.qiao.stringbuffer;

public class Test1_StringBuffer {

	/**
	 * A:StringBuffer的构造方法:
	 * 		public StringBuffer():无参构造
	 * 		public StringBuffer(int capacity):指定容量的字符串缓冲区对象
	 * 		public StringBuffer(String str):指定字符串内容的字符串缓冲区对象
	 * B:StringBuffer的方法:
	 * 		public int capacity():返回当前内容		理论值
	 * 		public int length():返回长度(字符数)		实际值
	 * C:构造方法和长度方法的使用
	 */
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();//没指定容器的初始容量,默认为16
		System.out.println(sb1.length());//0,容器中的字符个数,实际值
		System.out.println(sb1.capacity());//16,容器的初始容量,理论值
		
		StringBuffer sb2 = new StringBuffer(10);//指定容器的初始容量
		System.out.println(sb2.length());//0,容器中的字符个数
		System.out.println(sb2.capacity());//10,容器的初始容量
		
		StringBuffer sb3 = new StringBuffer("shiqiao");
		System.out.println(sb3.length());//7,容器中的字符个数
		System.out.println(sb3.capacity());//23,字符串的长度+初始容量
	}

}
