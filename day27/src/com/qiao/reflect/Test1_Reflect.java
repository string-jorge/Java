package com.qiao.reflect;

import com.qiao.bean.Person;

public class Test1_Reflect {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		Person p = new Person();
		
		Class class1 = p.getClass();			//通过对象获取字节码文件对象,作用:判断是否是同一个字节码对象
		Class class2 = Person.class;			//通过编译变成字节码文件对象,作用:当作锁对象
		Class class3 = Class.forName("com.qiao.bean.Person");		//通过对象反向获取字节码文件对象,作用:读取配置文件
		
		System.out.println(class1 == class2);
		System.out.println(class2 == class3);
	}

}
