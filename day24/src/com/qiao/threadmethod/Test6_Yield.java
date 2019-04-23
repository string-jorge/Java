package com.qiao.threadmethod;

public class Test6_Yield {

	/**
	 * @param args
	 * yield:¿Ò»√œﬂ≥Ã
	 */
	public static void main(String[] args) {
		new MyThread().start();
		new MyThread().start();
	}

}

class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			if(i % 10 == 0) {
				Thread.yield();						//»√≥ˆCPU
			}
			System.out.println(getName() + "      " + i);
		}
	}
}