package com.qiao.map;

import java.util.HashMap;

import com.qiao.bean.Student;

public class Test5_HashMap {

	/**
	 * HashMap���ϼ�Studentֵ��String�İ���
	 */
	public static void main(String[] args) {
		HashMap<Student,String> hm = new HashMap<>();
		hm.put(new Student("����",23), "����");
		hm.put(new Student("����",23), "�Ϻ�");
		hm.put(new Student("����",24), "����");
		hm.put(new Student("����",25), "����");
		
		System.out.println(hm.toString());//����AbstractMap��д��toString����
	}

}
