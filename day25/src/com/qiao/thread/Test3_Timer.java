package com.qiao.thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Test3_Timer {

	/**
	 * @param args
	 * Timer计时器
	 * @throws InterruptedException 
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		Timer t = new Timer();
		//在指定时间安排指定的任务
		//第一个参数是安排的任务,第二个参数是执行的时间,第三个参数是过多长时间再重复执行
		t.schedule(new MyTimerTask(),new Date(119,3,23,17,14,30),3000);
		
		while(true) {
			Thread.sleep(1000);
			System.out.println(new Date());
		}
	}
}

class MyTimerTask extends TimerTask {

	@Override
	public void run() {
		System.out.println("起床啦");
	}
	
}