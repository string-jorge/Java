package com.qiao.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test3_List {

	/**
	 * ��һ������,�ж�������û��"world"���Ԫ��,����о����һ��"javaee"Ԫ��
	 */
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");//Object obj = new String();����ת��
		list.add("b");
		list.add("world");
		list.add("c");
		list.add("d");
		
		/*Iterator it = list.iterator();//��ȡ������
		while(it.hasNext()) {//�жϼ������Ƿ���Ԫ��
			String str = (String)it.next();//����ת��
			System.out.println(str);
			if("world".equals(str)) {
				list.add("javaee");//������ͬʱ������Ԫ��,�����޸��쳣ConcurrentModificationException
			}
		}*/
		ListIterator lit = list.listIterator();//��ȡ������(List�������е�)
		while(lit.hasNext()) {
			String str = (String)lit.next();//����ת��
			if("world".equals(str)) {
				//list.add("javaee");//������ͬʱ������Ԫ��,�����޸��쳣ConcurrentModificationException
				lit.add("javaee");
			}
		}
		System.out.println(list);
	}

}
