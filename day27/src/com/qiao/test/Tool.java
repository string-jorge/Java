package com.qiao.test;

import java.lang.reflect.Field;

public class Tool {
	public	void setProperty(Object obj,String propertyName,Object value) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Class clazz = obj.getClass();		//��ȡ�ֽ������
		Field f = clazz.getDeclaredField(propertyName);		//���������ȡ�ֶ�
		f.setAccessible(true);			//ȥ��Ȩ��
		f.set(obj, value);
	}
}
