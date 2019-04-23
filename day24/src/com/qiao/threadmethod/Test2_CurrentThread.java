package com.qiao.threadmethod;

public class Test2_CurrentThread {

	/**
	 * @param args
	 * currentThread:获取当前正在执行的线程
	 */
	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
				System.out.println(this.getName() + "       xxxxxxxx");
			}
		}.start();
		
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				//Thread.currentThread();				//获取当前正在执行的线程
				System.out.println(Thread.currentThread().getName() + "    yy");
			}
		}).start();
		
		Thread.currentThread().setName("主线程");						//给主线程改名
		System.out.println(Thread.currentThread().getName());		//获取主线程的名字
	}

}
