package com.qiao.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Test3_MapIterator {

	/**
	 * Map���ϵĵڶ��ֵ���,���ݼ�ֵ�Զ���,��ȡ����ֵ
	 * A:��ֵ�Զ����Ҽ���ֵ˼·
	 * 		��ȡ���еļ�ֵ�Զ��󼯺�
	 * 		������ֵ�Զ��󼯺�,��ȡ��ÿһ����ֵ�Զ���
	 * 		���ݼ�ֵ�Զ����Ҽ���ֵ
	 */
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("����", 23);
		map.put("����", 24);
		map.put("����", 25);
		map.put("����", 26);
		
		/*//����������
		//Map.Entry˵��Entry��Map���ڲ��ӿ�,������ֵ��װ����Entry����,���洢��Set������
		Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
		//��ȡ������
		Iterator<Map.Entry<String,Integer>> it = entrySet.iterator();
		while(it.hasNext()) {
			//��ȡÿһ��Entry����
			Map.Entry<String,Integer> en = it.next();//��������ָ���������
			Entry<String,Integer> en = it.next();//ֱ�ӻ�ȡ�������
			String key = en.getKey();
			Integer value = en.getValue();
			System.out.println(key + "=" + value);
		}*/
		//��ǿforѭ������
		for(Entry<String, Integer> en : map.entrySet()) {
			System.out.println(en.getKey() + "=" + en.getValue());
		}
	}

}
