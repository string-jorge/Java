package com.qiao.threadmethod;

public class Test1_Name {

	/**
	 * @param args
	 * getName:��ȡ�̵߳�����
	 * setName:�����̵߳�����
	 */
	public static void main(String[] args) {
		//demo1();
		Thread t1 = new Thread() {										//ͨ�����������߳�ȡ����
			@Override
			public void run() {
				//this.setName("�߳�1");
				System.out.println(this.getName() + "    zzzzzzzz");
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				//this.setName("�߳�2");
				System.out.println(this.getName() + "    ww");
			}
		};
		
		t1.setName("�߳�1");
		t2.setName("�߳�2");
		t1.start();
		t2.start();
	}

	public static void demo1() {
		new Thread("�߳�1") {										//ͨ�����������߳�ȡ����
			@Override
			public void run() {
				System.out.println(this.getName() + "    xxxxxxxx");
			}
		}.start();
		
		new Thread("�߳�2") {
			@Override
			public void run() {
				System.out.println(this.getName() + "    yy");
			}
		}.start();
	}

}
