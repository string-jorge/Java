package com.qiao.stringbuffer;

public class Test2_StringBuffer {

	/**
	 * A:StringBuffer����ӹ���
	 * 		public StringBuffer append(String str):
	 * 			���԰���������������ӵ��ַ�������������,�������ַ�������������
	 * 		public StringBuffer insert(int offset,String str):
	 * 			��ָ��λ�ð������������Ͳ��뵽�ַ�������������,�������ַ�������������
	 * 			StringBuffer���ַ���������,��new��ʱ�����ڶ��ڴ洴����һ������,�ײ���һ��������16���ַ�����
	 * 		��������ӵķ���ʱ,���������´�������,�ڲ�����ԭ����������ַ�
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
	}

	private static void demo2() {
		//StringBuffer����ӹ���,��ָ��λ�ð������������Ͳ��뵽�ַ�������������
		StringBuffer sb1 = new StringBuffer("1234");
		sb1.insert(3, "shiqiao");//��ָ��λ�����Ԫ��,���û��ָ��λ�õ������ͻᱨ����Խ���쳣
		System.out.println(sb1);
	}

	private static void demo1() {
		//StringBuffer����ӹ���,����������������ӵ��ַ�������������
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = sb1.append(true);
		StringBuffer sb3 = sb1.append("shiqiao");
		StringBuffer sb4 = sb1.append(100);
		
		System.out.println(sb1.toString());//trueshiqiao100,StringBuffer������д��toString����,��ʾ���Ƕ����е�����ֵ
		System.out.println(sb2);//trueshiqiao100,���ֱ�Ӵ�ӡ��������,��Ĭ�ϵ���toString����
		System.out.println(sb3);//trueshiqiao100
		System.out.println(sb4);//trueshiqiao100
	}

}