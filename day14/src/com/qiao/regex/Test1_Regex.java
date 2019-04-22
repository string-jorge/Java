package com.qiao.regex;

public class Test1_Regex {

	/**
	 * A:������ʽ
	 * 		��ָһ��������������ƥ��һϵ�з���ĳ���﷨������ַ����ĵ����ַ�.��ʵ����һ�ֹ���.���Լ������Ӧ��.
	 * 		����:����ע������,�������û���������,һ���������Ƴ���,������Ƴ��ȵ��������������ʽ����
	 * B:����
	 * 		����:У��qq����
	 * 			1.Ҫ�������5-15λ����
	 * 			2.0���ܿ�ͷ
	 * 			3.���붼������
	 * 
	 * 		a:��������ʽʵ��
	 * 		b:������ʽʵ��
	 */
	public static void main(String[] args) {
		System.out.println(checkQQ("012345"));//flase,������0��ͷ
		System.out.println(checkQQ("01a345"));//false,���ܺ�������
		System.out.println(checkQQ("123456789987654321"));//flase,����15������
		System.out.println(checkQQ("123456"));//true
		
		/*
		 * ������ʽ
		 */
		String regex = "[1-9]\\d{4,14}";
		System.out.println("123456789".matches(regex));//true
		System.out.println("023456789".matches(regex));//flase,������0��ͷ
		System.out.println("123abc789".matches(regex));//flase,���ܺ�����ĸ
		}
	/*
	 * ����:У��qq����
	 * 		1.Ҫ�������5-15λ����
	 * 		2.0���ܿ�ͷ
	 * 		3.���붼������
	 * 
	 * У��qq
	 * 		1.��ȷ����ֵ����boolean
	 * 		2.��ȷ�����б�String qq
	 */
	public static boolean checkQQ(String qq) {
		boolean flag = true;//���У��QQ������Ҫ��Ͱ�flagֵΪfalse,�������Ҫ��ֱ�ӷ���
		
		if(qq.length() >= 5 && qq.length() <= 15) {
			if(!qq.startsWith("0")) {
				char[] arr = qq.toCharArray();//���ַ���ת�����ַ�����
				for (int i = 0; i < arr.length; i++) {
					char ch = arr[i];//��¼ÿһ���ַ�
					if(!(ch >= '0' && ch <= '9')) {
						flag = false;//��������
						break;
					}
				}
			}else {
				flag = false;//��0��ͷ�����ϱ�׼
			}
		}else {
			flag = false;//���Ȳ�����
		}
		return flag;
	}
	
}
