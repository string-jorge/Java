package com.qiao.regex;

public class Test3_Regex {

	/**
	 * Ԥ�����ַ��� 
		. �κ��ַ������н���������ƥ��Ҳ���ܲ�ƥ�䣩 
		\d ���֣�[0-9] 
		\D �����֣� [^0-9] 
		\s �հ��ַ���[ \t\n\x0B\f\r] 
		\S �ǿհ��ַ���[^\s] 
		\w �����ַ���[a-zA-Z_0-9] 
		\W �ǵ����ַ���[^\w] 
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
		//\W �ǵ����ַ���[^\w] 
		String regex = "\\W";
		System.out.println("a".matches(regex));//flase
		System.out.println("Z".matches(regex));//flase
		System.out.println("_".matches(regex));//flase
		System.out.println("5".matches(regex));//flase
		System.out.println("%".matches(regex));//true
	}

	private static void demo6() {
		//\w �����ַ���[a-zA-Z_0-9] 
		String regex = "\\w";//��д��ĸ+Сд��ĸ+_+����
		System.out.println("a".matches(regex));//true
		System.out.println("Z".matches(regex));//true
		System.out.println("_".matches(regex));//true
		System.out.println("5".matches(regex));//true
		System.out.println("%".matches(regex));//flase
	}

	private static void demo5() {
		//\S �ǿհ��ַ���[^\s]
		String regex = "\\S";
		System.out.println(" ".matches(regex));//false
		System.out.println("	".matches(regex));//false
		System.out.println("a".matches(regex));//true
		System.out.println("1".matches(regex));//true
		System.out.println("*".matches(regex));//true
	}

	private static void demo4() {
		//\s �հ��ַ���[ \t\n\x0B\f\r] 
		String regex = "\\s";
		System.out.println(" ".matches(regex));//һ���ո�,true
		System.out.println("	".matches(regex));//һ��tab��,true
		System.out.println("    ".matches(regex));//�ĸ��ո�,flase
	}

	private static void demo3() {
		//\D �����֣� [^0-9] 
		String regex = "\\D";//����������
		System.out.println("0".matches(regex));//flase
		System.out.println("9".matches(regex));//flase
		System.out.println("a".matches(regex));//true
	}

	private static void demo2() {
		//\d ���֣�[0-9] 
		String regex = "\\d";//\����ת���ַ�,������ʾ\d,��Ҫ\\d
		System.out.println("a".matches(regex));//flase
		System.out.println("5".matches(regex));//true
	}

	private static void demo1() {
		//.�κ��ַ������н���������ƥ��Ҳ���ܲ�ƥ�䣩
		String regex = ".";
		System.out.println("a".matches(regex));//true
		System.out.println("Z".matches(regex));//true
		System.out.println("1".matches(regex));//true
		System.out.println("6".matches(regex));//true
		System.out.println("%".matches(regex));//true
		System.out.println("+".matches(regex));//true
	}

}
