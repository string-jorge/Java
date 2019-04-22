package com.qiao.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.qiao.bean.Student;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Test5_Iterator {

	/**
	 * iterator����
	 * 		A:����������
	 * 		�����������洢Ԫ�ص�,�洢��Ԫ����Ҫ�鿴,��ô����Ҫ����(����)
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
	}

	private static void demo2() {
		Collection c = new ArrayList();
		c.add(new Student("����",23));//Object obj = new Student("����",23);��������ָ���������,����ת��
		c.add(new Student("����",24));
		c.add(new Student("����",25));
		c.add(new Student("����",26));
		
		Iterator it = c.iterator();//��ȡ������
		
		while(it.hasNext()) {
			//System.out.println(it.next());
			Student s = (Student)it.next();//����ת��
			System.out.println(s.getName() + " " + s.getAge());
		}
	}

	private static void demo1() {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		
		//�Լ����е�Ԫ�ؽ��е���(����)
		Iterator it = c.iterator();//��ȡ������
		/*boolean b1 = it.hasNext();//�жϼ������Ƿ���Ԫ��,����оͷ���true
		Object obj1 = it.next();//���ص�������һ��Ԫ��
		System.out.println(b1);//true
		System.out.println(obj1);//a
		
		boolean b2 = it.hasNext();//�жϼ������Ƿ���Ԫ��,����оͷ���true
		Object obj2 = it.next();
		System.out.println(b2);//true
		System.out.println(obj2);//b*/
		
		while(it.hasNext()) {//�жϼ������Ƿ���Ԫ��,����оͷ���true
			System.out.println(it.next());//���ص�������һ��Ԫ��
		}
	}

}
