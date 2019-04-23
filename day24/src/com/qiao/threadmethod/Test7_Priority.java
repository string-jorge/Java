package com.qiao.threadmethod;

public class Test7_Priority {

	/**
	 * @param args
	 * priority:��ֱ�߳����ȼ�
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
		
		//t1.setPriority(10);						//��������̵߳����ȼ�
		//t2.setPriority(1);						//������С�̵߳����ȼ�
		
		t1.setPriority(Thread.MIN_PRIORITY);		//������С�̵߳����ȼ�
		t2.setPriority(Thread.MAX_PRIORITY);		//������С�̵߳����ȼ�
		t1.start();
		t2.start();
	}

}
