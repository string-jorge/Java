package com.qiao.stringbuffer;

public class Test7_StringBuffer {

	/**
	 * ��ʽ��������
	 * 		String��Ϊ��������
	 * 		StringBuffer��Ϊ��������
	 * 
	 * �����������͵�ֵ����,���ı���ֵ
	 * �����������͵�ֵ����,�ı���ֵ
	 * 
	 * String����Ȼ��������������,������������������ʱ�ͻ�������������һ����
	 */
	public static void main(String[] args) {
		String s = "shiqiao";
		System.out.println(s);//"shiqiao"
		change(s);
		System.out.println(s);//"shiqiao"
		
		StringBuffer sb = new StringBuffer();
		sb.append("shiqiao");
		System.out.println(sb);//"shiqiao"
		change(sb);
		System.out.println(sb);//"shiqiaoitcast"
	}

	public static void change(StringBuffer sb) {
		sb.append("itcast");
	}

	public static void change(String s) {
		s += "itcast";
	}

}
