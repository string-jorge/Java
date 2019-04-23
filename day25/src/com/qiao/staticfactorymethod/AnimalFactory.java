package com.qiao.staticfactorymethod;

public class AnimalFactory {
	
	/*public static Dog CreateDog() {
		return new Dog();
	}
	
	public static Cat CreateCat() {
		return new Cat();
	}*/
	//发现方法会定义很多,复用性太差
	
	//改进
	public static Animal createAnimal(String name) {
		if("dog".equals(name)) {
			return new Dog();
		} else if("cat".equals(name)) {
			return new Cat();
		} else {
			return null;
		}
	}

}
