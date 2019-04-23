package com.qiao.thread;

public class Test1_Singleton {

	/**
	 * @param args
	 * �������ģʽ
	 * 
	 * ����ʽ������ʽ������
	 * 1.����ʽ�ǿռ任ʱ��,����ʽ��ʱ�任�ռ�
	 * 2.���̷߳���ʱ,����ʽ���ᴴ���������,������ʽ�п��ܻᴴ���������
	 */
	public static void main(String[] args) {
		
	}

}
//����ʽ
/*class Singleton {
	//1.˽�й��췽��,�����಻�ܷ��ʸù��췽��
	private Singleton() {}
	//2.�����������
	private static Singleton s = new Singleton();
	//3.�����ṩ�����ķ��ʷ���
	public static Singleton getSingleton() {	//��ȡʵ��
		return s;
	}
}*/

//����ʽ,�������ӳټ���ģʽ
class Singleton {
	//1.˽�й��췽��,�����಻�ܷ��ʸù��췽��
	private Singleton() {}
	//2.�����������
	private static Singleton s;
	//3.�����ṩ�����ķ��ʷ���
	public static Singleton getSingleton() {	//��ȡʵ��
		if(s == null) {
			s = new Singleton();
		}
		return s;
	}
}
//������ģʽ
/*class Singleton {
	//1.˽�й��췽��,�����಻�ܷ��ʸù��췽��
	private Singleton() {}
	//2.�����������
	public static final Singleton s = new Singleton();
}*/