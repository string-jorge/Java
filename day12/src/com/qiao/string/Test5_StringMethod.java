package com.qiao.string;

public class Test5_StringMethod {
	/**
	 * int length():��ȡ�ַ�������
	 * char charAt(int index):��ȡָ��������λ�õ��ַ�
	 * int indexOf(intch):����ָ���ַ��ڴ��ַ����е�һ�γ��ֵĵ����� 
	 * int indexOf(String str):����ָ���ַ����ڴ��ַ����е�һ�γ��ֵĵ�����
	 * int indexOf(int ch,int fromIndex):����ָ���ַ��ڴ��ַ����д�ָ��λ�ú��һ�γ��ֵ����� 
	 * int indexOf(String str,int fromIndex):����ָ���ַ����ڴ��ַ����д�ָ��λ�ú��һ�γ��ֵ����� 
	 * lastIndexOf
	 * String substring(int start):��ָ��λ�ÿ�ʼ��ȡ�ַ���,Ĭ�ϵ���β 
	 * String substring(int start,int end):��ָ��λ�ÿ�ʼ��ָ��λ�ý�����ȡ�ַ���
	 */
	public static void main(String[] args) {
		// demo1();
		// demo2();
		// demo3();
		// demo4();
		// demo5();
	}

	private static void demo5() {
		//������
		String s = "woaishiqiao";
		s.substring(4);// ����û�м�¼�����ɵ��ַ���,substring�����һ���µ��ַ���,��Ҫ���µ��ַ�����¼
		System.out.println(s);// "woaishiqiao",��ӡ���Ƕ���s
	}

	private static void demo4() {
		// ��ָ��λ�ÿ�ʼ��ȡ�ַ���,Ĭ�ϵ�ĩβ
		String s1 = "shiqiaowudi";
		String s2 = s1.substring(7);// ��ָ��λ��(����7)��ʼ��ȡ��ĩβ
		System.out.println(s2);

		// ��ָ��λ�ÿ�ʼ��ָ��λ�ý�����ȡ�ַ���
		String s3 = s1.substring(0, 7);// ��ȡ"shiqiao",��0������ʼ��7����,����������7,����ͷ,������β,����ҿ�
		System.out.println(s3);
	}

	private static void demo3() {
		// ����ָ���ַ��ڴ��ַ����д�ָ��λ�ú��һ�γ��ֵ�����
		String s1 = "woaishiqiao";
		int index1 = s1.indexOf('a', 3);// 9,��ָ��λ��(����3)��ʼ������ַ�'a'
		System.out.println(index1);

		// ����ָ���ַ����ڴ��ַ����д�ָ��λ�ú��һ�γ��ֵ�����
		String s2 = "woai,woaini";
		int index2 = s2.indexOf("ai", 4);// 7,��ָ��λ��(����4)��ʼ������ַ���"ai"
		System.out.println(index2);

		// lastIndexOf;�Ӻ���ǰ��,��һ�γ��ֵ��ַ�
		int index3 = s2.lastIndexOf('a');// 7,�Ӻ���ǰ��,��һ�γ��ֵ��ַ�'a'
		System.out.println(index3);

		int index4 = s2.lastIndexOf('a', 6);// 2,��ָ��λ��(����6)��ʼ��ǰ���ַ�'a'
		System.out.println(index4);
	}

	private static void demo2() {
		// ����ָ���ַ��ڴ��ַ����е�һ�γ��ֵĵ�����
		String s1 = "shiqiao";
		int index1 = s1.indexOf('h');// 1,�������ܵ���int���͵�,����char���͵Ļ��Զ�����
		System.out.println(index1);

		int index2 = s1.indexOf('x');
		System.out.println(index2);// -1,��������ڷ��ؾ���-1

		// ����ָ���ַ����ڴ��ַ����е�һ�γ��ֵĵ�����
		int index3 = s1.indexOf("qiao");// 3,��ȡ�ַ����е�һ���ַ����ֵ�λ��
		System.out.println(index3);

		int index4 = s1.indexOf("io");// -1û������,�Ҳ����ַ���
		System.out.println(index4);
	}

	private static void demo1() {
		/*
		 * int[] arr = {10,20,30};
		 * System.out.println(arr.length);//�����е�length������
		 */
		// ��ȡ�ַ�������
		String s1 = "shiqiao";
		System.out.println(s1.length());// ������7
		String s2 = "��Ҫ����,����?";
		System.out.println(s2.length());// ������8,length��һ��������ȡ����ÿһ���ַ��ĸ���,����Ҳ��һ���ַ�

		// ��ȡָ��������λ�õ��ַ�
		char c1 = s2.charAt(5);// ����������ȡ��Ӧλ�õ��ַ�
		System.out.println(c1);

		char c2 = s2.charAt(10);// StringIndexOutOfBoundsException�ַ�������Խ���쳣
		System.out.println(c2);
	}

}
