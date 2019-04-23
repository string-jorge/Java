package com.qiao.thread;

public class Test1_Thread {

	/**
	 * @param args
	 * 证明JVM是多线程的
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 1000000; i++) {
			new Test();
		}
		
		//System.out.println(1/0);
		for (int i = 0; i < 10000; i++) {
			System.out.println("主线程的执行代码");
		}
		
	}

}

class Test {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("垃圾被回收了");
	}
}