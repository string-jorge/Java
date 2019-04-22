package com.qiao.list;

import java.util.LinkedList;

public class Test3_LinkedList {

	/**
	 * public void addFirst(E e):在集合前面添加
	 * public void addLast(E e):在集合后面添加
	 * public E getFirst():在集合中获取第一个元素
	 * public E getLast():在集合中获取最后一个元素
	 * public E removeFirst():在集合中删除第一个元素
	 * public E removeLast():在集合中删除最后一个元素
	 * public E get(int index):根据索引获取对应的元素
	 */
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		//在集合前面添加
		list.addFirst("a");
		list.addFirst("b");
		list.addFirst("c");
		list.addFirst("d");
		//在集合后面添加
		list.addLast("e");
		//在集合中获取第一个元素
		System.out.println(list.getFirst());
		//在集合中获取最后一个元素
		System.out.println(list.getLast());
		//在集合中删除第一个元素
		System.out.println(list.removeFirst());
		//在集合中删除最后一个元素
		System.out.println(list.removeLast());
		//根据索引获取对应的元素(比较慢)
		System.out.println(list.get(1));
		System.out.println(list);
	}

}
