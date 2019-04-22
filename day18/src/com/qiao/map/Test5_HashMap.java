package com.qiao.map;

import java.util.HashMap;

import com.qiao.bean.Student;

public class Test5_HashMap {

	/**
	 * HashMap集合键Student值是String的案例
	 */
	public static void main(String[] args) {
		HashMap<Student,String> hm = new HashMap<>();
		hm.put(new Student("张三",23), "北京");
		hm.put(new Student("张三",23), "上海");
		hm.put(new Student("李四",24), "广州");
		hm.put(new Student("王五",25), "深圳");
		
		System.out.println(hm.toString());//父类AbstractMap重写了toString方法
	}

}
