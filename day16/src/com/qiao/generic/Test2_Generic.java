package com.qiao.generic;

import java.util.ArrayList;
import java.util.Iterator;

import com.qiao.bean.Person;

public class Test2_Generic {

	/**
	 * ArrayList存储字符串并遍历泛型版
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
	}

	private static void demo2() {
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("张三",23));
		list.add(new Person("李四",24));
		list.add(new Person("王五",25));
		list.add(new Person("赵六",26));
		
		Iterator<Person> it = list.iterator();
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println(p.getName() + " " + p.getAge());
		}
	}

	private static void demo1() {
		ArrayList<String> list = new ArrayList<>();
		list.add("abc");
		list.add("bcd");
		list.add("cde");
		list.add("def");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
