package com.qiao.set;

import java.util.Comparator;
import java.util.TreeSet;

import com.qiao.bean.Person;

public class Test3_TreeSet {

	/**
	 * TreeSet集合是用来对元素进行排序的,同样他也可以保证元素的唯一
	 * 
	 * 当compareTo方法返回0的时候集合中只有一个元素
	 * 当compareTo方法返回正数的时候集合会怎么存怎么取
	 * 当compareTo方法返回负数的时候集合会倒序存储
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		//demo4();
		//将字符串按照长度排序
		TreeSet<String> tr = new TreeSet<>(new CompareByLen());		//比较器:Comparator c = new CompareByLen();
		tr.add("aaaaaaaa");
		tr.add("vv");
		tr.add("nba");
		tr.add("cba");
		tr.add("z");
		
		System.out.println(tr);
	}

	private static void demo4() {
		TreeSet<Person> tr = new TreeSet<>();
		tr.add(new Person("zhangsan",23));
		tr.add(new Person("lisi",24));
		tr.add(new Person("wangwu",25));
		tr.add(new Person("zhaoliu",26));
		tr.add(new Person("aaaa",27));
		
		System.out.println(tr);
	}

	private static void demo3() {
		TreeSet<Person> tr = new TreeSet<>();
		tr.add(new Person("李四",24));
		tr.add(new Person("张三",23));
		tr.add(new Person("赵六",26));
		tr.add(new Person("王五",25));
		
		System.out.println('张' + 0);//24352
		System.out.println('李' + 0);//26446
		System.out.println('王' + 0);//29579
		System.out.println('赵' + 0);//36213
		
		System.out.println(tr);
	}

	private static void demo2() {
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("张三",23));
		ts.add(new Person("李四",24));
		ts.add(new Person("周七",24));
		ts.add(new Person("王五",25));
		ts.add(new Person("赵六",26));
		
		System.out.println(ts);
	}

	private static void demo1() {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(3);
		ts.add(2);
		ts.add(3);
		ts.add(1);
		ts.add(3);	
		ts.add(2);	
		ts.add(3);
		
		System.out.println(ts);
	}
}

class CompareByLen /*extends Object*/ implements Comparator<String> {

	@Override
	//按照字符串的长度比较
	public int compare(String s1, String s2) {
		int num = s1.length() - s2.length();			//字符串长度是比较的主要条件
		return num == 0 ? s1.compareTo(s2) : num;		//字符串内容是比较的次要内容
	}
	
}