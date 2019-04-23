package com.qiao.thread2;

public class Test2_NotifyAll {

	/**
	 * @param args
	 * ����(���)�̼߳��ͨ��
	 * 
	 * ע������:
	 * 1.��ͬ���������,���ĸ�������,�����Ǹ��������wait������notify����
	 * 2.Ϊʲôwait������notify����������Object�������?
	 * ��Ϊ������������������,��Object��������Ļ���,����wait������notify������Ҫ������Object�������
	 * 
	 * 3.sleep������wait����������?
	 * a:slepp�������봫�����,��������ʱ��,ʱ�䵽���Զ�����
	 *   wait�������Դ������Ҳ���Բ��������,������������ڲ�����ʱ�������ȴ�,�������������ֱ�ӵȴ�
	 * b:sleep������ͬ����������ͬ���������,���ͷ���(˯����Ҳ������˯)
	 *   wait������ͬ����������ͬ���������,�ͷ���  
	 */
	public static void main(String[] args) {
		final Printer2 p = new Printer2();
		
		new Thread() {
			public void run() {
				while(true) {
					try {
						p.print1();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true) {
					try {
						p.print2();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true) {
					try {
						p.print3();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
	}

}

class Printer2 {
	private int flag = 1;
	public void print1() throws InterruptedException {
		synchronized(this) {
			while(flag != 1) {
				this.wait();			//��ǰ�̵߳ȴ�
			}
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("Ҳ");
			System.out.print("��");
			System.out.print("\r\n");
			flag = 2;
			this.notifyAll();				//������ѵ����ȴ����߳�
		}
	}
	
	public void print2() throws InterruptedException {
		synchronized(this) {
			while(flag != 2) {
				this.wait();
			}
			System.out.print("��");
			System.out.print("Դ");
			System.out.print("��");
			System.out.print("��");
			System.out.print("Ƭ");
			System.out.print("\r\n");
			flag = 3;
			this.notifyAll();
		}
	}
	
	public void print3() throws InterruptedException {
		synchronized(this) {
			while(flag != 3) {
				this.wait();			//��ǰ�̵߳ȴ�
			}
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("\r\n");
			flag = 1;
			this.notifyAll();				//����ȫ���ȴ����߳�
		}
	}
}