package com.qiao.thread;

public class Test3_Thread {

	/**
	 * @param args
	 * ʵ�ֶ����̷߳���һ
	 * 
	 * �鿴ʵ�ֶ����߳����ַ�����Դ������:
	 * 		a:�̳�Thread:����������д��Thread���run(),������start()ʱ,ֱ���������run()����
	 * 		b:ʵ��Runnable:���캯���д�����Runnable������,��Ա������ס����,start()����run()����ʱ�ڲ��жϳ�Ա����Runnable�������Ƿ�Ϊ��,
	 * 		��Ϊ�ձ���ʱ������Runnable��run(),����ʱִ�е��������run()����
	 * �̳�Thread
	 * 		�ô���:����ֱ��ʹ��Thread�е�run()����,�����
	 * 		�׶���:����Ѿ����˸���,�Ͳ��������ַ�����
	 * ʵ��Runnable�ӿ�
	 * 		�ô���:��ʹ�Լ�������߳������˸���Ҳû��ϵ,��Ϊ���˸���Ҳ����ʵ�ֽӿ�,���ӿ��ǿ��Զ�ʵ�ֵ�
	 * 		�׶���:����ֱ��ʹ��Thread�е�run()����,��Ҫ�Ȼ�ȡ���̶߳����,���ܵõ�Thread�ķ���,���븴��
	 */
	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();			//4.����Runnable���������
		Thread t = new Thread(mr);					//5.���䵱���������ݸ�Thread�Ĺ��췽��
		t.start();									//6.�����߳�
		
		for (int i = 1; i < 1000; i++) {
			System.out.println("main");
		}
		
	}

}

class MyRunnable implements Runnable {				//1.����һ����ʵ��Runnable

	@Override
	public void run() {								//2.��дrun����
		for (int i = 1; i < 1000; i++) {			//3.��Ҫִ�еĴ���д��run��
			System.out.println("����Runnable");
		}
	}
}