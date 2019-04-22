package com.qiao.bean;

public class Tool<T> {
	private T t;

	public T getObj() {
		return t;
	}

	public void setObj(T t) {
		this.t = t;
	}
	
	public<Q> void show(Q q) {//方法泛型最好与类的泛型一致,如果不一致,需要在方法上声明改泛型
		System.out.println(t);
	}
	
	public static<W> void print(W w) {//静态方法必须声明自己的泛型,静态方法随着类的加载而加载
		System.out.println(w);
	}
}
