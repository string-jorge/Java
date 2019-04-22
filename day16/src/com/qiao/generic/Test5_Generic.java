package com.qiao.generic;

import java.util.ArrayList;

import com.qiao.bean.Person;
import com.qiao.bean.Student;

public class Test5_Generic {

	/**
	 * A:����ͨ���<?>
	 * 		��������,���û����ȷ,��ô����object�Լ������Java����
	 * B:?extends E
	 * 		�����޶�,E��������
	 * C:?super E
	 * 		�����޶�,E���丸��
	 */
	public static void main(String[] args) {
		//List<?> list = new ArrayList<Integer>();//���ұߵķ����ǲ�ȷ��ʱ��߿���ָ��Ϊ<?>
		ArrayList<Person> list1 = new ArrayList<>();
		list1.add(new Person("����",23));
		list1.add(new Person("����",24));
		list1.add(new Person("����",25));
		
		ArrayList<Student> list2 = new ArrayList<>();
		list2.add(new Student("����",26));
		list2.add(new Student("����",27));
		
		list1.addAll(list2);
		System.out.println(list1);
	}

}
