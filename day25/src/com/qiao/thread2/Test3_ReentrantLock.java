package com.qiao.thread2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Test3_ReentrantLock {

	/**
	 * @param args
	 * 1.5新特性互斥锁
	 */
	public static void main(String[] args) {
		final Printer3 p = new Printer3();
		
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
		
		new Thread() {
			public void run() {
				while(true) {
					try {
						p.print3();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
	}

}


class Printer3 {
	private ReentrantLock r = new ReentrantLock();
	private Condition c1 = r.newCondition();
	private Condition c2 = r.newCondition();
	private Condition c3 = r.newCondition();
	
	private int flag = 1;
	public void print1() throws InterruptedException {
		r.lock();					//获取锁
		if(flag != 1) {
			c1.await();				//当前线程等待
		}
		System.out.print("他");
		System.out.print("好");
		System.out.print("我");
		System.out.print("也");
		System.out.print("好");
		System.out.print("\r\n");
		flag = 2;
		c2.signal();				//唤醒指定的线程
		r.unlock();					//释放锁
	}
	
	public void print2() throws InterruptedException {
		r.lock();
		if(flag != 2) {
			c2.await();
		}
		System.out.print("汇");
		System.out.print("源");
		System.out.print("肾");
		System.out.print("宝");
		System.out.print("片");
		System.out.print("\r\n");
		flag = 3;
		c3.signal();
		r.unlock();
	}
	
	public void print3() throws InterruptedException {
		r.lock();
		if(flag != 3) {
			c3.await();			//当前线程等待
		}
		System.out.print("真");
		System.out.print("的");
		System.out.print("好");
		System.out.print("\r\n");
		flag = 1;
		c1.signal();
		r.unlock();
	}
}