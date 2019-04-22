package com.qiao.chario;

public class Test6_Wrap {

	/**
	 * 装饰设计模式
	 * 好处:耦合性不强,被装饰的类的变化与装饰类的变化无关
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
	//1.获取被装饰类的引用
	private Student s;
	
	//2.在构造方法中传入被装饰类的对象
	public QiaoCoder(Student s) {
		this.s = s;
	}

	//3.对原有的功能进行升级
	@Override
	public void Coder() {
		s.Coder();
		System.out.println("数据库");
		System.out.println("ssh");
		System.out.println("安卓");
		System.out.println("......");
	}
}