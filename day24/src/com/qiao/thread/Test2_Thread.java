package com.qiao.thread;

public class Test2_Thread {

	/**
	 * @param args
	 * ʵ�ֶ����̷߳���һ
	 */
	public static void main(String[] args) {
		MyThread mt = new MyThread();			//4.����Thread�������
		mt.start();								//5.�����߳�
		
		for (int i = 1; i < 1000; i++) {
			System.out.println("main");
		}
	}

}

class MyThread extends Thread {					//1.�̳�Thread
	@Override
	public void run() {							//2.��дrun����
		for (int i = 1; i < 1000; i++) {			//3.��Ҫִ�еĴ���д��run��
			System.out.println("����MyThread");
		}
	}
}