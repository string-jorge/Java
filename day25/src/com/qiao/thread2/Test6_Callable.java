package com.qiao.thread2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test6_Callable {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService pool = Executors.newFixedThreadPool(2);		//创建线程池,指定放两个线程
		
		Future<Integer> future1 = pool.submit(new MyCallable(50));								//将线程放进线程池
		Future<Integer> future2 = pool.submit(new MyCallable(100));
		
		System.out.println(future1.get());
		System.out.println(future2.get());
		
		pool.shutdown();
		
	}
}

class MyCallable implements Callable<Integer> {
	
	private int num;
	
	public MyCallable(int num) {
		this.num = num;
	}

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		return sum;
	}
	
}