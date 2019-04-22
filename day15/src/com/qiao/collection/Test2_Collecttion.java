package com.qiao.collection;

import java.util.ArrayList;
import java.util.Collection;

import com.qiao.bean.Student;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Test2_Collecttion {

	/**
	 * A:基本功能演示
	 * 
	 * boolean add(E e):添加元素(对象)，可以添加任意类的对象
	 * boolean remove(Object o):删除指定元素
	 * void clear():清空集合
	 * boolean contains(Object o):判断是否包含
	 * boolean isEmpty():判断集合是否为空
	 * int size():获取集合中元素的个数
	 * 
	 * B:注意:
	 * collectionXxx.java使用了未经检查或不安全的操作
	 * 注意:要了解详细信息,请使用-Xlint:unchecked重新编译。
	 * Java编译器认为该程序存在安全隐隐患
	 * 
	 * add方法如果是List集合一直都返回true，因为List集合中是可以存在重复元素的
	 * 如果是set集合当存储重复元素的时候，就会返回false
	 */
	public static void main(String[] args) {
		demo1();
		//demo2();
		}

	private static void demo2() {
		//删除指定元素
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		
		//c.remove("b");//删除指定元素
		//System.out.println(c);//[a, c, d]*/	
		
		/*c.clear();//清空集合
		System.out.println(c);//[]*/
		
		//System.out.println(c.contains("b"));//判断集合c是否包含"b"元素
		
		//System.out.println(c.isEmpty());//判断集合是否为空
		
		System.out.println(c.size());//4,获取集合中元素的个数
	}

	private static void demo1() {
		//添加元素
		Collection c = new ArrayList();//父类引用指向子类对象
		boolean b1 = c.add("abc");
		boolean b2 = c.add(true);//自动装箱new Boolean(true);
		boolean b3 = c.add(100);//自动装箱new Integer(100);
		boolean b4 = c.add(new Student("张三",23));
		boolean b5 = c.add("abc");
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		
		System.out.println(c);//[abc, true, 100, Student [name=张三, age=23], abc]
	}

}
