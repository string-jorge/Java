class Test2_Person {
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		p1.show();

		Person p2 = new Person("����",20);
		p2.show();

		Person p3 = new Person("����",21);
		p3.show();
	}
}

class Person {
	private String name;					//����
	private int age;						//����

	public Person() {						//�ղι���
		System.out.println("�ղεĹ���");
	}

	public Person(String name,int age) {	//�вι���
		this.name = name;
		this.age = age;
		System.out.println("�вεĹ���");
	}

	public void show() {
		System.out.println(name + "   " + age);
	}
}