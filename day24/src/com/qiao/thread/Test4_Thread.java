package com.qiao.thread;

public class Test4_Thread {

	/**
	 * @param args
	 * 匿名内部类实现线程的两种方法
	 */
	public static void main(String[] args) {
		new Thread() {									//1.继承Thread
			@Override
			public void run() {							//2.重写run方法
				for (int i = 0; i < 1000; i++) {		//3.将要执行的代码写在run方法中
					System.out.println("Thread");
				}
			}
		}.start();										//4.开启线程
		
		new Thread(new Runnable() {						//1.将Runnable的子类对象传递给Thread的构造
			@Override
			public void run() {							//2.重写run方法
				for (int i = 0; i < 1000; i++) {		//3.将要执行的代码写在run方法中
					System.out.println("Runnable");
				}
			}
		}).start();										//4.开启线程
	}

}
