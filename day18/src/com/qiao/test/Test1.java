package com.qiao.test;

import java.util.HashMap;

public class Test1 {

	/**
	 * ͳ���ַ�����ÿ���ַ������ֵĸ���
	 * ����:
	 * 1.����һ����Ҫ��ͳ�Ƶ��ַ���
	 * 2.���Ǹ��ַ���ת�����ַ�����
	 * 3.����˫�м���,�洢�ַ������ַ��Լ��ַ����ֵĴ���
	 * 4.�����ַ������ȡÿһ���ַ�,�����ַ��洢��˫�м�����
	 * 5.�洢������Ҫ���ж�,��������в����������,�ͽ����ַ��������洢,��������а��������,�ͽ�ֵ��һ�洢
	 * 6.��ӡ˫�м���,��ȡ�ַ����ֵĴ���
	 */
	public static void main(String[] args) {
		//1.����һ����Ҫ��ͳ�Ƶ��ַ���
		String s = "aaabbbcccdddddeeeee";
		//2.���Ǹ��ַ���ת�����ַ�����
		char[] arr = s.toCharArray();
		//3.����˫�м���,�洢�ַ������ַ��Լ��ַ����ֵĴ���
		HashMap<Character,Integer> hm = new HashMap<>();
		//4.�����ַ������ȡÿһ���ַ�,�����ַ��洢��˫�м�����
		for(char c : arr) {
			//5.�洢������Ҫ���ж�,��������в����������,�ͽ����ַ��������洢,��������а��������,�ͽ�ֵ��һ�洢
			/*if(!hm.containsKey(c)) {	//��������в����������
				hm.put(c, 1);
			}else {
				hm.put(c, hm.get(c) + 1);
			}*/
			hm.put(c,!hm.containsKey(c) ? 1 : hm.get(c) + 1);
		}
		//6.��ӡ˫�м���,��ȡ�ַ����ֵĴ���
		for (Character key : hm.keySet()) {//hm.keySet()�������м��ļ���
			System.out.println(key + "=" + hm.get(key));//hm.get(key)���ݼ���ȡֵ
		}
	}

}
