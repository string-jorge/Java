package com.qiao.test;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test1 {

	/**
	 * @param args
	 * @throws Exception 
	 * ArrayList<Integer>的一个对象,在这个集合中添加一个字符串数据,如何实现呢?
	 * 泛型只能在编译器有效,在运行期会被擦除
	 */
	public static void main(String[] args) throws Exception {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(123);
		list.add(456);
		
		Class clazz = Class.forName("java.util.ArrayList");			//获取字节码对象
		Method m = clazz.getMethod("add", Object.class);		//获取add方法
		m.invoke(list, "abc");		//让方法运行添加字符串数据
		
		System.out.println(list);
	}

}
