package com.qiao.list;

import java.util.ArrayList;
import java.util.Iterator;

import com.qiao.bean.Person;

public class Test2_ArrayList {

	/**
	 * ����:ArrayListȥ���������Զ������Ԫ�ص��ظ�ֵ(����ĳ�Ա����ֵ��ͬ)
	 * ע������:
	 * 		��дequals()������
	 * contains�����ж��Ƿ����,�Ͳ�������ʱequals����
	 * remove�����ж��Ƿ�ɾ��,�ײ���������equals����
	 */
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Person("����",23));
		list.add(new Person("����",23));
		list.add(new Person("����",24));
		list.add(new Person("����",24));
		list.add(new Person("����",24));
		list.add(new Person("����",24));
		
		ArrayList newList = getSingle(list);
		System.out.println(newList);
		
		list.remove(new Person("����",23));
		System.out.println(list);
	}
	public static ArrayList getSingle(ArrayList list) {
		ArrayList newList = new ArrayList();
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			
			if(!newList.contains(obj)) {
				newList.add(obj);
			}
		}
		return newList;
	}
}
