/*
多态前期
	1.要有继承关系
	2.要有方法重写
	3.要有父类引用指向子类对象
*/
class Test1_Polymorphic {						//Polymorphic是多态的意思
	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();

		Animal a = new Cat();					//父类引用指向子类对象
		a.eat();
	}
}

class Animal{
	public void eat() {
		System.out.println("动物吃饭");
	}
}

class Cat extends Animal {						//继承关系
	public void eat() {							//方法重写
		System.out.println("猫吃鱼");
	}
}
