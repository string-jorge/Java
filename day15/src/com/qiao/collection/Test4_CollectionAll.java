package com.qiao.collection;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Test4_CollectionAll {

	/**
	 *  ��All�Ĺ�����ʾ
	 *  
	 *  boolean addAll(Collection c):��һ�����������Ԫ����ӵ���һ����������
	 *  boolean removeAll(Collection c):ɾ�����������й��е�Ԫ��(ɾ������)
	 *  boolean containsAll(Collection c):�жϵ��õļ����Ƿ��������ļ���
	 *  boolean retainAll(Collection c):ȡ����,������õļ��ϸı�ͷ���true,������õļ��ϲ���ͷ���False
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		//demo4();
	}

	private static void demo4() {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("c");
		c2.add("d");
		
		//ȡ����,������õļ��ϸı�ͷ���true,������õļ��ϲ���ͷ���False
		boolean b = c1.retainAll(c2);
		System.out.println(b);//false
		System.out.println(c1);//[a, b, c, d]
	}

	private static void demo3() {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("b");
		
		boolean b = c1.containsAll(c2);//�жϵ��õļ����Ƿ��������ļ���
		System.out.println(b);
	}

	private static void demo2() {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("z");
		
		boolean b = c1.removeAll(c2);//ɾ�����ǽ���
		System.out.println(b);
		System.out.println(c1);
	}

	private static void demo1() {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("c");
		c2.add("d");
		
		c1.addAll(c2);//��c2�е�ÿһ��Ԫ����ӵ�c1��
		System.out.println(c1);//[a, b, c, d, a, b, c, d]
		c1.add(c2);//��c2����һ��������ӵ�c1��
		System.out.println(c1);//[a, b, c, d, a, b, c, d, [a, b, c, d]]
	}

}
