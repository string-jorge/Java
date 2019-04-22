package com.qiao.set;

import java.util.Comparator;
import java.util.TreeSet;

import com.qiao.bean.Person;

public class Test3_TreeSet {

	/**
	 * TreeSet������������Ԫ�ؽ��������,ͬ����Ҳ���Ա�֤Ԫ�ص�Ψһ
	 * 
	 * ��compareTo��������0��ʱ�򼯺���ֻ��һ��Ԫ��
	 * ��compareTo��������������ʱ�򼯺ϻ���ô����ôȡ
	 * ��compareTo�������ظ�����ʱ�򼯺ϻᵹ��洢
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		//demo4();
		//���ַ������ճ�������
		TreeSet<String> tr = new TreeSet<>(new CompareByLen());		//�Ƚ���:Comparator c = new CompareByLen();
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
		tr.add(new Person("����",24));
		tr.add(new Person("����",23));
		tr.add(new Person("����",26));
		tr.add(new Person("����",25));
		
		System.out.println('��' + 0);//24352
		System.out.println('��' + 0);//26446
		System.out.println('��' + 0);//29579
		System.out.println('��' + 0);//36213
		
		System.out.println(tr);
	}

	private static void demo2() {
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("����",23));
		ts.add(new Person("����",24));
		ts.add(new Person("����",24));
		ts.add(new Person("����",25));
		ts.add(new Person("����",26));
		
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
	//�����ַ����ĳ��ȱȽ�
	public int compare(String s1, String s2) {
		int num = s1.length() - s2.length();			//�ַ��������ǱȽϵ���Ҫ����
		return num == 0 ? s1.compareTo(s2) : num;		//�ַ��������ǱȽϵĴ�Ҫ����
	}
	
}