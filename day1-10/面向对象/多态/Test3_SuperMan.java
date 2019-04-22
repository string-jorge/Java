class Test3_SuperMan {
	public static void main(String[] args) {
		Person p = new SuperMan();					//父类引用指向子类对象(向上转型),超人化为普通人
		p.talk();
		//p.fly();									//错误,父类没有fly方法

		SuperMan sm = (SuperMan)p;					//向下转型
		sm.fly();
	}
}

class Person {
	String name = "Jenny";
	public void talk() {
		System.out.println("谈生意");
	}
}

class SuperMan extends Person {
	String name = "SuperMan";
	public void talk() {
		System.out.println("谈几毛钱的生意");
	}

	public void fly() {
		System.out.println("飞出去救人");
	}
}