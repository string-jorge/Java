package com.qiao.syn;

public class Test3_Ticket {

	/**
	 * 需求:铁路售票.100张,通过4个窗口售完(继承Thread)
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
	//private static Object obj = new Object();		//用引用数据类型成员变量做锁对象,必须是静态的
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
				System.out.println(getName() + "这是第" + ticket-- + "张票");
			}
		}
	}
}