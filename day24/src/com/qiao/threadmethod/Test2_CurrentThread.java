package com.qiao.threadmethod;

public class Test2_CurrentThread {

	/**
	 * @param args
	 * currentThread:��ȡ��ǰ����ִ�е��߳�
	 */
	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
				System.out.println(this.getName() + "       xxxxxxxx");
			}
		}.start();
		
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				//Thread.currentThread();				//��ȡ��ǰ����ִ�е��߳�
				System.out.println(Thread.currentThread().getName() + "    yy");
			}
		}).start();
		
		Thread.currentThread().setName("���߳�");						//�����̸߳���
		System.out.println(Thread.currentThread().getName());		//��ȡ���̵߳�����
	}

}
