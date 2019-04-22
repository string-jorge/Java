class Test4_Animal 
{
	public static void main(String[] args) 
	{
		Cat c = new Cat("cat大人",7);
		System.out.println(c.getName() + "\n" + c.getAge());
		c.eat();
		c.catchMouse();

		Dog d = new Dog("哮天犬",7);
		System.out.println(d.getName() + "\n" + d.getAge());
		d.eat();
		d.lookHome();
	}
}

abstract class Animal
{
	private String name;
	private int age;

	public Animal() {}								//空参构造

	public Animal(String name,int age) {			//有参构造
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {				//设置姓名
		this.name = name;
	}

	public String getName() {				//获取姓名
		return name;
	}

	public	void setAge(int age) {					//设置年龄
		this.age = age;
	}

	public int getAge() {							//获取姓名
		return age;
	}

	public abstract void eat();						//抽象方法
}

class Cat extends Animal
{
	public Cat() {}									//空参构造

	public Cat(String name,int age) {				//有参构造
		super(name,age);
	}

	public void eat() {
		System.out.println("猫吃鱼");
	}

	public void catchMouse() {
		System.out.println("抓老鼠");
	}
}

class Dog extends Animal
{
	public Dog() {}									//空参构造

	public Dog(String name,int age) {				//有参构造
		super(name,age);
	}

	public void eat() {
		System.out.println("狗吃肉");
	}

	public void lookHome() {
		System.out.println("看家");
	}
}
