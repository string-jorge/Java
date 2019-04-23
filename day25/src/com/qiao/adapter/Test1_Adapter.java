package com.qiao.adapter;

public class Test1_Adapter {

	/**
	 * @param args
	 * Adapter:适配器设计模式
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
		System.out.println("第一交响曲");
		System.out.println("第二交响曲");
		System.out.println("第三交响曲");
		System.out.println("......");
	}
}

class YaoMing extends HobbyAdapter {
	@Override
	public void sport() {
		System.out.println("打篮球");
	}
}