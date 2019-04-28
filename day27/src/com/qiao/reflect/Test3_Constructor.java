package com.qiao.reflect;

import java.lang.reflect.Constructor;

import com.qiao.bean.Person;

public class Test3_Constructor {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 */
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("com.qiao.bean.Person");		//��ȡ�ֽ����ļ�����
		Constructor c = clazz.getConstructor(String.class,String.class,int.class);		//ͨ�������ȡ�вεĹ���
		Person p = (Person) c.newInstance("s001","����",23);			//ͨ���вι��촴��ʵ��(ͨ���вδ�������)
		System.out.println(p);
	}

}
