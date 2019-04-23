package com.qiao.threadmethod;

public class Test7_Priority {

	/**
	 * @param args
	 * priority:设直线程优先级
	 */
	public static void main(String[] args) {
		Thread t1 = new Thread(){
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println(this.getName() + "      xxxxxxx");
				}
			}
		};
		
		Thread t2 = new Thread(){
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println(this.getName() + "      yy");
				}
			}
		};
		
		//t1.setPriority(10);						//设置最大线程的优先级
		//t2.setPriority(1);						//设置最小线程的优先级
		
		t1.setPriority(Thread.MIN_PRIORITY);		//设置最小线程的优先级
		t2.setPriority(Thread.MAX_PRIORITY);		//设置最小线程的优先级
		t1.start();
		t2.start();
	}

}
