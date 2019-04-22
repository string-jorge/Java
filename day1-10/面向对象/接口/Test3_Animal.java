class Test3_Animal {
	public static void main(String[] args) {
		Cat c = new Cat("Cat大人",7);
		System.out.println("姓名:" + c.getName());
		System.out.println("年龄:" + c.getAge());
		c.eat();
		c.sleep();

		JumpCat jc = new JumpCat("跳高猫",7);
		System.out.println("姓名:" + jc.getName());
		System.out.println("年龄:" + jc.getAge());
		jc.eat();
		jc.sleep();
		jc.jump();
		
	}
}
//动物类
abstract class Animal
{
	private String name;						//姓名
	private int age;							//年龄

	public Animal() {}							//空参构造

	public Animal(String name,int age) {		//有参构造
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {			//设置姓名
		this.name = name;
	}

	public String getName() {					//获取姓名
		return name;
	}

	public void setAge(int age) {				//设置年龄
		this.age = age;	
	}

	public int getAge() {						//获取年龄
		return age;
	}

	public abstract void eat();					//吃饭

	public abstract void sleep();				//睡觉
}
//跳高接口
interface Jumping
{
	public abstract void jump();				//跳过
}
//猫类
class Cat extends Animal
{
	public Cat() {}								//空参构造

	public Cat(String name,int age) {			//有参构造
		super(name,age);
	}

	public void eat() {							//猫吃饭
		System.out.println("猫吃鱼");
	}

	public void sleep() {						//猫睡觉
		System.out.println("躺着睡");
	}
}
//跳高猫
class JumpCat extends Cat implements Jumping
{
	public JumpCat() {}							//空参构造

	public JumpCat(String name,int age) {		//有参构造
		super(name,age);
	}

	public void jump() {						//跳高
		System.out.println("猫跳高");
	}
}