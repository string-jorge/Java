package com.qiao.map;

import java.util.HashMap;
import java.util.Hashtable;

public class Test9_Hashtable {

	/**
	 * 面试题
	 * HashMap和Hashtable的区别
	 * 共同点:
	 * 底层都是Hash算法,都是双列集合
	 * 区别:
	 * 1:HashMap是线程不安全的,效率高,JDK1.2版本的
	 *   Hashtable是线程安全的,效率低,JDK1.0版本的
	 * 2.HashMap可以存储null键和null值
	 * 	 Hashtable不可以存储null键和null值
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
	}

	private static void demo2() {
		Hashtable<String,Integer> ht = new Hashtable<>();
		ht.put(null,23);//NullPointerException
		ht.put("李四",null);//NullPointerException
		System.out.println(ht);
	}

	private static void demo1() {
		//HashMap可以存储null键和null值
		HashMap<String,Integer> hm = new HashMap<>();
		hm.put(null, 23);
		hm.put("李四",null);
		System.out.println(hm);
	}

}
