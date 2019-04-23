package com.qiao.threadmethod;

public class Test1_Name {

	/**
	 * @param args
	 * getName:获取线程的名字
	 * setName:设置线程的名字
	 */
	public static void main(String[] args) {
		//demo1();
		Thread t1 = new Thread() {										//通过构造好书给线程取名字
			@Override
			public void run() {
				//this.setName("线程1");
				System.out.println(this.getName() + "    zzzzzzzz");
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				//this.setName("线程2");
				System.out.println(this.getName() + "    ww");
			}
		};
		
		t1.setName("线程1");
		t2.setName("线程2");
		t1.start();
		t2.start();
	}

	public static void demo1() {
		new Thread("线程1") {										//通过构造好书给线程取名字
			@Override
			public void run() {
				System.out.println(this.getName() + "    xxxxxxxx");
			}
		}.start();
		
		new Thread("线程2") {
			@Override
			public void run() {
				System.out.println(this.getName() + "    yy");
			}
		}.start();
	}

}
