package com.qiao.regex;

public class Test3_Regex {

	/**
	 * 预定义字符类 
		. 任何字符（与行结束符可能匹配也可能不匹配） 
		\d 数字：[0-9] 
		\D 非数字： [^0-9] 
		\s 空白字符：[ \t\n\x0B\f\r] 
		\S 非空白字符：[^\s] 
		\w 单词字符：[a-zA-Z_0-9] 
		\W 非单词字符：[^\w] 
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		//demo4();
		//demo5();
		//demo6();
		//demo7();
	}

	private static void demo7() {
		//\W 非单词字符：[^\w] 
		String regex = "\\W";
		System.out.println("a".matches(regex));//flase
		System.out.println("Z".matches(regex));//flase
		System.out.println("_".matches(regex));//flase
		System.out.println("5".matches(regex));//flase
		System.out.println("%".matches(regex));//true
	}

	private static void demo6() {
		//\w 单词字符：[a-zA-Z_0-9] 
		String regex = "\\w";//大写字母+小写字母+_+数字
		System.out.println("a".matches(regex));//true
		System.out.println("Z".matches(regex));//true
		System.out.println("_".matches(regex));//true
		System.out.println("5".matches(regex));//true
		System.out.println("%".matches(regex));//flase
	}

	private static void demo5() {
		//\S 非空白字符：[^\s]
		String regex = "\\S";
		System.out.println(" ".matches(regex));//false
		System.out.println("	".matches(regex));//false
		System.out.println("a".matches(regex));//true
		System.out.println("1".matches(regex));//true
		System.out.println("*".matches(regex));//true
	}

	private static void demo4() {
		//\s 空白字符：[ \t\n\x0B\f\r] 
		String regex = "\\s";
		System.out.println(" ".matches(regex));//一个空格,true
		System.out.println("	".matches(regex));//一个tab键,true
		System.out.println("    ".matches(regex));//四个空格,flase
	}

	private static void demo3() {
		//\D 非数字： [^0-9] 
		String regex = "\\D";//除数字以外
		System.out.println("0".matches(regex));//flase
		System.out.println("9".matches(regex));//flase
		System.out.println("a".matches(regex));//true
	}

	private static void demo2() {
		//\d 数字：[0-9] 
		String regex = "\\d";//\代表转义字符,如果想表示\d,需要\\d
		System.out.println("a".matches(regex));//flase
		System.out.println("5".matches(regex));//true
	}

	private static void demo1() {
		//.任何字符（与行结束符可能匹配也可能不匹配）
		String regex = ".";
		System.out.println("a".matches(regex));//true
		System.out.println("Z".matches(regex));//true
		System.out.println("1".matches(regex));//true
		System.out.println("6".matches(regex));//true
		System.out.println("%".matches(regex));//true
		System.out.println("+".matches(regex));//true
	}

}
