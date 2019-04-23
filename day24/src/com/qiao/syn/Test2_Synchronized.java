package com.qiao.syn;

public class Test2_Synchronized {

	/**
	 * @param args
	 * 同步代码块
	 */
	public static void main(String[] args) {
		final Printer2 p = new Printer2();
		
		Thread t1 = new Thread() {
			@SuppressWarnings("static-access")
			public void run() {
				while(true) {
					p.print1();
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				while(true) {
					p.print2();
				}
			}
		};
		
		t1.start();
		t2.start();
	}
}
/*
 * 非静态的同步方法的锁对象是this
 * 静态同步方法的锁对象是该类的字节码对象
 */
class Printer2 {
	public static synchronized void print1() {			//同步方法只需要在方法上加synchronized关键字即可
			System.out.print("他");
			System.out.print("好");
			System.out.print("我");
			System.out.print("也");
			System.out.print("好");
			System.out.print("\r\n");
	}
	
	public void print2() {
		synchronized(Printer2.class) {
			System.out.print("汇");
			System.out.print("源");
			System.out.print("肾");
			System.out.print("宝");
			System.out.print("片");
			System.out.print("\r\n");
		}
	}
}