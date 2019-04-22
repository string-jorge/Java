package com.qiao.generic;

import com.qiao.bean.Student;
import com.qiao.bean.Tool;
import com.qiao.bean.Worker;

public class Test3_Generic {

	/**
	 * 泛型的由来:通过Object转型问题引入
	 * 早期的Object类型可以接收任意的对象类型,但是在实际的使用中,会有类型转换的问题.也就存在着隐患,所以Java提供了泛型来解决这个安全问题.
	 */
	public static void main(String[] args) {
		//demo1();
		Tool<String> t = new Tool<>();
		t.show(true);
		t.print("abc");
	}

	private static void demo1() {
		Tool<Student> t = new Tool<>();
		t.setObj(new Student("张三",23));
		
		//Worker w = (Worker) t.getObj();//向下转型
		//System.out.println(w);
	}

}
