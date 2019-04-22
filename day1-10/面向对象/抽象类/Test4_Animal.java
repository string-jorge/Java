class Test4_Animal 
{
	public static void main(String[] args) 
	{
		Cat c = new Cat("cat����",7);
		System.out.println(c.getName() + "\n" + c.getAge());
		c.eat();
		c.catchMouse();

		Dog d = new Dog("����Ȯ",7);
		System.out.println(d.getName() + "\n" + d.getAge());
		d.eat();
		d.lookHome();
	}
}

abstract class Animal
{
	private String name;
	private int age;

	public Animal() {}								//�ղι���

	public Animal(String name,int age) {			//�вι���
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {				//��������
		this.name = name;
	}

	public String getName() {				//��ȡ����
		return name;
	}

	public	void setAge(int age) {					//��������
		this.age = age;
	}

	public int getAge() {							//��ȡ����
		return age;
	}

	public abstract void eat();						//���󷽷�
}

class Cat extends Animal
{
	public Cat() {}									//�ղι���

	public Cat(String name,int age) {				//�вι���
		super(name,age);
	}

	public void eat() {
		System.out.println("è����");
	}

	public void catchMouse() {
		System.out.println("ץ����");
	}
}

class Dog extends Animal
{
	public Dog() {}									//�ղι���

	public Dog(String name,int age) {				//�вι���
		super(name,age);
	}

	public void eat() {
		System.out.println("������");
	}

	public void lookHome() {
		System.out.println("����");
	}
}
