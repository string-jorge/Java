package com.qiao.wrapclass;

public class Test4_JDK5 {

	/**
	 * A:JDK5��������
	 * 		�Զ�װ��:�ѻ�������ת��Ϊ��װ������
	 * 		�Զ�����:�Ѱ�װ������ת��Ϊ��������
	 * B:JDK5��������
	 * 		�Զ�װ��:Integer i = 100;
	 * 		�Զ�����:i += 200;(i = i + 200)
	 * C:ע������
	 * 		��ʹ��,Integer x = null;����ͻ����NullPointerException
	 * 		�������ж��Ƿ�Ϊnull,Ȼ����ʹ��
	 */
	public static void main(String[] args) {
		int x = 100;
		Integer i1 = new Integer(x);//�������������Ͱ�װ��Integer����,װ��
		
		int y = i1.intValue();//��Integer����ת��Ϊ������������,����
		
		Integer i2 = 100;//�Զ�װ��:�ѻ�������ת��Ϊ��װ������
		int z = i2 + 200;//�Զ�����:�Ѱ�װ������ת��Ϊ��������
		System.out.println(z);
		
		/*Integer i3 = null;
		int a = i3 + 100;//�ײ���i3����intValue,����i3��null,null���÷����ͻ���ֿ�ָ���쳣java.lang.NullPointerException
		System.out.println(a);*/
	}

}
