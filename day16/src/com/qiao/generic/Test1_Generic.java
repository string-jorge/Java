package com.qiao.generic;

import java.util.ArrayList;
import java.util.Iterator;

import com.qiao.bean.Person;

public class Test1_Generic {

	/**
	 * A:���͵ĸ���
	 * B:���͵ĺô�
	 * 		��߰�ȫ��(�����еĴ���ת����������)
	 * 		ʡ��ǿת���鷳
	 * C:���͵Ļ���ʹ��
	 * 		<>�з�2�������������������
	 * D:����ʹ��ע������
	 * 		ǰ��ķ��ͱ���һ��,���ߺ���ķ��Ϳ���ʡ�Բ�д(1.7�汾�����������η���)
	 * 		����һ�㲻Ҫ�����Object,����û������
	 */
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		//list.add("a");
		//list.add(true);
		list.add(new Person("����",23));
		
		Iterator<Person> it = list.iterator();
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println(p.getName() + " " + p.getAge());
		}
	}

}
