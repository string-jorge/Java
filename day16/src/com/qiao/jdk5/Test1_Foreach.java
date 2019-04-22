package com.qiao.jdk5;

import java.util.ArrayList;
import java.util.Iterator;

import com.qiao.bean.Person;

public class Test1_Foreach {

	/**
	 * A:增强for循环
	 * 		简化数组和Collection集合的遍历
	 * B:格式
	 * 		for(元素数据类型 变量 : 数组或者Collection集合) {
	 * 			使用变量即可,该变量就是元素
	 * 		}
	 * C:数组,集合存储元素用增强for循环遍历
	 * D:好处
	 * 		简化遍历
	 * 增强for循环低层依赖的是迭代器(Iterator)
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
	}

	private static void demo3() {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("b");
		list.add("d");
		//普通for循环删除元素,索引要--
		for(int i = 0;i < list.size();i++) {
			if("b".equals(list.get(i))) {
				list.remove(i--);//通过索引删除元素
			}
		}
		//迭代器删除元素
		/*Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			if("b".equals(it.next())) {
				it.remove();
			}
		}*/
		
		for(Iterator<String> it = list.iterator();it.hasNext();) {
			if("b".equals(it.next())) {
				it.remove();
			}
		}
		//增强for循环,不能删除元素,只能遍历
		/*for (String string : list) {
			if("b".equals(string)) {
				list.remove("b");
			}
		}*/
		System.out.println(list);
	}

	private static void demo2() {
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("张三",23));
		list.add(new Person("李四",24));
		list.add(new Person("王五",25));
		list.add(new Person("赵六",26));
		
		for (Person person : list) {
			System.out.println(person);
		}
	}

	private static void demo1() {
		int[] arr = {11,22,33,44,55};
		//fore + Alt + /
		for (int i : arr) {
			System.out.println(i);
		}
		
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		for (String string : list) {
			System.out.println(string);
		}
	}

}
