package com.qiao.test;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test1 {

	/**
	 * @param args
	 * @throws Exception 
	 * ArrayList<Integer>��һ������,��������������һ���ַ�������,���ʵ����?
	 * ����ֻ���ڱ�������Ч,�������ڻᱻ����
	 */
	public static void main(String[] args) throws Exception {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(123);
		list.add(456);
		
		Class clazz = Class.forName("java.util.ArrayList");			//��ȡ�ֽ������
		Method m = clazz.getMethod("add", Object.class);		//��ȡadd����
		m.invoke(list, "abc");		//�÷�����������ַ�������
		
		System.out.println(list);
	}

}
