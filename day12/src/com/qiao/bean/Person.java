package com.qiao.bean;

public class Person {
	private String anme;
	private int age;
	public Person() {
		super();
	}
	public Person(String anme, int age) {
		super();
		this.anme = anme;
		this.age = age;
	}
	public String getAnme() {
		return anme;
	}
	public void setAnme(String anme) {
		this.anme = anme;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return "Person [anme=" + anme + ", age=" + age + "]";
	}
	
}
