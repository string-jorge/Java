package com.qiao.thread2;

public class Test1_Notify {

	/**
	 * @param args
	 * �ȴ����ѻ���
	 * �����̼߳��ͨ��
	 */
	public static void main(String[] args) {
		final Printer p = new Printer();
		
		new Thread() {
			public void run() {
				while(true) {
					try {
						p.print1();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true) {
					try {
						p.print2();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		}.start();
	}

}

class Printer {
	private int flag = 1;
	public void print1() throws InterruptedException {
		synchronized(this) {
			if(flag != 1) {
				this.wait();			//��ǰ�̵߳ȴ�
			}
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("Ҳ");
			System.out.print("��");
			System.out.print("\r\n");
			flag = 2;
			this.notify();				//������ѵ����ȴ����߳�
		}
	}
	
	public void print2() throws InterruptedException {
		synchronized(this) {
			if(flag != 2) {
				this.wait();
			}
			System.out.print("��");
			System.out.print("Դ");
			System.out.print("��");
			System.out.print("��");
			System.out.print("Ƭ");
			System.out.print("\r\n");
			flag = 1;
			this.notify();
		}
	}
}