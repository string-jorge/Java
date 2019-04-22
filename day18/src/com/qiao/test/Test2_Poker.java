package com.qiao.test;

import java.util.ArrayList;
import java.util.Collections;


public class Test2_Poker {

	/**
	 * ģ�¶�����ϴ�ƺͷ���
	 */
	public static void main(String[] args) {
		//1.����
		String[] color = {"����","����","��Ƭ","÷��"};
		String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		ArrayList<String> poker = new ArrayList<>();
		for (String s1 : color) {
			for (String s2: num) {
				poker.add(s1.concat(s2));
			}
		}
		poker.add("����");
		poker.add("С��");
		//System.out.println(poker);
		//2.ϴ��
		Collections.shuffle(poker);
		//3.����
		ArrayList<String> person_one = new ArrayList<>();
		ArrayList<String> person_two = new ArrayList<>();
		ArrayList<String> person_three = new ArrayList<>();
		ArrayList<String> dipai = new ArrayList<>();
		for(int i = 0;i < poker.size();i++) {
			if(i > poker.size() - 4) {
				dipai.add(poker.get(i));
			} else if (i % 3 == 0) {
				person_one.add(poker.get(i));
			} else if (i % 3 == 1) {
				person_two.add(poker.get(i));
			} else {
				person_three.add(poker.get(i));
			}
		}
		System.out.println(person_one);
		System.out.println(person_two);
		System.out.println(person_three);
		System.out.println(dipai);
	}

}
