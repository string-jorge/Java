package com.qiao.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test4_ListIterator {

	/**
	 * ��������
	 */
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		ListIterator lit = list.listIterator();//��ȡ������
		//���ű���
		while(lit.hasNext()) {
			System.out.println(lit.next());//��ȡԪ�ز���ָ������ƶ�
		}
		//���ű���,Ҫ���ű������������ű���
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());//��ȡԪ�ز���ָ����ǰ�ƶ�
		}
	}

}
