package com.qiao.thread;

public class Test4_Thread {

	/**
	 * @param args
	 * �����ڲ���ʵ���̵߳����ַ���
	 */
	public static void main(String[] args) {
		new Thread() {									//1.�̳�Thread
			@Override
			public void run() {							//2.��дrun����
				for (int i = 0; i < 1000; i++) {		//3.��Ҫִ�еĴ���д��run������
					System.out.println("Thread");
				}
			}
		}.start();										//4.�����߳�
		
		new Thread(new Runnable() {						//1.��Runnable��������󴫵ݸ�Thread�Ĺ���
			@Override
			public void run() {							//2.��дrun����
				for (int i = 0; i < 1000; i++) {		//3.��Ҫִ�еĴ���д��run������
					System.out.println("Runnable");
				}
			}
		}).start();										//4.�����߳�
	}

}
