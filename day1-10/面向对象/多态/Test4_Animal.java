class Test4_Animal {
	public static void main(String[] args) {
		//Cat c1 = new Cat();
		//c1.eat();
		method(new Cat());
		method(new Dog());

		//Animal a = new Cat();						//开发很少在创建对象的时候用父类引用指向子类对象,直接创建子类对象更方便,可以直接使用子类特有的属性和行为
	}
/*  //Cat c = new Dog();猫是一只狗,这是错误的
	public static void method(Cat c) {
		c.eat();
	}

	public static void method(Dog d) {
		d.eat();
	}
*/
	//如果把狗强转成猫就会出现类型转换异常,ClassCastException
	public static void method(Animal a) {			//当作参数的时候用多态最好,因为扩展性强
		/*Cat c = (Cat) a;
		c.eat();
		c.catchMouse();*/
		//关键字instanceof判断前边的引用是否是后边的数据类型
		if(a instanceof Cat) {
			Cat c = (Cat)a;
			c.eat();
			c.catchMouse();
		}else if(a instanceof Dog) {
			Dog d = (Dog)a;
			d.eat();
			d.lookHome();
		}else {
			a.eat();
		}
	}
}

class Animal {
	public void eat() {
		System.out.println("动物吃饭");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("猫吃鱼");
	}

	public void catchMouse() {
		System.out.println("抓老鼠");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("狗吃骨头");
	}

	public void lookHome() {
		System.out.println("看家");
	}
}