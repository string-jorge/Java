package com.qiao.regex;

public class Test2_Regex {

	/**
	 * �ַ��� 
		[abc] a��b �� c�����ࣩ 
		[^abc] �κ��ַ������� a��b �� c���񶨣� 
		[a-zA-Z] a �� z �� A �� Z����ͷ����ĸ�������ڣ���Χ�� 
		[a-d[m-p]] a �� d �� m �� p��[a-dm-p]�������� 
		[a-z&&[def]] d��e �� f�������� 
		[a-z&&[^bc]] a �� z������ b �� c��[ad-z]����ȥ�� 
		[a-z&&[^m-p]] a �� z������ m �� p��[a-lq-z]����ȥ�� 

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
		//[a-z&&[^m-p]] a �� z������ m �� p��[a-lq-z]����ȥ�� 
		String regex = "[a-z&&[^m-p]]";//a �� z������ m �� p
		System.out.println("m".matches(regex));//flase
		System.out.println("a".matches(regex));//true
		System.out.println("z".matches(regex));//true
		System.out.println("n".matches(regex));//flase
	}

	private static void demo6() {
		//[a-z&&[^bc]] a �� z������ b �� c��[ad-z]����ȥ��
		String regex = "[a-z&&[^bc]]";//a �� z������ b �� c
		System.out.println("a".matches(regex));//true
		System.out.println("b".matches(regex));//flase
		System.out.println("1".matches(regex));//flase
	}

	private static void demo5() {
		//[a-z&&[def]] d��e �� f�������� 
		String regex = "[a-z&&[def]]";//Сд��ĸ,ȡ��������def
		System.out.println("a".matches(regex));//flase
		System.out.println("d".matches(regex));//true
	}

	private static void demo4() {
		//[a-d[m-p]] a �� d �� m �� p��[a-dm-p]�������� 
		String regex = "[a-d[m-p]]";//Сд��ĸa-d����m-p
		System.out.println("a".matches(regex));//true
		System.out.println("d".matches(regex));//true
		
		System.out.println("f".matches(regex));//flase
		System.out.println("A".matches(regex));//flase
		
		System.out.println("m".matches(regex));//true
		System.out.println("p".matches(regex));//true
	}

	private static void demo3() {
		//[a-zA-Z] a �� z �� A �� Z����ͷ����ĸ�������ڣ���Χ�� 
		String regex = "[a-zA-Z]";//��Сд��ĸ������
		System.out.println("a".matches(regex));//true
		System.out.println("A".matches(regex));//true
		System.out.println("z".matches(regex));//true
		System.out.println("Z".matches(regex));//true
		System.out.println("1".matches(regex));//flase
		System.out.println("%".matches(regex));//flase
	}

	private static void demo2() {
		//[^abc] �κ��ַ������� a��b �� c���񶨣� 
		String regex = "[^abc]";//����a,b��c,ʣ�µ��ַ�������
		System.out.println("a".matches(regex));//flase
		System.out.println("b".matches(regex));//flase
		System.out.println("c".matches(regex));//flase
		System.out.println("d".matches(regex));//true
		System.out.println("1".matches(regex));//true
		System.out.println("%".matches(regex));//true
		System.out.println("10".matches(regex));//false,10����1�ַ���0�ַ�,���ǵ����ַ�
	}

	private static void demo1() {
		//[abc] a��b �� c�����ࣩ 
		String regex = "[abc]";//����a��b �� c
		System.out.println("a".matches(regex));//true
		System.out.println("b".matches(regex));//true
		System.out.println("c".matches(regex));//true
		System.out.println("d".matches(regex));//flase
		System.out.println("1".matches(regex));//flase
		System.out.println("%".matches(regex));//flase
	}

}
