package com.qiao.syn;

public class Test5_DeadLock {

	/**
	 * @param args
	 * ����
	 * 
	 * Ϊ�˱���ͬ��������������״̬,��ҪǶ��ʹ��ͬ�������
	 * 
	 * Vector���̰߳�ȫ��,ArrayList���̲߳���ȫ��
	 * StringBuffer���̰߳�ȫ��,StringBuilder���̲߳���ȫ��
	 * Hashtable���̰߳�ȫ��,HashMap���̲߳���ȫ��
	 * Collections.synchronizedXXX()�ǽ��̲߳���ȫ��ת�����̰߳�ȫ��
	 */
	private static String s1 = "�����";
	private static String s2 = "�ҿ���";
	public static void main(String[] args) {
		
		new Thread() {
			public void run() {
				while(true) {
					synchronized(s1) {
						System.out.println(getName() + "     ��ȡ" + s1 + "�ȴ�" + s2);
						synchronized(s2) {
							System.out.println(getName() + "     �õ�" + s2 + "����");
						}
					}
				}
			};
		}.start();
		
		new Thread() {
			public void run() {
				while(true) {
					synchronized(s2) {
						System.out.println(getName() + "     ��ȡ" + s2 + "�ȴ�" + s1);
						synchronized(s1) {
							System.out.println(getName() + "     �õ�" + s1 + "����");
						}
					}
				}
			};
		}.start();
	}

}
