package com.qiao.exception;

public class Test7_Finally {

	/**
	 * A:finally���ص�
	 * 		��finally���Ƶ������һ����ִ��
	 * 		�������:��ִ��finally֮ǰ�˳���JVM(����System.exit(0);)
	 * B:finally������
	 * 		�����ͷ���Դ,��IO�����������ݿ�����л����
	 * 
	 * return����൱���Ƿ��������һ����,��ô���ڽ���֮ǰ�ῴһ����û��finally���������Ը,����оͽ�finallyִ�к��ٳ��׷���
	 */
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			System.out.println("��������Ϊ��");
			System.exit(0);						//�˳�JVM�����
			return;
		} finally {
			System.out.println("finallyִ����");
		}
	}

}
