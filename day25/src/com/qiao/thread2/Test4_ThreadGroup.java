package com.qiao.thread2;

public class Test4_ThreadGroup {

	/**
	 * @param args
	 * 线程组
	 */
	public static void main(String[] args) {
		//demo1();
		ThreadGroup tg = new ThreadGroup("新的线程组");			//创建新的线程组
		MyRunnable mr = new MyRunnable();					//创建Runnable的子类对象
		
		Thread t1 = new Thread(tg, mr, "线程1");				//将线程t1放在组中
		Thread t2 = new Thread(tg, mr, "线程2");				//将线程t2放在组中
		
		System.out.println(t1.getThreadGroup().getName());	//获取线程组的名字
		System.out.println(t2.getThreadGroup().getName());
		
		//tg.setDaemon(true);		//线程组的好处,可以成组的设置
	}

	public static void demo1() {
		MyRunnable mr = new MyRunnable();
		Thread t1 = new Thread(mr, "线程1");
		Thread t2 = new Thread(mr, "线程2");
		
		ThreadGroup tg1 = t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();
		
		System.out.println(tg1.getName());		//默认是主线程
		System.out.println(tg2.getName());
	}

}

class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(Thread.currentThread().getName() + "     " + i);
		}
	}
	
}