package com.qiao.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test3_List {

	/**
	 * 有一个集合,判断里面有没有"world"这个元素,如果有就添加一个"javaee"元素
	 */
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");//Object obj = new String();向上转型
		list.add("b");
		list.add("world");
		list.add("c");
		list.add("d");
		
		/*Iterator it = list.iterator();//获取迭代器
		while(it.hasNext()) {//判断集合中是否有元素
			String str = (String)it.next();//向下转型
			System.out.println(str);
			if("world".equals(str)) {
				list.add("javaee");//遍历的同时再增加元素,并发修改异常ConcurrentModificationException
			}
		}*/
		ListIterator lit = list.listIterator();//获取迭代器(List集合特有的)
		while(lit.hasNext()) {
			String str = (String)lit.next();//向下转型
			if("world".equals(str)) {
				//list.add("javaee");//遍历的同时再增加元素,并发修改异常ConcurrentModificationException
				lit.add("javaee");
			}
		}
		System.out.println(list);
	}

}
