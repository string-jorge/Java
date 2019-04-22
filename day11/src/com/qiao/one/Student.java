package com.qiao.one;

public class Student {
	private String name;
	private int age;

	public Student() {
		super();
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	// 可以用ALT + SHIFT + s再+s生产toString方法

	// 重写equals方法
	public boolean equals(Object obj) {// s1.equals(s2);
		Student s = (Student) obj;// 向下转型
		return this.name/* （字符串类型） */.equals(s.name) && this.age == s.age;
	}

}
