package com.qiao.regex;

public class Test4_Regex {

	/**
	 * Greedy 数量词 
			X? X，一次或一次也没有 
			X* X，零次或多次 
			X+ X，一次或多次 
			X{n} X，恰好 n 次 
			X{n,} X，至少 n 次 
			X{n,m} X，至少 n 次，但是不超过 m 次 

	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		//demo4();
		//demo5();
		//demo6();
	}

	private static void demo6() {
		//X{n,m} X，至少 n 次，但是不超过 m 次 
		String regex = "[abc]{5,10}";
		System.out.println("abc".matches(regex));//false
		System.out.println("abcabc".matches(regex));//true
		System.out.println("abcabcabcabac".matches(regex));//false
	}

	private static void demo5() {
		//X{n,} X，至少 n 次 
		String regex = "[abc]{5,}";
		System.out.println("a".matches(regex));//false
		System.out.println("abca".matches(regex));//false
		System.out.println("aabcbacbabcb".matches(regex));//true
		System.out.println("acbabc".matches(regex));//true
		System.out.println("abcab".matches(regex));//true
	}

	private static void demo4() {
		//X{n} X，恰好 n 次 
		String regex = "[abc]{5}";
		System.out.println("abcab".matches(regex));//true,刚好出现5次
		System.out.println("abcacbbcaacbbca".matches(regex));//false
		System.out.println("abc".matches(regex));//false
		System.out.println("abcaccccc".matches(regex));//false
	}

	private static void demo3() {
		//X+ X，一次或多次
		String regex = "[abc]+";
		System.out.println("".matches(regex));//false
		System.out.println("a".matches(regex));//true
		System.out.println("aaaaaaaaaaaaa".matches(regex));//true
		System.out.println("bbbbbbbbbb".matches(regex));//true
	}

	private static void demo2() {
		//X* X，零次或多次
		String regex = "[abc]*";
		System.out.println("".matches(regex));//true
		System.out.println("abc".matches(regex));//true
		System.out.println("ab".matches(regex));//true
		System.out.println("a".matches(regex));//true
	}

	private static void demo1() {
		//X? X，一次或一次也没有 
		String regex = "[abc]?";
		System.out.println("a".matches(regex));//true
		System.out.println("b".matches(regex));//true
		System.out.println("c".matches(regex));//true
		System.out.println("d".matches(regex));//flase
		System.out.println("".matches(regex));//true,一次也没有
	}

}
