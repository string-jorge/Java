package com.qiao.adapter;

public class Test1_Adapter {

	/**
	 * @param args
	 * Adapter:���������ģʽ
	 */
	public static void main(String[] args) {
		
	}

}

interface Hobby {
	public void music();
	public void art();
	public void sport();
	public void other();
}

abstract class HobbyAdapter implements Hobby {
	@Override
	public void music() {}
	@Override
	public void art() {}
	@Override
	public void sport() {}
	@Override
	public void other() {}
}

class BeiDuofen extends HobbyAdapter {
	@Override
	public void music() {
		System.out.println("��һ������");
		System.out.println("�ڶ�������");
		System.out.println("����������");
		System.out.println("......");
	}
}

class YaoMing extends HobbyAdapter {
	@Override
	public void sport() {
		System.out.println("������");
	}
}