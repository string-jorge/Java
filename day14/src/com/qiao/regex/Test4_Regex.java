package com.qiao.regex;

public class Test4_Regex {

	/**
	 * Greedy ������ 
			X? X��һ�λ�һ��Ҳû�� 
			X* X����λ��� 
			X+ X��һ�λ��� 
			X{n} X��ǡ�� n �� 
			X{n,} X������ n �� 
			X{n,m} X������ n �Σ����ǲ����� m �� 

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
		//X{n,m} X������ n �Σ����ǲ����� m �� 
		String regex = "[abc]{5,10}";
		System.out.println("abc".matches(regex));//false
		System.out.println("abcabc".matches(regex));//true
		System.out.println("abcabcabcabac".matches(regex));//false
	}

	private static void demo5() {
		//X{n,} X������ n �� 
		String regex = "[abc]{5,}";
		System.out.println("a".matches(regex));//false
		System.out.println("abca".matches(regex));//false
		System.out.println("aabcbacbabcb".matches(regex));//true
		System.out.println("acbabc".matches(regex));//true
		System.out.println("abcab".matches(regex));//true
	}

	private static void demo4() {
		//X{n} X��ǡ�� n �� 
		String regex = "[abc]{5}";
		System.out.println("abcab".matches(regex));//true,�պó���5��
		System.out.println("abcacbbcaacbbca".matches(regex));//false
		System.out.println("abc".matches(regex));//false
		System.out.println("abcaccccc".matches(regex));//false
	}

	private static void demo3() {
		//X+ X��һ�λ���
		String regex = "[abc]+";
		System.out.println("".matches(regex));//false
		System.out.println("a".matches(regex));//true
		System.out.println("aaaaaaaaaaaaa".matches(regex));//true
		System.out.println("bbbbbbbbbb".matches(regex));//true
	}

	private static void demo2() {
		//X* X����λ���
		String regex = "[abc]*";
		System.out.println("".matches(regex));//true
		System.out.println("abc".matches(regex));//true
		System.out.println("ab".matches(regex));//true
		System.out.println("a".matches(regex));//true
	}

	private static void demo1() {
		//X? X��һ�λ�һ��Ҳû�� 
		String regex = "[abc]?";
		System.out.println("a".matches(regex));//true
		System.out.println("b".matches(regex));//true
		System.out.println("c".matches(regex));//true
		System.out.println("d".matches(regex));//flase
		System.out.println("".matches(regex));//true,һ��Ҳû��
	}

}
