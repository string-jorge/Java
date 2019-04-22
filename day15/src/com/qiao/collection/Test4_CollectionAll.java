package com.qiao.collection;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Test4_CollectionAll {

	/**
	 *  带All的功能演示
	 *  
	 *  boolean addAll(Collection c):将一个集合里面的元素添加到另一个集合里面
	 *  boolean removeAll(Collection c):删除两个集合中共有的元素(删除交集)
	 *  boolean containsAll(Collection c):判断调用的集合是否包含传入的集合
	 *  boolean retainAll(Collection c):取交集,如果调用的集合改变就返回true,如果调用的集合不变就返回False
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		//demo4();
	}

	private static void demo4() {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("c");
		c2.add("d");
		
		//取交集,如果调用的集合改变就返回true,如果调用的集合不变就返回False
		boolean b = c1.retainAll(c2);
		System.out.println(b);//false
		System.out.println(c1);//[a, b, c, d]
	}

	private static void demo3() {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("b");
		
		boolean b = c1.containsAll(c2);//判断调用的集合是否包含传入的集合
		System.out.println(b);
	}

	private static void demo2() {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("z");
		
		boolean b = c1.removeAll(c2);//删除的是交集
		System.out.println(b);
		System.out.println(c1);
	}

	private static void demo1() {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("c");
		c2.add("d");
		
		c1.addAll(c2);//将c2中的每一个元素添加到c1中
		System.out.println(c1);//[a, b, c, d, a, b, c, d]
		c1.add(c2);//将c2看成一个对象添加到c1中
		System.out.println(c1);//[a, b, c, d, a, b, c, d, [a, b, c, d]]
	}

}
