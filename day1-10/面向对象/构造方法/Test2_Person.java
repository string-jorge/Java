class Test2_Person {
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		p1.show();

		Person p2 = new Person("张三",20);
		p2.show();

		Person p3 = new Person("李四",21);
		p3.show();
	}
}

class Person {
	private String name;					//姓名
	private int age;						//年龄

	public Person() {						//空参构造
		System.out.println("空参的构造");
	}

	public Person(String name,int age) {	//有参构造
		this.name = name;
		this.age = age;
		System.out.println("有参的构造");
	}

	public void show() {
		System.out.println(name + "   " + age);
	}
}