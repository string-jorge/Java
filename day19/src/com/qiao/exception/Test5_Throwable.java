package com.qiao.exception;

public class Test5_Throwable {

	/**
	 * Throwable�ļ�����������
	 * 		a:getMessage():��ȡ�쳣��Ϣ,�����ַ���
	 * 		b:toString():��ȡ�쳣�������쳣��Ϣ,�����ַ���
	 * 		c:printStackTrace():��ȡ�쳣�������쳣��Ϣ,�Լ��쳣�����ڳ����е�λ��,����void
	 */
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} catch (Exception e) {						//Exception e = new ArihtmeticException("/ by zero");
			//System.out.println(e.getMessage());		//��ȡ�쳣��Ϣ
			//System.out.println(e);					//��ȡ�쳣�������쳣��Ϣ
			e.printStackTrace();					//��ȡ�쳣�������쳣��Ϣ,�Լ��쳣�����ڳ����е�λ��(JVMĬ�ϴ����쳣�ķ�ʽ)
		}
	}

}
