package com.qiao.test;

import java.util.ArrayList;

public class Test8 {

	/**
	 * Լɪ��
	 */
	public static void main(String[] args) {
		System.out.print(getLucklyNum(500));
	}
	public static int getLucklyNum(int num) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= num ; i++) {
			list.add(i);
		}
		int count = 1;
		for(int i = 0;list.size() != 1;i++) {
			if(i == list.size()) {
				i = 0;
			}
			if(count % 3 == 0) {
				list.remove(i--);
			}
			count++;
		}
		return list.get(0);
	}
}