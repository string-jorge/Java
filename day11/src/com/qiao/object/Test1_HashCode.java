package com.qiao.object;

import com.qiao.one.Student;

public class Test1_HashCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Object o = new Object();
		int hashCode1 = o.hashCode();
		System.out.println(hashCode1);
		Student s = new Student("ˆÈı",23);
		int hashCode2 = s.hashCode();
		System.out.println(hashCode2);
	}

}
