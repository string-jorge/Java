package com.qiao.list;

import java.util.ArrayList;
import java.util.List;

public class Test1_List {

	/**
	 * List����
	 * 		void add(int index,E element):�ڼ���ָ��λ�����һ��Ԫ��
	 * 		E remove(int index):ͨ������ɾ��Ԫ��
	 * 		E get (int index):ͨ��������ȡԪ��
	 * 		E set(int index,E element):��ָ��λ�õ�Ԫ���޸�
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		//demo4();
		//demo5();
	}

	private static void demo5() {
		//��ָ��λ�õ�Ԫ���޸�
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		list.set(1, "z");
		System.out.println(list);
	}

	private static void demo4() {
		//ͨ��������ȡԪ��
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		Object obj = list.get(1);//ͨ��������ȡԪ��
		System.out.println(obj);//b
		
		
		//ͨ����������List����
		for(int i = 0;i < list.size();i++) {
			System.out.println(list.get(i));
		}
	}

	private static void demo3() {
		//ɾ����ע������
		List list = new ArrayList();
		list.add(111);
		list.add(222);
		list.add(333);
		list.add(444);
		
		list.remove(111);//ɾ����ʱ�򲻻��Զ�װ��,��111��������
		System.out.println(list);
	}

	private static void demo2() {
		//ͨ������ɾ��Ԫ��
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		Object obj = list.remove(1);//ͨ������ɾ��Ԫ��,����ɾ����Ԫ�ط���
		System.out.println(obj);//b
		System.out.println(list);//[a, c, d]
	}

	private static void demo1() {
		//�ڼ���ָ��λ�����һ��Ԫ��
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add(4,"f");//size=index=4,index<=size����>=0�����ᱨ�쳣
		list.add(1,"e");
		//list.add(10,"e");//size!=index=10,IndexOutOfBoundsException���洢ʱʹ�ò����ڵ�����ʱ,���������Խ���쳣
		System.out.println(list);
	}

}
