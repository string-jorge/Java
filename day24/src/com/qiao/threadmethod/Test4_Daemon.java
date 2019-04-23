package com.qiao.threadmethod;

public class Test4_Daemon {

	/**
	 * @param args
	 * Daemon:�ػ��߳�
	 */
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 2; i++) {
					System.out.println(getName() + "       xxxxxxx");
				}
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 50; i++) {
					System.out.println(getName() + "       yy");
				}
			}
		};
		t2.setDaemon(true);				//������true������ζ�������ػ��߳�
		t1.start();
		t2.start();
	}

}
