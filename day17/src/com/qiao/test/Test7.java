package com.qiao.test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import com.qiao.bean.Student;

public class Test7 {

	/**
	 * ����:����¼��5��ѧ����Ϣ(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�),�����ִܷӸߵ������������̨
	 * ����:
	 * 1.����һ��ѧ����
	 * 		��Ա����:����,���ĳɼ�,��ѧ�ɼ�Ӣ��ɼ�,�ܳɼ�
	 * 		��Ա����:�ղι���,�вι���Ĳ����ֱ�������,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�toString����,�ڱ��������е�Student�����ӡ�������õ�ʱ�����ʾ����ֵ
	 * 2.����¼����ҪScanner,��������¼�����
	 * 3.����TreeSet���϶���,��TreeSet�Ĺ��캯���д���Ƚ���,���ֱܷȽ�
	 * 4.¼�����ѧ��,�����Լ����е�ѧ������Ϊ�ж�����,���size��С��5�ʹ洢
	 * 5.��¼����ַ����и�,�ö����и�,�᷵��һ���ַ�������,���ַ��������дӵڶ���Ԫ��ת����int��
	 * 6.��ת����Ľ����װ��Student����,��Student��ӵ�TreeSet������
	 * 7.����TreeSet���ϴ�ӡÿһ��Student����
	 */
	public static void main(String[] args) {
		//2.����¼����ҪScanner,��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ���ɼ���ʽ��(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�):");
		//3.����TreeSet���϶���,��TreeSet�Ĺ��캯���д���Ƚ���,���ֱܷȽ�
		TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				int num = s2.getSum() - s1.getSum();
				return num == 0 ? 1 : num;
			}
		});
		//4.¼�����ѧ��,�����Լ����е�ѧ������Ϊ�ж�����,���size��С��5�ʹ洢
		while(ts.size() < 5) {
			//5.��¼����ַ����и�,�ö����и�,�᷵��һ���ַ�������,���ַ��������дӵڶ���Ԫ��ת����int��
			try {
				String line = sc.nextLine();
			String[] arr = line.split(",");//�ö����и�¼����ַ���
			int chinese = Integer.parseInt(arr[1]);
			int math = Integer.parseInt(arr[2]);
			int english = Integer.parseInt(arr[3]);
			//6.��ת����Ľ����װ��Student����,��Student��ӵ�TreeSet������
			ts.add(new Student(arr[0],chinese,math,english));
			} catch(Exception e) {
				System.out.println("��ʽ����,��ȷ�ĸ�ʽ��:����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�");
			}
			
		}
		//7.����TreeSet���ϴ�ӡÿһ��Student����(�õ���������)
		System.out.println("������ѧ����Ϣ:");
		Iterator<Student> it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}

}
