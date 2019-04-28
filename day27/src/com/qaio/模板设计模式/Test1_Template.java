package com.qaio.模板设计模式;

public class Test1_Template {

	/**
	 * @param args
	 * 模板设计模式
	 * 		A:优点
	 * 			使用模板方法模式,在定义算法骨架的同时,可以很灵活的实现具体的算法,满足用户灵活多变的需求
	 * 		B:缺点
	 * 			如果算法骨架有修改的话,则需要修改抽象类	
	 */
	public static void main(String[] args) {
		/*long start = System.currentTimeMillis();			//获取当前时间毫秒值
		for (int i = 0; i < 1000000; i++) {
			System.out.println("x");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);*/
		Demo d = new Demo();
		System.out.println(d.getTime());
	}

}

abstract class GetTime {
	public final long getTime() {
		long start = System.currentTimeMillis();			//获取当前时间毫秒值
		code();
		long end = System.currentTimeMillis();
		return end - start;
	}

	public abstract void code();
}

class Demo extends GetTime {

	@Override
	public void code() {
		int i = 0;
		while(i < 100000) {
			System.out.println("x");
			i++;
		}
	}
	
}