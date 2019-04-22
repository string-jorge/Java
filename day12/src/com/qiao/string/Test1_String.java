package com.qiao.string;

public class Test1_String {

	/**
	 * a:字符串字面值"abc"也可以看成是一个字符串对象
	 * b:字符串是常量,一单被赋值,就不能改变
	 */
	public static void main(String[] args) {
		String str = "abc";//"abc"可以看成一个字符串的对象
		str = "def";//当把"def"赋值给str,原来的"abc"就变成了垃圾
		System.out.println(str.toString());//String类重写了toString方法返回的是该对象本身
	}

}
