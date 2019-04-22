package com.qiao.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test1_Collections {

	/**
	 * Collections中的常见方法
	 * public static <T> void sort(List<T> list)//将集合进行排序
	 * public static <T> int binarySearch(List<?> list,T key)//二分查找法,获取集合中查找值的索引
	 * public static <T> T max(Collections<?> coll)//根据默认排序结果获取集合中的最大值
	 * public static void reverse(List<T> list)//反转集合
	 * public static void shuffle(List<T> list)//随即置换
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
	}

	private static void demo3() {
		ArrayList<String> list = new ArrayList<>();
		list.add("f");
		list.add("a");
		list.add("c");
		list.add("g");
		list.add("d");
		//获取集合中的最大值
		System.out.println(Collections.max(list));
		//获取集合中的最小值
		System.out.println(Collections.min(list));
		//对集合元素进行反转
		Collections.reverse(list);
		System.out.println(list);
		//随即置换,可以用来洗牌
		Collections.shuffle(list);
		System.out.println(list);
	}

	private static void demo2() {
		//二分查找法,获取集合中查找值的索引
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("c");
		list.add("d");
		list.add("f");
		list.add("g");
		
		System.out.println(Collections.binarySearch(list, "c"));
		System.out.println(Collections.binarySearch(list, "b"));
	}

	private static void demo1() {
		//将集合进行排序
		ArrayList<String> list = new ArrayList<>();
		list.add("c");
		list.add("a");
		list.add("a");
		list.add("d");
		list.add("b");
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
	}

}
