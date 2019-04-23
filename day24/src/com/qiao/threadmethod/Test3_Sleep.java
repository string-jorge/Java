package com.qiao.threadmethod;

public class Test3_Sleep {

	/**
	 * @param args
	 * sleep:休眠线程
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		//demo1();
		new Thread() {
			public void run() {
				for (int i = 1; i < 10; i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(getName() + "       xxxxxxx");
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				for (int i = 1; i < 10; i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(getName() + "       yy");
				}
			}
		}.start();
	}

	public static void demo1() throws InterruptedException {
		for (int i = 20; i >= 0; i--) {
			Thread.sleep(1000);
			System.out.println("倒计时" + i + "秒");
		}
	}

}
