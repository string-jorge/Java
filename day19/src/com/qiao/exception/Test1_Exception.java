package com.qiao.exception;

public class Test1_Exception {

	/**
	 * A:JVMĬ������δ����쳣��
	 * mian�����յ��������ʱ,�����ִ���ʽ:
	 * a:�Լ��������⴦��,Ȼ���������
	 * B:�Լ�û����ԵĴ���ʽ,ֻ�н�������main��jvm������
	 * jvm�и�Ĭ�ϵ��쳣�������,�ͽ����쳣���д���
	 * �������쳣������,�쳣����Ϣ,�쳣���ֵ�λ�ô�ӡ���˿���̨��,ͬʱ������ֹͣ����
	 * B:������ʾ
	 * 		JVMĬ����δ����쳣
	 */
	public static void main(String[] args) {
		//demo1();
		Test1 t = new Test1();
		int i = t.div(10, 0);
		System.out.println(i);
	}

	private static void demo1() {
		int[] arr = {11,22,33,44,55};
		arr = null;
		System.out.println(arr[0]);//��ָ���쳣
		System.out.println(arr[10]);//��������Խ���쳣
	}

}
class Test1 {
	public int div(int a,int b) {		//a = 10,b = 0
		return a/ b;					// 10 / 0 ��������10,������0,��������0��ʱ��Υ�����������㷨��,�׳����쳣
										//new ArithmeticException( / by zero);
	}
}