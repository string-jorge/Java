package com.qiao.thread;

public class Test1_Thread {

	/**
	 * @param args
	 * ֤��JVM�Ƕ��̵߳�
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 1000000; i++) {
			new Test();
		}
		
		//System.out.println(1/0);
		for (int i = 0; i < 10000; i++) {
			System.out.println("���̵߳�ִ�д���");
		}
		
	}

}

class Test {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("������������");
	}
}