package com.qiao.thread2;

public class Test4_ThreadGroup {

	/**
	 * @param args
	 * �߳���
	 */
	public static void main(String[] args) {
		//demo1();
		ThreadGroup tg = new ThreadGroup("�µ��߳���");			//�����µ��߳���
		MyRunnable mr = new MyRunnable();					//����Runnable���������
		
		Thread t1 = new Thread(tg, mr, "�߳�1");				//���߳�t1��������
		Thread t2 = new Thread(tg, mr, "�߳�2");				//���߳�t2��������
		
		System.out.println(t1.getThreadGroup().getName());	//��ȡ�߳��������
		System.out.println(t2.getThreadGroup().getName());
		
		//tg.setDaemon(true);		//�߳���ĺô�,���Գ��������
	}

	public static void demo1() {
		MyRunnable mr = new MyRunnable();
		Thread t1 = new Thread(mr, "�߳�1");
		Thread t2 = new Thread(mr, "�߳�2");
		
		ThreadGroup tg1 = t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();
		
		System.out.println(tg1.getName());		//Ĭ�������߳�
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