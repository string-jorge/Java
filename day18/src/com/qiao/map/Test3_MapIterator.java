package com.qiao.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Test3_MapIterator {

	/**
	 * Map集合的第二种迭代,根据键值对对象,获取键和值
	 * A:键值对对象找键和值思路
	 * 		获取所有的键值对对象集合
	 * 		遍历键值对对象集合,获取到每一个键值对对象
	 * 		根据键值对对象找键和值
	 */
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("张三", 23);
		map.put("李四", 24);
		map.put("王五", 25);
		map.put("赵六", 26);
		
		/*//迭代器遍历
		//Map.Entry说明Entry是Map的内部接口,将键和值封装成了Entry对象,并存储在Set集合中
		Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
		//获取迭代器
		Iterator<Map.Entry<String,Integer>> it = entrySet.iterator();
		while(it.hasNext()) {
			//获取每一个Entry对象
			Map.Entry<String,Integer> en = it.next();//父类引用指向子类对象
			Entry<String,Integer> en = it.next();//直接获取子类对象
			String key = en.getKey();
			Integer value = en.getValue();
			System.out.println(key + "=" + value);
		}*/
		//增强for循环遍历
		for(Entry<String, Integer> en : map.entrySet()) {
			System.out.println(en.getKey() + "=" + en.getValue());
		}
	}

}
