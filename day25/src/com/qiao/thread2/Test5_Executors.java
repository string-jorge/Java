package com.qiao.thread2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test5_Executors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(2);		//创建线程池,指定放两个线程
		
		pool.submit(new MyRunnable());								//将线程放进线程池
		pool.submit(new MyRunnable());
		
		pool.shutdown();											//关闭线程池
	}

}
