package com.qiao.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Test1_Map {

	/**
	 * Map���ϵĹ��ܸ���(K��key��,V��valueֵ)
	 * A:��ӹ���
	 * 		V put(K key,V value):���Ԫ��
	 * 			������ǵ�һ�δ洢,��ֱ�Ӵ洢Ԫ��,����null
	 * 			��������ǵ�һ�δ���,����ֵ����ǰ��ֵ�滻��,������ǰ��ֵ
	 * B:ɾ������
	 * 		void clear():�Ƴ����еļ�ֵ��Ԫ��
	 *		V remove(Object key):���ݼ�ɾ����ֵ��Ԫ��,����ֵ����
	 * C:�жϹ���
	 * 		boolean containsKey(Object key):�жϼ����Ƿ����ָ���ļ�
	 * 		boolean containsValue(Object value):�жϼ����Ƿ����ָ����ֵ
	 * 		boolean isEmpty():�жϼ����Ƿ�Ϊ��
	 * D:��ȡ����
	 * 		Set<Map.Entry<K,V>> entrySet()
	 * 		V get(Object key):���ݼ���ȡֵ
	 * 		Set<K> keySet():��ȡ���������м��ļ���
	 * 		Collection<V> values():��ȡ����������ֵ�ļ���
	 * E:���ȹ���
	 * 		int size():���ؼ����еļ�ֵ�Եĸ���
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		Map<String,Integer> map = new HashMap<>();
		map.put("����", 23);
		map.put("����", 24);
		map.put("����", 25);
		map.put("����", 26);
		
		Collection<Integer> c = map.values();
		System.out.println(c);//[26, 23, 24, 25],��ȡ����������ֵ�ļ���
		System.out.println(map.size());//4,���ؼ����еļ�ֵ�Եĸ���
	}

	private static void demo2() {
		Map<String,Integer> map = new HashMap<>();
		map.put("����", 23);
		map.put("����", 24);
		map.put("����", 25);
		map.put("����", 26);
		
		//Integer value = map.remove("����");//���ݼ�ɾ����ֵ��Ԫ��,����ֵ����
		//System.out.println(value);//23
		System.out.println(map.containsKey("����"));//true,�жϼ����Ƿ����ָ���ļ�
		System.out.println(map.containsValue(100));//false,�жϼ����Ƿ����ָ����ֵ
		System.out.println(map);//{����=26, ����=24, ����=25}
		System.out.println(map.isEmpty());//false,�жϼ����Ƿ�Ϊ��
		
		//map.clear();//�Ƴ����еļ�ֵ��Ԫ��
		//System.out.println(map);//{}
	}

	private static void demo1() {
		Map<String,Integer> map = new HashMap<>();
		Integer i1 = map.put("����", 23);
		Integer i2 = map.put("����", 24);
		Integer i3 = map.put("����", 25);
		Integer i4 = map.put("����", 26);
		Integer i5 = map.put("����", 27);			//��ͬ�ļ����洢,ֵ����,�ѱ����ǵ�ֵ����
		
		System.out.println(map);//{����=26, ����=23, ����=24, ����=25}
		
		System.out.println(i1);//null,������ǵ�һ�δ洢,��ֱ�Ӵ洢Ԫ��,����null
		System.out.println(i2);//null
		System.out.println(i3);//null
		System.out.println(i4);//null
		System.out.println(i5);//23,��������ǵ�һ�δ���,����ֵ����ǰ��ֵ�滻��,������ǰ��ֵ
	}

}
