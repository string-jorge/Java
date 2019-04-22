package com.qiao.list;

import java.util.ArrayList;
import java.util.List;

public class Test1_List {

	/**
	 * List集合
	 * 		void add(int index,E element):在集合指定位置添加一个元素
	 * 		E remove(int index):通过索引删除元素
	 * 		E get (int index):通过索引获取元素
	 * 		E set(int index,E element):将指定位置的元素修改
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		//demo4();
		//demo5();
	}

	private static void demo5() {
		//将指定位置的元素修改
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		list.set(1, "z");
		System.out.println(list);
	}

	private static void demo4() {
		//通过索引获取元素
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		Object obj = list.get(1);//通过索引获取元素
		System.out.println(obj);//b
		
		
		//通过索引遍历List集合
		for(int i = 0;i < list.size();i++) {
			System.out.println(list.get(i));
		}
	}

	private static void demo3() {
		//删除的注意事项
		List list = new ArrayList();
		list.add(111);
		list.add(222);
		list.add(333);
		list.add(444);
		
		list.remove(111);//删除的时候不会自动装箱,把111当作索引
		System.out.println(list);
	}

	private static void demo2() {
		//通过索引删除元素
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		Object obj = list.remove(1);//通过索引删除元素,将被删除的元素返回
		System.out.println(obj);//b
		System.out.println(list);//[a, c, d]
	}

	private static void demo1() {
		//在集合指定位置添加一个元素
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add(4,"f");//size=index=4,index<=size并且>=0都不会报异常
		list.add(1,"e");
		//list.add(10,"e");//size!=index=10,IndexOutOfBoundsException当存储时使用不存在的索引时,会出现索引越界异常
		System.out.println(list);
	}

}
