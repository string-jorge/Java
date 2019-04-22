package com.qiao.object;

import com.qiao.one.Student;

public class Test2_GetClass {
	public static void main(String[] args) {
		Student s = new Student("ÀîËÄ",24);
		Class clazz = s.getClass();
		System.out.println(clazz.getName());
	}
}
