package com.qiao.test;

import java.lang.reflect.Field;

public class Tool {
	public	void setProperty(Object obj,String propertyName,Object value) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Class clazz = obj.getClass();		//获取字节码对象
		Field f = clazz.getDeclaredField(propertyName);		//暴力反射获取字段
		f.setAccessible(true);			//去除权限
		f.set(obj, value);
	}
}
