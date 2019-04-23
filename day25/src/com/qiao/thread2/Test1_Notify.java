package com.qiao.thread2;

public class Test1_Notify {

	/**
	 * @param args
	 * 等待唤醒机制
	 * 两个线程间的通信
	 */
	public static void main(String[] args) {
		final Printer p = new Printer();
		
		new Thread() {
			public void run() {
				while(true) {
					try {
						p.print1();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true) {
					try {
						p.print2();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		}.start();
	}

}

class Printer {
	private int flag = 1;
	public void print1() throws InterruptedException {
		synchronized(this) {
			if(flag != 1) {
				this.wait();			//当前线程等待
			}
			System.out.print("他");
			System.out.print("好");
			System.out.print("我");
			System.out.print("也");
			System.out.print("好");
			System.out.print("\r\n");
			flag = 2;
			this.notify();				//随机唤醒单个等待的线程
		}
	}
	
	public void print2() throws InterruptedException {
		synchronized(this) {
			if(flag != 2) {
				this.wait();
			}
			System.out.print("汇");
			System.out.print("源");
			System.out.print("肾");
			System.out.print("宝");
			System.out.print("片");
			System.out.print("\r\n");
			flag = 1;
			this.notify();
		}
	}
}