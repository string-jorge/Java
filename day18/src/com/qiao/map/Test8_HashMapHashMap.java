package com.qiao.map;

import java.util.HashMap;

import com.qiao.bean.Student;

public class Test8_HashMapHashMap {

//����Ƕ��֮HashMapǶ��HashMap
	public static void main(String[] args) {
		//�������1701��
		HashMap<Student, String> software_one = new HashMap<>();
		software_one.put(new Student("����",23), "μ��");
		software_one.put(new Student("����",24), "����");
		software_one.put(new Student("����",25), "�±�");
		software_one.put(new Student("����",26), "����");
		//�������1702��
		HashMap<Student, String> software_two = new HashMap<>();
		software_two.put(new Student("����",27), "����");
		software_two.put(new Student("����",28), "����");
		software_two.put(new Student("����",29), "�γ�");
		software_two.put(new Student("�Ը�",30), "��ľ");
		//������ϢѧԺ
		HashMap<HashMap<Student, String>,String> dzxx = new HashMap<>();
		dzxx.put(software_one, "�������1701��");
		dzxx.put(software_two, "�������1702��");
		//����˫�м���
		for(HashMap<Student,String> software : dzxx.keySet()) {
			String value1 = dzxx.get(software);
			for(Student key : software.keySet()) {
				String value2 = software.get(key);
				System.out.println(key + "=" + value2 + "=" + value1);
			}
		}
	}

}
