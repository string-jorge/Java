package com.qiao.thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Test3_Timer {

	/**
	 * @param args
	 * Timer��ʱ��
	 * @throws InterruptedException 
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		Timer t = new Timer();
		//��ָ��ʱ�䰲��ָ��������
		//��һ�������ǰ��ŵ�����,�ڶ���������ִ�е�ʱ��,�����������ǹ��೤ʱ�����ظ�ִ��
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
		System.out.println("����");
	}
	
}