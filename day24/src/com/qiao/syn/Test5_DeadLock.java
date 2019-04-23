package com.qiao.syn;

public class Test5_DeadLock {

	/**
	 * @param args
	 * 死锁
	 * 
	 * 为了避免同步代码块出现死锁状态,不要嵌套使用同步代码块
	 * 
	 * Vector是线程安全的,ArrayList是线程不安全的
	 * StringBuffer是线程安全的,StringBuilder是线程不安全的
	 * Hashtable是线程安全的,HashMap是线程不安全的
	 * Collections.synchronizedXXX()是将线程不安全的转换成线程安全的
	 */
	private static String s1 = "左筷子";
	private static String s2 = "右筷子";
	public static void main(String[] args) {
		
		new Thread() {
			public void run() {
				while(true) {
					synchronized(s1) {
						System.out.println(getName() + "     获取" + s1 + "等待" + s2);
						synchronized(s2) {
							System.out.println(getName() + "     拿到" + s2 + "开吃");
						}
					}
				}
			};
		}.start();
		
		new Thread() {
			public void run() {
				while(true) {
					synchronized(s2) {
						System.out.println(getName() + "     获取" + s2 + "等待" + s1);
						synchronized(s1) {
							System.out.println(getName() + "     拿到" + s1 + "开吃");
						}
					}
				}
			};
		}.start();
	}

}
