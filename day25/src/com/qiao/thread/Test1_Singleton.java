package com.qiao.thread;

public class Test1_Singleton {

	/**
	 * @param args
	 * 单例设计模式
	 * 
	 * 饿汉式和懒汉式的区别
	 * 1.饿汉式是空间换时间,懒汉式是时间换空间
	 * 2.多线程访问时,饿汉式不会创建多个对象,而懒汉式有可能会创建多个对象
	 */
	public static void main(String[] args) {
		
	}

}
//饿汉式
/*class Singleton {
	//1.私有构造方法,其他类不能访问该构造方法
	private Singleton() {}
	//2.创建本类对象
	private static Singleton s = new Singleton();
	//3.对外提供公共的访问方法
	public static Singleton getSingleton() {	//获取实例
		return s;
	}
}*/

//懒汉式,单例的延迟加载模式
class Singleton {
	//1.私有构造方法,其他类不能访问该构造方法
	private Singleton() {}
	//2.创建本类对象
	private static Singleton s;
	//3.对外提供公共的访问方法
	public static Singleton getSingleton() {	//获取实例
		if(s == null) {
			s = new Singleton();
		}
		return s;
	}
}
//第三种模式
/*class Singleton {
	//1.私有构造方法,其他类不能访问该构造方法
	private Singleton() {}
	//2.创建本类对象
	public static final Singleton s = new Singleton();
}*/