package com.qiao.map;

import java.util.HashMap;
import java.util.Hashtable;

public class Test9_Hashtable {

	/**
	 * ������
	 * HashMap��Hashtable������
	 * ��ͬ��:
	 * �ײ㶼��Hash�㷨,����˫�м���
	 * ����:
	 * 1:HashMap���̲߳���ȫ��,Ч�ʸ�,JDK1.2�汾��
	 *   Hashtable���̰߳�ȫ��,Ч�ʵ�,JDK1.0�汾��
	 * 2.HashMap���Դ洢null����nullֵ
	 * 	 Hashtable�����Դ洢null����nullֵ
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
	}

	private static void demo2() {
		Hashtable<String,Integer> ht = new Hashtable<>();
		ht.put(null,23);//NullPointerException
		ht.put("����",null);//NullPointerException
		System.out.println(ht);
	}

	private static void demo1() {
		//HashMap���Դ洢null����nullֵ
		HashMap<String,Integer> hm = new HashMap<>();
		hm.put(null, 23);
		hm.put("����",null);
		System.out.println(hm);
	}

}
