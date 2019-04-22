package com.qiao.list;

import java.util.LinkedList;

public class Test4_LinkedList {

	/**
	 * 用LinkedList模拟栈结构
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
	}

	private static void demo2() {
		Stack s = new Stack();
		s.in("a");
		s.in("b");
		s.in("c");
		s.in("d");
		
		while(!s.isEmpty()) {
			System.out.println(s.out());
		}
	}

	private static void demo1() {
		LinkedList list = new LinkedList();//创建集合对象
		list.addLast("a");//进栈
		list.addLast("b");
		list.addLast("c");
		list.addLast("d");
		
		/*System.out.println(list.removeLast());//弹栈
		System.out.println(list.removeLast());
		System.out.println(list.removeLast());
		System.out.println(list.removeLast());*/
		
		while(!list.isEmpty()) {
			System.out.println(list.removeLast());
		}
	}

}
