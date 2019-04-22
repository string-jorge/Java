package com.qiao.list;

import java.util.LinkedList;

public class Test3_LinkedList {

	/**
	 * public void addFirst(E e):�ڼ���ǰ�����
	 * public void addLast(E e):�ڼ��Ϻ������
	 * public E getFirst():�ڼ����л�ȡ��һ��Ԫ��
	 * public E getLast():�ڼ����л�ȡ���һ��Ԫ��
	 * public E removeFirst():�ڼ�����ɾ����һ��Ԫ��
	 * public E removeLast():�ڼ�����ɾ�����һ��Ԫ��
	 * public E get(int index):����������ȡ��Ӧ��Ԫ��
	 */
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		//�ڼ���ǰ�����
		list.addFirst("a");
		list.addFirst("b");
		list.addFirst("c");
		list.addFirst("d");
		//�ڼ��Ϻ������
		list.addLast("e");
		//�ڼ����л�ȡ��һ��Ԫ��
		System.out.println(list.getFirst());
		//�ڼ����л�ȡ���һ��Ԫ��
		System.out.println(list.getLast());
		//�ڼ�����ɾ����һ��Ԫ��
		System.out.println(list.removeFirst());
		//�ڼ�����ɾ�����һ��Ԫ��
		System.out.println(list.removeLast());
		//����������ȡ��Ӧ��Ԫ��(�Ƚ���)
		System.out.println(list.get(1));
		System.out.println(list);
	}

}
