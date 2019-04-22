package com.qiao.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.qiao.bean.Student;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Test5_Iterator {

	/**
	 * iterator迭代
	 * 		A:迭代器概述
	 * 		集合是用来存储元素的,存储的元素需要查看,那么就需要迭代(遍历)
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
	}

	private static void demo2() {
		Collection c = new ArrayList();
		c.add(new Student("张三",23));//Object obj = new Student("张三",23);父类引用指向子类对象,向上转型
		c.add(new Student("李四",24));
		c.add(new Student("王五",25));
		c.add(new Student("赵六",26));
		
		Iterator it = c.iterator();//获取迭代器
		
		while(it.hasNext()) {
			//System.out.println(it.next());
			Student s = (Student)it.next();//向下转型
			System.out.println(s.getName() + " " + s.getAge());
		}
	}

	private static void demo1() {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		
		//对集合中的元素进行迭代(遍历)
		Iterator it = c.iterator();//获取迭代器
		/*boolean b1 = it.hasNext();//判断集合中是否有元素,如果有就返回true
		Object obj1 = it.next();//返回迭代的下一个元素
		System.out.println(b1);//true
		System.out.println(obj1);//a
		
		boolean b2 = it.hasNext();//判断几何中是否有元素,如果有就返回true
		Object obj2 = it.next();
		System.out.println(b2);//true
		System.out.println(obj2);//b*/
		
		while(it.hasNext()) {//判断集合中是否有元素,如果有就返回true
			System.out.println(it.next());//返回迭代的下一个元素
		}
	}

}
