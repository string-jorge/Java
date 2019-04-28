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
		Class clazz = Class.forName("com.qiao.bean.Person");		//获取字节码文件对象
		Constructor c = clazz.getConstructor(String.class,String.class,int.class);			//通过字节码文件对象获取有参构造
		Person p = (Person) c.newInstance("s001","张三",23);			//通过有参构造创建对象
		
		Field f = clazz.getDeclaredField("name");		//通过字节码文件对象暴力获取字段(成员变量)
		f.setAccessible(true);			//去除私有权限
		f.set(p, "李四");
		System.out.println(p);
	}

}
