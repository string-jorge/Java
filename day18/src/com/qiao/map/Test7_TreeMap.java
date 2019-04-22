package com.qiao.map;

import java.util.Comparator;
import java.util.TreeMap;

import com.qiao.bean.Student;

public class Test7_TreeMap {

	/**
	 * TreeMap���ϼ�Studentֵ��String�İ���
	 */
	public static void main(String[] args) {
		TreeMap<Student, String> tm = new TreeMap<>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				int num = s1.getName().compareTo(s2.getName());
				return num == 0 ? s1.getAge() - s2.getAge() : num;
			}
		});
		tm.put(new Student("����",23), "����");
		tm.put(new Student("����",24), "�Ϻ�");
		tm.put(new Student("����",25), "����");
		tm.put(new Student("����",26), "����");
		
		System.out.println(tm);
	}

}
