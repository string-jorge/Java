package com.qiao.stringbuffer;

public class Test4_StringBufferMethod {

	/**
	 * A:StringBuffer���滻����
	 * 		public StringBuffer replace(int start,int end,String str):��start��ʼ��end��str�滻
	 * B:StringBuffer�ķ�ת����
	 * 		public StringBuffer reverse():�ַ�����ת
	 */
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("shiqiao");
		sb1.replace(0, 3, "li");//��"li"�滻"shi"
		System.out.println(sb1);//"liqiao"
		
		sb1.reverse();//��ת
		System.out.println(sb1);
	}

}
