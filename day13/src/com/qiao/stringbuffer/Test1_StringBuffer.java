package com.qiao.stringbuffer;

public class Test1_StringBuffer {

	/**
	 * A:StringBuffer�Ĺ��췽��:
	 * 		public StringBuffer():�޲ι���
	 * 		public StringBuffer(int capacity):ָ���������ַ�������������
	 * 		public StringBuffer(String str):ָ���ַ������ݵ��ַ�������������
	 * B:StringBuffer�ķ���:
	 * 		public int capacity():���ص�ǰ����		����ֵ
	 * 		public int length():���س���(�ַ���)		ʵ��ֵ
	 * C:���췽���ͳ��ȷ�����ʹ��
	 */
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();//ûָ�������ĳ�ʼ����,Ĭ��Ϊ16
		System.out.println(sb1.length());//0,�����е��ַ�����,ʵ��ֵ
		System.out.println(sb1.capacity());//16,�����ĳ�ʼ����,����ֵ
		
		StringBuffer sb2 = new StringBuffer(10);//ָ�������ĳ�ʼ����
		System.out.println(sb2.length());//0,�����е��ַ�����
		System.out.println(sb2.capacity());//10,�����ĳ�ʼ����
		
		StringBuffer sb3 = new StringBuffer("shiqiao");
		System.out.println(sb3.length());//7,�����е��ַ�����
		System.out.println(sb3.capacity());//23,�ַ����ĳ���+��ʼ����
	}

}
