package com.qiao.list;

import java.util.ArrayList;
import java.util.List;

import com.qiao.bean.Student;

public class Test2_List {

	/**
	 * ͨ��size()��get()�������ʹ�ñ���
	 */
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Student("����",23));//����ת��
		list.add(new Student("����",24));
		list.add(new Student("����",25));
		list.add(new Student("����",26));
		
		for(int i = 0;i < list.size();i++) {
			//System.out.println(list.get(i));
			Student s = (Student)list.get(i);//����ת��
			System.out.println(s.getName() + " " + s.getAge());
		}
	}

}
