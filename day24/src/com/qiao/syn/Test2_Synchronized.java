package com.qiao.syn;

public class Test2_Synchronized {

	/**
	 * @param args
	 * ͬ�������
	 */
	public static void main(String[] args) {
		final Printer2 p = new Printer2();
		
		Thread t1 = new Thread() {
			@SuppressWarnings("static-access")
			public void run() {
				while(true) {
					p.print1();
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				while(true) {
					p.print2();
				}
			}
		};
		
		t1.start();
		t2.start();
	}
}
/*
 * �Ǿ�̬��ͬ����������������this
 * ��̬ͬ���������������Ǹ�����ֽ������
 */
class Printer2 {
	public static synchronized void print1() {			//ͬ������ֻ��Ҫ�ڷ����ϼ�synchronized�ؼ��ּ���
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("Ҳ");
			System.out.print("��");
			System.out.print("\r\n");
	}
	
	public void print2() {
		synchronized(Printer2.class) {
			System.out.print("��");
			System.out.print("Դ");
			System.out.print("��");
			System.out.print("��");
			System.out.print("Ƭ");
			System.out.print("\r\n");
		}
	}
}