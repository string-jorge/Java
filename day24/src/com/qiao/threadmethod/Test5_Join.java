package com.qiao.threadmethod;

public class Test5_Join {

	/**
	 * @param args
	 * join:�����߳�
	 */
	public static void main(String[] args) {
		final Thread t1 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					System.out.println(getName() + "       xxxxxxx");
				}
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					if(i == 2) {
						try {
							//t1.join();
							t1.join(1);							//ָ����ӵ�ʱ��1����,����ָ��ʱ���,�����߳̽���ִ��
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println(getName() + "       yy");
				}
			}
		};
		
		t1.start();
		t2.start();
	}

}
