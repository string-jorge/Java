package com.qiao.syn;

public class Test1_Synchronized {

	/**
	 * @param args
	 * 同步代码块
	 */
	public static void main(String[] args) {
		final Printer p = new Printer();
		
		Thread t1 = new Thread() {
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

class Printer {
	Test t = new Test();
	public void print1() {
		//synchronized(new Test()) {	//锁对象不能用匿名对象,因为匿名对象不是同一个对象
		synchronized(t) {				//同步代码块,锁机制,所对象可以是任意的
			System.out.print("他");
			System.out.print("好");
			System.out.print("我");
			System.out.print("也");
			System.out.print("好");
			System.out.print("\r\n");
		}
	}
	
	public void print2() {
		synchronized(t) {
			System.out.print("汇");
			System.out.print("源");
			System.out.print("肾");
			System.out.print("宝");
			System.out.print("片");
			System.out.print("\r\n");
		}
	}
}

class Test {}