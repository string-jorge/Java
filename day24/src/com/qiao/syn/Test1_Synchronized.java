package com.qiao.syn;

public class Test1_Synchronized {

	/**
	 * @param args
	 * ͬ�������
	 */
	public static void main(String[] args) {
		final Printer p = new Printer();
		
		Thread t1 = new Thread() {
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

class Printer {
	Test t = new Test();
	public void print1() {
		//synchronized(new Test()) {	//������������������,��Ϊ����������ͬһ������
		synchronized(t) {				//ͬ�������,������,����������������
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("Ҳ");
			System.out.print("��");
			System.out.print("\r\n");
		}
	}
	
	public void print2() {
		synchronized(t) {
			System.out.print("��");
			System.out.print("Դ");
			System.out.print("��");
			System.out.print("��");
			System.out.print("Ƭ");
			System.out.print("\r\n");
		}
	}
}

class Test {}