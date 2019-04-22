package com.qiao.list;

import java.util.ArrayList;
import java.util.Iterator;

import com.qiao.bean.Person;

public class Test2_ArrayList {

	/**
	 * 需求:ArrayList去除集合中自定义对象元素的重复值(对象的成员变量值相同)
	 * 注意事项:
	 * 		重写equals()方法的
	 * contains方法判断是否包含,低层依赖的时equals方法
	 * remove方法判断是否删除,底层依赖的是equals方法
	 */
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Person("张三",23));
		list.add(new Person("张三",23));
		list.add(new Person("李四",24));
		list.add(new Person("李四",24));
		list.add(new Person("李四",24));
		list.add(new Person("李四",24));
		
		ArrayList newList = getSingle(list);
		System.out.println(newList);
		
		list.remove(new Person("张三",23));
		System.out.println(list);
	}
	public static ArrayList getSingle(ArrayList list) {
		ArrayList newList = new ArrayList();
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			
			if(!newList.contains(obj)) {
				newList.add(obj);
			}
		}
		return newList;
	}
}
