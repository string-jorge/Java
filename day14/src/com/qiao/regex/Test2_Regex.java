package com.qiao.regex;

public class Test2_Regex {

	/**
	 * 字符类 
		[abc] a、b 或 c（简单类） 
		[^abc] 任何字符，除了 a、b 或 c（否定） 
		[a-zA-Z] a 到 z 或 A 到 Z，两头的字母包括在内（范围） 
		[a-d[m-p]] a 到 d 或 m 到 p：[a-dm-p]（并集） 
		[a-z&&[def]] d、e 或 f（交集） 
		[a-z&&[^bc]] a 到 z，除了 b 和 c：[ad-z]（减去） 
		[a-z&&[^m-p]] a 到 z，而非 m 到 p：[a-lq-z]（减去） 

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
		//[a-z&&[^m-p]] a 到 z，而非 m 到 p：[a-lq-z]（减去） 
		String regex = "[a-z&&[^m-p]]";//a 到 z，而非 m 到 p
		System.out.println("m".matches(regex));//flase
		System.out.println("a".matches(regex));//true
		System.out.println("z".matches(regex));//true
		System.out.println("n".matches(regex));//flase
	}

	private static void demo6() {
		//[a-z&&[^bc]] a 到 z，除了 b 和 c：[ad-z]（减去）
		String regex = "[a-z&&[^bc]]";//a 到 z，除了 b 和 c
		System.out.println("a".matches(regex));//true
		System.out.println("b".matches(regex));//flase
		System.out.println("1".matches(regex));//flase
	}

	private static void demo5() {
		//[a-z&&[def]] d、e 或 f（交集） 
		String regex = "[a-z&&[def]]";//小写字母,取交集代表def
		System.out.println("a".matches(regex));//flase
		System.out.println("d".matches(regex));//true
	}

	private static void demo4() {
		//[a-d[m-p]] a 到 d 或 m 到 p：[a-dm-p]（并集） 
		String regex = "[a-d[m-p]]";//小写字母a-d并上m-p
		System.out.println("a".matches(regex));//true
		System.out.println("d".matches(regex));//true
		
		System.out.println("f".matches(regex));//flase
		System.out.println("A".matches(regex));//flase
		
		System.out.println("m".matches(regex));//true
		System.out.println("p".matches(regex));//true
	}

	private static void demo3() {
		//[a-zA-Z] a 到 z 或 A 到 Z，两头的字母包括在内（范围） 
		String regex = "[a-zA-Z]";//大小写字母都可以
		System.out.println("a".matches(regex));//true
		System.out.println("A".matches(regex));//true
		System.out.println("z".matches(regex));//true
		System.out.println("Z".matches(regex));//true
		System.out.println("1".matches(regex));//flase
		System.out.println("%".matches(regex));//flase
	}

	private static void demo2() {
		//[^abc] 任何字符，除了 a、b 或 c（否定） 
		String regex = "[^abc]";//除了a,b或c,剩下的字符都可以
		System.out.println("a".matches(regex));//flase
		System.out.println("b".matches(regex));//flase
		System.out.println("c".matches(regex));//flase
		System.out.println("d".matches(regex));//true
		System.out.println("1".matches(regex));//true
		System.out.println("%".matches(regex));//true
		System.out.println("10".matches(regex));//false,10代表1字符和0字符,不是单个字符
	}

	private static void demo1() {
		//[abc] a、b 或 c（简单类） 
		String regex = "[abc]";//代表a、b 或 c
		System.out.println("a".matches(regex));//true
		System.out.println("b".matches(regex));//true
		System.out.println("c".matches(regex));//true
		System.out.println("d".matches(regex));//flase
		System.out.println("1".matches(regex));//flase
		System.out.println("%".matches(regex));//flase
	}

}
