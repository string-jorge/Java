package com.qiao.test;

public class Test3 {

	/**
	 * ͳ��һ���ַ����д�д��ĸ,Сд��ĸ,�����ַ��������ַ����ֵĴ���.
	 * "ABCDEabcde123456!@#$%^";
	 * 
	 * ����:�ַ��������ַ���ɵ�,���ַ�����ֵ�����ɷ�Χ��,ͨ����Χ���ж��Ƿ�������ַ�
	 * ����������ü�������������
	 */
	public static void main(String[] args) {
		String s = "ABCDEabcde123456!@#$%^";
		int big = 0;
		int small = 0;
		int num = 0;
		int other = 0;
		//1.��ȡÿ���ַ�,ͨ��forѭ������
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			//2.�ж��ַ��Ƿ��������Χ��
			if(c >= 'A' && c <= 'Z') {
				big++;
			}else if(c >= 'a' && c <= 'z') {
				small++;
			}else if(c >= '0' && c <= '9') {
				num++;
			}else{
				other++;
			}
		}
		//3.��ӡÿ���������Ľ��
		System.out.println(s + "�ַ����д�д��ĸ��:" + big + "��,Сд��ĸ��:" + small + "��,�����ַ���:" + num + "��,�����ַ���:" + other + "��.");
	}
}
