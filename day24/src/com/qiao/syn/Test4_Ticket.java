package com.qiao.syn;

public class Test4_Ticket {

	/**
	 * 需求:铁路售票.100张,通过4个窗口售完(实现Runnable接口)
	 */
	public static void main(String[] args) {
		MyTicket mt = new MyTicket();
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();
		
		/*Thread t = new Thread(mt);				//多次启动一个线程是非法的
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
				System.out.println(Thread.currentThread().getName() + "这是第" + ticket-- + "张票");
			}
		}
	}
}