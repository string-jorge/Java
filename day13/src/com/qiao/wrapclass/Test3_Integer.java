package com.qiao.wrapclass;

public class Test3_Integer {

	/**
	 * A:int -- String
	 * 		a:��""����ƴ��
	 * 		b:public static String valueOf(int i)
	 * 		c:int -- Integer -- String(Integer���toString����())
	 * 		d:public static String toString(int i)(Integer��ľ�̬����)
	 * B:String -- int
	 * 		a:String -- Integer -- int
	 * 		public static int parseInt(String s)
	 * 
	 * �����������Ͱ�װ���а���,�������ֶ���parseXxx�ķ���,���Խ������ֵ��ַ���������ʽת���ɻ�����������
	 */
	public static void main(String[] args) {
		//demo1();
		//boolean����
		String s1 = "true";
		boolean b = Boolean.parseBoolean(s1);
		System.out.println(b);
		
		String s2 = "abc";
		//char c = Character.p	//char�İ�װ��Character��û��parseXxx�ķ���
		char[] arr = s2.toCharArray();//�ַ������ַ���ת��ͨ��toCharArray()�Ϳ��԰��ַ���ת��Ϊ�ַ�����
	}

	private static void demo1() {
		//int ת���� String
		int i = 100;
		//i��""����ƴ�ӳ��ַ���
		String s1 = i + "";//(�Ƽ�)
		System.out.println(s1);
		
		//public static String valueOf(int i)
		String s2 = String.valueOf(i);//(�Ƽ�)
		System.out.println(s2);
		
		//int -- Integer -- String(Integer���toString����())
		Integer i2 = new Integer(i);
		String s3 = i2.toString();
		System.out.println(s3);
		
		String s4 = Integer.toString(i);
		System.out.println(s4);
		
		//String ת���� int
		//String -- Integer -- int
		String s = "2000";
		Integer i3 = new Integer(s);
		int i4 = i3.intValue();//��Integer����ת����int
		System.out.println(i4);
		
		int i5 = Integer.parseInt(s);//��Stringת��Ϊint(�Ƽ�)
		System.out.println(i5);
	}

}
