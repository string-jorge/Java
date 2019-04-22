package com.qiao.jdk5;

import java.util.ArrayList;
import java.util.Iterator;

import com.qiao.bean.Person;

public class Test1_Foreach {

	/**
	 * A:��ǿforѭ��
	 * 		�������Collection���ϵı���
	 * B:��ʽ
	 * 		for(Ԫ���������� ���� : �������Collection����) {
	 * 			ʹ�ñ�������,�ñ�������Ԫ��
	 * 		}
	 * C:����,���ϴ洢Ԫ������ǿforѭ������
	 * D:�ô�
	 * 		�򻯱���
	 * ��ǿforѭ���Ͳ��������ǵ�����(Iterator)
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
	}

	private static void demo3() {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("b");
		list.add("d");
		//��ͨforѭ��ɾ��Ԫ��,����Ҫ--
		for(int i = 0;i < list.size();i++) {
			if("b".equals(list.get(i))) {
				list.remove(i--);//ͨ������ɾ��Ԫ��
			}
		}
		//������ɾ��Ԫ��
		/*Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			if("b".equals(it.next())) {
				it.remove();
			}
		}*/
		
		for(Iterator<String> it = list.iterator();it.hasNext();) {
			if("b".equals(it.next())) {
				it.remove();
			}
		}
		//��ǿforѭ��,����ɾ��Ԫ��,ֻ�ܱ���
		/*for (String string : list) {
			if("b".equals(string)) {
				list.remove("b");
			}
		}*/
		System.out.println(list);
	}

	private static void demo2() {
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("����",23));
		list.add(new Person("����",24));
		list.add(new Person("����",25));
		list.add(new Person("����",26));
		
		for (Person person : list) {
			System.out.println(person);
		}
	}

	private static void demo1() {
		int[] arr = {11,22,33,44,55};
		//fore + Alt + /
		for (int i : arr) {
			System.out.println(i);
		}
		
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		for (String string : list) {
			System.out.println(string);
		}
	}

}
