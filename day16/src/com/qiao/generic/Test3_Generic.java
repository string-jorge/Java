package com.qiao.generic;

import com.qiao.bean.Student;
import com.qiao.bean.Tool;
import com.qiao.bean.Worker;

public class Test3_Generic {

	/**
	 * ���͵�����:ͨ��Objectת����������
	 * ���ڵ�Object���Ϳ��Խ�������Ķ�������,������ʵ�ʵ�ʹ����,��������ת��������.Ҳ�ʹ���������,����Java�ṩ�˷�������������ȫ����.
	 */
	public static void main(String[] args) {
		//demo1();
		Tool<String> t = new Tool<>();
		t.show(true);
		t.print("abc");
	}

	private static void demo1() {
		Tool<Student> t = new Tool<>();
		t.setObj(new Student("����",23));
		
		//Worker w = (Worker) t.getObj();//����ת��
		//System.out.println(w);
	}

}
