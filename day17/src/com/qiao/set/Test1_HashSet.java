package com.qiao.set;

import java.util.HashSet;

import com.qiao.bean.Person;

public class Test1_HashSet {

	/**
	 * Set集合:无索引,不可以重复,无序(存取的顺序不一致)
	 */
	public static void main(String[] args) {
		demo1();
		//demo2();
	}

	private static void demo2() {
		HashSet<Person> hs = new HashSet<>();
		hs.add(new Person("张三",23));
		hs.add(new Person("张三",23));
		hs.add(new Person("李四",24));
		hs.add(new Person("李四",24));
		hs.add(new Person("李四",24));
		hs.add(new Person("李四",24));
		
		System.out.println(hs.size());
		System.out.println(hs);
	}

	private static void demo1() {
		HashSet<String> hs = new HashSet<>();	//true,创建HashSet对象
		boolean b1 = hs.add("a");
		boolean b2 = hs.add("a");				//false,当向set集合中存储重复元素的时候返回false
		hs.add("b");
		hs.add("c");
		hs.add("d");
		
		System.out.println(hs);					//HashSet的继承体系中有重写toString方法
		System.out.println(b1);
		System.out.println(b2);
		
		for(String string : hs) {				//只要能用迭代器迭代的,就可以用增强for循环遍历
			System.out.println(string);
		}
	}
}
