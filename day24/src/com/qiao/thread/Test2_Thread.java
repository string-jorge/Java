package com.qiao.thread;

public class Test2_Thread {

	/**
	 * @param args
	 * 实现多线线程方法一
	 */
	public static void main(String[] args) {
		MyThread mt = new MyThread();			//4.创建Thread子类对象
		mt.start();								//5.开启线程
		
		for (int i = 1; i < 1000; i++) {
			System.out.println("main");
		}
	}

}

class MyThread extends Thread {					//1.继承Thread
	@Override
	public void run() {							//2.重写run方法
		for (int i = 1; i < 1000; i++) {			//3.将要执行的代码写在run中
			System.out.println("这是MyThread");
		}
	}
}