package com.qiao.factorymethod;

public class Test {

	/**
	 * @param args
	 * A:工厂方法模式概述
	 * 		工厂方法模式中抽象工厂类负责创建对象的接口,具体对象的创建工作由实现抽象工厂的具体类来实现
	 * B:优点
	 * 		客户端不需要在负责对象的创建,从而明确了个各类的职责,如果有新的对象增加,只需要增加一个具体的类和具体的工厂类即可,不影响已有的代码,后期维护容易,增强了系统的扩展性
	 * C:缺点
	 * 		需要额外的编写代码,增加了工作量
	 */
	public static void main(String[] args) {
		DogFactory df = new DogFactory();
		Dog d = (Dog) df.createAnimal();
		d.eat();
		
		CatFactory cf = new CatFactory();
		Cat c = (Cat) cf.createAnimal();
		c.eat();
	}

}
