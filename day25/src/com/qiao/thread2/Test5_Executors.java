package com.qiao.thread2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test5_Executors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(2);		//�����̳߳�,ָ���������߳�
		
		pool.submit(new MyRunnable());								//���̷߳Ž��̳߳�
		pool.submit(new MyRunnable());
		
		pool.shutdown();											//�ر��̳߳�
	}

}
