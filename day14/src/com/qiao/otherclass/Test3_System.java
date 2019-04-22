package com.qiao.otherclass;

public class Test3_System {

	/**
	 * A:System类的概述
	 * 		System类包含一些有用的类字段和方法.他不能被实例化
	 * B:成员方法
	 * 		public static void gc():运行垃圾回收器
	 * 		public static void exit(int status):退出JVM
	 * 		public static long currentTimeMillis():获取当前时间的毫秒值
	 * 		public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		//demo4();
	}

	private static void demo4() {
		//将数组内容拷贝
		int[] src = {11,22,33,44,55};
		int[] dest = new int[8];
		for (int i = 0; i < dest.length; i++) {
			System.out.println(dest[i]);
		}
		System.out.println("---------------------");
		System.arraycopy(src, 0, dest, 0, src.length);
		
		for (int i = 0; i < dest.length; i++) {
			System.out.println(dest[i]);
		}
	}

	private static void demo3() {
		//获取当前时间的毫秒值
		long start = System.currentTimeMillis();//开始的时间,获取当前时间的毫秒值
		for(int i = 0;i <= 1000;i++) {
			System.out.println("*");
		}
		long end = System.currentTimeMillis();//结束的时间
		System.out.println(end - start);//程序运行的时间
	}

	private static void demo2() {
		//退出JVM
		System.exit(0);//非0状态是异常终止,退出JVM
		System.out.println("123");//不执行
	}

	private static void demo1() {
		//运行垃圾回收器
		for(int i = 0; i < 100;i++) {
			new Test();
			System.gc();//运行垃圾回收器
		}
	}
}

class Test {//在一个源文件中不允许定义两个用public修饰的类

	@Override
	public void finalize() {
		System.out.println("垃圾被清扫了");
	}
	
}