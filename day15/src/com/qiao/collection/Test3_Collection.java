package com.qiao.collection;

import java.util.ArrayList;
import java.util.Collection;

import com.qiao.bean.Student;

@SuppressWarnings({"rawtypes", "unchecked"})
public class Test3_Collection {

	/**
	 * A:���ϵı���
	 * 		��ʵ�������λ�ȡ�����е�ÿһ��Ԫ��
	 * B:����
	 * 		�Ѽ���ת������,����ʵ�ּ��ϵı���
	 * 		toArray();������ת��������
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
	}

	private static void demo2() {
		Collection c = new ArrayList();
		c.add(new Student("����",23));
		c.add(new Student("����",24));
		c.add(new Student("����",25));
		c.add(new Student("����",26));
		
		Object[] arr = c.toArray();//������ת��������
		
		for (int i = 0; i < arr.length; i++) {
			//System.out.println(arr[i]);
			Student s = (Student)arr[i];
			System.out.println(s.getName() + " " + s.getAge());
		}
	}

	private static void demo1() {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		
		Object[] arr = c.toArray();//������ת��������
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
