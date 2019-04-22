package com.qiao.set;

import java.util.HashSet;

import com.qiao.bean.Person;

public class Test1_HashSet {

	/**
	 * Set����:������,�������ظ�,����(��ȡ��˳��һ��)
	 */
	public static void main(String[] args) {
		demo1();
		//demo2();
	}

	private static void demo2() {
		HashSet<Person> hs = new HashSet<>();
		hs.add(new Person("����",23));
		hs.add(new Person("����",23));
		hs.add(new Person("����",24));
		hs.add(new Person("����",24));
		hs.add(new Person("����",24));
		hs.add(new Person("����",24));
		
		System.out.println(hs.size());
		System.out.println(hs);
	}

	private static void demo1() {
		HashSet<String> hs = new HashSet<>();	//true,����HashSet����
		boolean b1 = hs.add("a");
		boolean b2 = hs.add("a");				//false,����set�����д洢�ظ�Ԫ�ص�ʱ�򷵻�false
		hs.add("b");
		hs.add("c");
		hs.add("d");
		
		System.out.println(hs);					//HashSet�ļ̳���ϵ������дtoString����
		System.out.println(b1);
		System.out.println(b2);
		
		for(String string : hs) {				//ֻҪ���õ�����������,�Ϳ�������ǿforѭ������
			System.out.println(string);
		}
	}
}
