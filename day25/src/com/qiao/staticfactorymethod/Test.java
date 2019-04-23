package com.qiao.staticfactorymethod;

public class Test {

	/**
	 * @param args
	 * A:简单工厂模式概述
	 * 		又叫静态工厂方法模式,他定义一个具体的工厂类负责创建一些类的实例
	 * B:优点
	 * 		客户端不需要在负责对象的创建,从而明确了个各类职责
	 * C:缺点
	 * 		这个静态工厂类负责所有对象的创建,如果有新的对象增加,或者某些对象的创建方式不同,就需要不断的修改工厂类,不利于后期维护
	 */
	public static void main(String[] args) {
		//Dog d = AnimalFactory.CreateDog();
		
		Dog d = (Dog) AnimalFactory.createAnimal("dog");
		d.eat();
		
		Cat c = (Cat) AnimalFactory.createAnimal("cat");
		c.eat();
	}

}
