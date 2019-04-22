class Test10_Person {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("张三");
		s1.setAge(20);
		System.out.println(s1.getName() + "   " + s1.getAge());
		s1.eat();
		s1.study();

		Student s2 = new Student("李四",21);
		System.out.println(s2.getName() + "   " + s2.getAge());
		s2.eat();
		s2.study();
	}
}

class Person {
	private String name;
	private int age;

	public Person () {}									//空参构造

	public Person (String name,int age) {				//有参构造
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {					//设置姓名
		this.name = name;
	}

	public String getName() {							//获取姓名
		return name;
	}

	public void setAge(int age) {						//设置年龄
		this.age = age;
	}

	public int getAge() {								//获取年龄
		return age;
	}

	public void eat() {									//吃饭的方法
		System.out.println(name + "吃饭");
	}
}

class Student extends Person {
	public Student () {}								//空参构造

	public Student (String name,int age) {				//有参构造
		super(name,age);
	}

	public void study() {								//学习方法
		System.out.println(this.getName() + "学习");	//this继承下来使用
	}
}

class Teacher extends Person {
	public Teacher () {}								//空参构造

	public Teacher (String name,int age) {				//有参构造
		super(name,age);
	}

	public void teach () {
		System.out.println(super.getName() + "讲课");	//super直接调用父类的
	}
}