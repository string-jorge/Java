package com.qiao.syn;

public class Test4_Ticket {

	/**
	 * ����:��·��Ʊ.100��,ͨ��4����������(ʵ��Runnable�ӿ�)
	 */
	public static void main(String[] args) {
		MyTicket mt = new MyTicket();
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();
		
		/*Thread t = new Thread(mt);				//�������һ���߳��ǷǷ���
		t.start();
		t.start();
		t.start();
		t.start();*/
	}

}

class MyTicket implements Runnable {

	private static int ticket = 100;
	
	@Override
	public void run() {
		while(true) {
			synchronized(MyTicket.class) {
				if(ticket <= 0) {
					break;
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "���ǵ�" + ticket-- + "��Ʊ");
			}
		}
	}
}