package com.qiao.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import com.qiao.bean.Person;

public class Test4_Field {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("com.qiao.bean.Person");		//��ȡ�ֽ����ļ�����
		Constructor c = clazz.getConstructor(String.class,String.class,int.class);			//ͨ���ֽ����ļ������ȡ�вι���
		Person p = (Person) c.newInstance("s001","����",23);			//ͨ���вι��촴������
		
		Field f = clazz.getDeclaredField("name");		//ͨ���ֽ����ļ���������ȡ�ֶ�(��Ա����)
		f.setAccessible(true);			//ȥ��˽��Ȩ��
		f.set(p, "����");
		System.out.println(p);
	}

}
