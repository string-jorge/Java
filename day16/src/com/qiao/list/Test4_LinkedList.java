package com.qiao.list;

import java.util.LinkedList;

public class Test4_LinkedList {

	/**
	 * ��LinkedListģ��ջ�ṹ
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
		LinkedList list = new LinkedList();//�������϶���
		list.addLast("a");//��ջ
		list.addLast("b");
		list.addLast("c");
		list.addLast("d");
		
		/*System.out.println(list.removeLast());//��ջ
		System.out.println(list.removeLast());
		System.out.println(list.removeLast());
		System.out.println(list.removeLast());*/
		
		while(!list.isEmpty()) {
			System.out.println(list.removeLast());
		}
	}

}
