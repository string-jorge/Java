package com.qiao.chario;

public class Test6_Wrap {

	/**
	 * װ�����ģʽ
	 * �ô�:����Բ�ǿ,��װ�ε���ı仯��װ����ı仯�޹�
	 */
	public static void main(String[] args) {
		QiaoCoder qc = new QiaoCoder(new Student());
		qc.Coder();
	}

}

interface Coder {
	public void Coder();
}

class Student implements Coder {

	@Override
	public void Coder() {
		System.out.println("JaveSE");
		System.out.println("JavaWeb");
	}
}

class QiaoCoder implements Coder {
	//1.��ȡ��װ���������
	private Student s;
	
	//2.�ڹ��췽���д��뱻װ����Ķ���
	public QiaoCoder(Student s) {
		this.s = s;
	}

	//3.��ԭ�еĹ��ܽ�������
	@Override
	public void Coder() {
		s.Coder();
		System.out.println("���ݿ�");
		System.out.println("ssh");
		System.out.println("��׿");
		System.out.println("......");
	}
}