package com.qiao.exception;

public class Test8_Exception {

	/**
	 * A:Ϊʲô��Ҫ�Զ����쳣
	 * 		ͨ���������ֵ�����ʲô�쳣,����ԵĽ���취
	 * 		����:�˵�����
	 * B:�Զ����쳣�ĸ���
	 * 		�̳���Exception
	 * 		�̳���RuntimeException
	 * C:�Զ����쳣�Ļ���ʹ��
	 */
	public static void main(String[] args) {
	}
}
class AgeOutOfBoundsException extends Exception {//�Զ������䲻�Ϸ��쳣

	public AgeOutOfBoundsException() {
		super();
	}

	public AgeOutOfBoundsException(String message) {
		super(message);
	}
	
}