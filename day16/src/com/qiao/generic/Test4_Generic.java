package com.qiao.generic;

public class Test4_Generic {

	/**
	 * A:泛型接口的概述
	 * 		把泛型定义在接口上
	 * B:定义格式
	 * 		public interface 接口名<泛型类型>
	 * C:泛型接口的使用
	 */
	public static void main(String[] args) {
		
	}
}

interface Inter<T> {
	public void show(T t);
}
/*//第一种实现泛型接口(推荐)
class Test implements Inter<String> {

	@Override
	public void show(String t) {
		System.out.println(t);
	}
}*/
//第二种实现泛型接口,没有必要在实现接口的时候给自己加泛型
class Test<T> implements Inter<T> {

	@Override
	public void show(T t) {
		System.out.println(t);
	}
}