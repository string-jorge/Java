package com.qiao.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test2_MapIterator {

	/**
	 * ͨ���鿴Map���ϵ�API,����û��iterator(������)����,��ô˫�м�����ε�����?
	 * Map���ϵĵ���
	 */
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("����", 23);
		map.put("����", 24);
		map.put("����", 25);
		map.put("����", 26);
		
		/*Integer i = map.get("����");//���ݼ���ȡֵ
		System.out.println(i);*/
		
		/*//��ȡ���еļ�
		Set<String> keySet = map.keySet();//��ȡ���м��ļ���
		Iterator<String> it = keySet.iterator();//��ȡ������
		while(it.hasNext()) {//�жϼ������Ƿ���Ԫ��
			String key = it.next();//��ȡ������ÿһ����
			Integer value = map.get(key);//���ݼ���ȡֵ
			System.out.println(key + "=" + value);*/
		
		//ʹ����ǿforѭ������
		for(String key : map.keySet()) {
			System.out.println(key + "=" + map.get(key));
		}
	}

}
