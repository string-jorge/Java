package com.qiao.map;

import java.util.LinkedHashMap;

public class Test6_LinkedHashMap {

	/**
	 * LinkedHashMap���ص�:
	 * 		�ײ�������ʵ�ֵĿ��Ա�֤��ô�����ôȡ
	 */
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
		lhm.put("����", 23);
		lhm.put("����", 26);
		lhm.put("����", 25);
		lhm.put("����", 24);
		
		System.out.println(lhm);
	}

}
