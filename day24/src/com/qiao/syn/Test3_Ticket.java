package com.qiao.syn;

public class Test3_Ticket {

	/**
	 * ����:��·��Ʊ.100��,ͨ��4����������(�̳�Thread)
	 */
	public static void main(String[] args) {
		new Ticket().start();
		new Ticket().start();
		new Ticket().start();
		new Ticket().start();
	}

}

class Ticket extends Thread {
	private static int ticket = 100;
	//private static Object obj = new Object();		//�������������ͳ�Ա������������,�����Ǿ�̬��
	public void run() {
		while(true) {
			synchronized(Ticket.class) {
				if(ticket <= 0) {
					break;
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(getName() + "���ǵ�" + ticket-- + "��Ʊ");
			}
		}
	}
}