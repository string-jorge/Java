package com.qiao.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test4_ListIterator {

	/**
	 * 正反遍历
	 */
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		ListIterator lit = list.listIterator();//获取迭代器
		//正着遍历
		while(lit.hasNext()) {
			System.out.println(lit.next());//获取元素并将指针向后移动
		}
		//反着遍历,要反着遍历必须先正着遍历
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());//获取元素并将指针向前移动
		}
	}

}
