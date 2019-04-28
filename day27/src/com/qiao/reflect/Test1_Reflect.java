package com.qiao.reflect;

import com.qiao.bean.Person;

public class Test1_Reflect {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		Person p = new Person();
		
		Class class1 = p.getClass();			//ͨ�������ȡ�ֽ����ļ�����,����:�ж��Ƿ���ͬһ���ֽ������
		Class class2 = Person.class;			//ͨ���������ֽ����ļ�����,����:����������
		Class class3 = Class.forName("com.qiao.bean.Person");		//ͨ���������ȡ�ֽ����ļ�����,����:��ȡ�����ļ�
		
		System.out.println(class1 == class2);
		System.out.println(class2 == class3);
	}

}
