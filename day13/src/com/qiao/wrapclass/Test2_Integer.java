package com.qiao.wrapclass;

public class Test2_Integer {

	/**
	 * A:Integer��ĸ���
	 * 		Integer���ڶ����а�װ��һ����������int��ֵ
	 * 		�����ṩ�˶������,����int���ͺ�String����֮�以��ת��
	 * 		���ṩ�˴���int����ʱ�ǳ����õ�����һЩ�����ͷ���
	 * B:���췽��
	 * 		public Integer(int value)
	 * 		public Integer(String s)
	 */
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);//intȡֵ��Χ���ֵ
		System.out.println(Integer.MIN_VALUE);//intȡֵ��Χ��Сֵ
		
		Integer i1 = new Integer(100);
		System.out.println(i1);
		
		//Integer i2 = new Integer("abc");//java.lang.NumberFormatException���ָ�ʽ�쳣,��Ϊabc���������ַ���,����ת���ᱨ��
		//System.out.println(i2);
		
		Integer i3 = new Integer("100");
		System.out.println(i3);
	}

}
