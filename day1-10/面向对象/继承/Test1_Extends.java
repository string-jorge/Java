class Test1_Extends{
	public static void main(String[] args) 
	{
		Cat c = new Cat();
		c.color = "黑";
		c.leg = 4;
		c.eat();
		c.sleep();

		System.out.println(c.color + "   " + c.leg);
	}
}

//动物类(父类)
class Animal {
	String color;								//动物的颜色
	int leg;									//动物腿的个数

	public void eat() {							//吃饭的功能
		System.out.println("吃饭");
	}

	public void sleep() {
		System.out.println("睡觉");				//睡觉的功能
	}
}

//猫类(子类)
class Cat extends Animal{
	/*String color;								//动物的颜色
	int leg;									//动物腿的个数

	public void eat() {							//吃饭的功能
		System.out.println("吃饭");
	}

	public void sleep() {
		System.out.println("睡觉");				//睡觉的功能
	}*/
}

//狗类(子类)
class Dog extends Animal {
	/*String color;								//动物的颜色
	int leg;									//动物腿的个数

	public void eat() {							//吃饭的功能
		System.out.println("吃饭");
	}

	public void sleep() {
		System.out.println("睡觉");				//睡觉的功能
	}*/
}