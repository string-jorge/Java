package com.qiao.wrapclass;

public class Test1_Integer {

	/**
	 * A:Ϊʲô���л����������Ͱ�װ��
	 * 		�������������ͷ�װ�ɶ���ĺô����ڿ����ڶ����ж������Ĺ��ܷ�������������
	 * B:���ò���
	 * 		���õĲ���֮һ:���ڻ��������������ַ���֮���ת��
	 * C:�������ͺͰ�װ��Ķ�Ӧ
	 * 		byte		Byte
	 * 		short		Short
	 * 		int			Integer
	 * 		long		Long
	 * 		float		Float
	 * 		double		Double
	 * 		char		Character
	 * 		boolean		Boolean
	 */
	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(60));//��ʮ����ת��Ϊ������
		System.out.println(Integer.toOctalString(60));//��ʮ����ת��Ϊ�˽���
		System.out.println(Integer.toHexString(60));//��ʮ����ת��Ϊʮ������
	}

}
