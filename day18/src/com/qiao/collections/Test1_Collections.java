package com.qiao.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test1_Collections {

	/**
	 * Collections�еĳ�������
	 * public static <T> void sort(List<T> list)//�����Ͻ�������
	 * public static <T> int binarySearch(List<?> list,T key)//���ֲ��ҷ�,��ȡ�����в���ֵ������
	 * public static <T> T max(Collections<?> coll)//����Ĭ����������ȡ�����е����ֵ
	 * public static void reverse(List<T> list)//��ת����
	 * public static void shuffle(List<T> list)//�漴�û�
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
	}

	private static void demo3() {
		ArrayList<String> list = new ArrayList<>();
		list.add("f");
		list.add("a");
		list.add("c");
		list.add("g");
		list.add("d");
		//��ȡ�����е����ֵ
		System.out.println(Collections.max(list));
		//��ȡ�����е���Сֵ
		System.out.println(Collections.min(list));
		//�Լ���Ԫ�ؽ��з�ת
		Collections.reverse(list);
		System.out.println(list);
		//�漴�û�,��������ϴ��
		Collections.shuffle(list);
		System.out.println(list);
	}

	private static void demo2() {
		//���ֲ��ҷ�,��ȡ�����в���ֵ������
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("c");
		list.add("d");
		list.add("f");
		list.add("g");
		
		System.out.println(Collections.binarySearch(list, "c"));
		System.out.println(Collections.binarySearch(list, "b"));
	}

	private static void demo1() {
		//�����Ͻ�������
		ArrayList<String> list = new ArrayList<>();
		list.add("c");
		list.add("a");
		list.add("a");
		list.add("d");
		list.add("b");
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
	}

}
