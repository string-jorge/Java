class Test1_Extends{
	public static void main(String[] args) 
	{
		Cat c = new Cat();
		c.color = "��";
		c.leg = 4;
		c.eat();
		c.sleep();

		System.out.println(c.color + "   " + c.leg);
	}
}

//������(����)
class Animal {
	String color;								//�������ɫ
	int leg;									//�����ȵĸ���

	public void eat() {							//�Է��Ĺ���
		System.out.println("�Է�");
	}

	public void sleep() {
		System.out.println("˯��");				//˯���Ĺ���
	}
}

//è��(����)
class Cat extends Animal{
	/*String color;								//�������ɫ
	int leg;									//�����ȵĸ���

	public void eat() {							//�Է��Ĺ���
		System.out.println("�Է�");
	}

	public void sleep() {
		System.out.println("˯��");				//˯���Ĺ���
	}*/
}

//����(����)
class Dog extends Animal {
	/*String color;								//�������ɫ
	int leg;									//�����ȵĸ���

	public void eat() {							//�Է��Ĺ���
		System.out.println("�Է�");
	}

	public void sleep() {
		System.out.println("˯��");				//˯���Ĺ���
	}*/
}