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
		Class clazz = Class.forName("com.qiao.bean.Person");		//获取字节码文件对象
		Constructor c = clazz.getConstructor(String.class,String.class,int.class);		//通过反射获取有参的构造
		Person p = (Person) c.newInstance("s001","张三",23);			//通过有参构造创建实例(通过有参创建对象)
		System.out.println(p);
	}

}
