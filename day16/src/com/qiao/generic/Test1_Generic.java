package com.qiao.generic;

import java.util.ArrayList;
import java.util.Iterator;

import com.qiao.bean.Person;

public class Test1_Generic {

	/**
	 * A:泛型的概述
	 * B:泛型的好处
	 * 		提高安全性(将运行的错误转换到编译期)
	 * 		省区强转的麻烦
	 * C:泛型的基本使用
	 * 		<>中放2额必须是引用数据类型
	 * D:泛型使用注意事项
	 * 		前后的泛型必须一致,或者后面的泛型可以省略不写(1.7版本的新特性菱形泛型)
	 * 		泛型一般不要定义成Object,这样没有意义
	 */
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		//list.add("a");
		//list.add(true);
		list.add(new Person("张三",23));
		
		Iterator<Person> it = list.iterator();
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println(p.getName() + " " + p.getAge());
		}
	}

}
