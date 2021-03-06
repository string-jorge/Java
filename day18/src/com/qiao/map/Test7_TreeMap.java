package com.qiao.map;

import java.util.Comparator;
import java.util.TreeMap;

import com.qiao.bean.Student;

public class Test7_TreeMap {

	/**
	 * TreeMap集合键Student值是String的案例
	 */
	public static void main(String[] args) {
		TreeMap<Student, String> tm = new TreeMap<>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				int num = s1.getName().compareTo(s2.getName());
				return num == 0 ? s1.getAge() - s2.getAge() : num;
			}
		});
		tm.put(new Student("张三",23), "北京");
		tm.put(new Student("李四",24), "上海");
		tm.put(new Student("王五",25), "广州");
		tm.put(new Student("赵六",26), "深圳");
		
		System.out.println(tm);
	}

}
