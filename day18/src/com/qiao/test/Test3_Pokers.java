package com.qiao.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

class Test3_Pokers {
	public static void main(String[] args) {

		// poker
		String[] color = { "红桃", "黑桃", "方片", "梅花" };
		String[] num = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K", "A", "2" };

		HashMap<Integer, String> hm = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		int index = 0;

		for (String s1 : num) {
			for (String s2 : color) {
				hm.put(index, s2.concat(s1));
				list.add(index);
				index++;
			}
		}
		hm.put(index, "小王");
		list.add(index);
		index++;
		hm.put(index, "大王");
		list.add(index);
		// shuffle
		Collections.shuffle(list);
		// deal
		TreeSet<Integer> one = new TreeSet<>();
		TreeSet<Integer> two = new TreeSet<>();
		TreeSet<Integer> three = new TreeSet<>();
		TreeSet<Integer> dipai = new TreeSet<>();

		for (int i = 0; i < list.size(); i++) {
			if (i > list.size() - 4) {
				dipai.add(list.get(i));
			} else if (i % 3 == 0) {
				one.add(list.get(i));
			} else if (i % 3 == 1) {
				two.add(list.get(i));
			} else {
				three.add(list.get(i));
			}
		}
		// lookPoker
		lookPoker(hm, one, "Person_one");
		lookPoker(hm, two, "Person_two");
		lookPoker(hm, three, "Person_three");
		lookPoker(hm, dipai, "底牌");
	}

	// lookPoker
	public static void lookPoker(HashMap<Integer, String> hm,
			TreeSet<Integer> ts, String name) {
		if(name == "底牌") {
		System.out.print("底牌是:");	
		} else {
		System.out.print(name + "的牌是:");
		}
		for (Integer i : ts) {
			System.out.print(hm.get(i) + " ");
		}
		System.out.println();
	}
}