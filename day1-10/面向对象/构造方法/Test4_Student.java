class  Test4_Student
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();					//空参构造
		s1.setName("张三");							//设置姓名
		s1.setAge(20);								//设置年龄

		System.out.println("我叫" + s1.getName() + "," + "我" + s1.getAge() + "岁了.");
		//getXxx()获取属性值,可以打印,也可以赋值给其他变量,做其他操作
		Student s2 = new Student("李四",21);		//有参构造
		s2.show();									//只是为了显示属性值
	}
}

class Student
{
	private String name;							//姓名
	private int age;								//年龄

	public Student() {}								//空参构造

	public Student(String name,int age) {			//有参构造
		this.name = name;
		this.age = age;
	}

	public void setName (String name) {				//设置姓名
		this.name = name;
	}

	public String getName() {						//获取姓名
		return name;
	}

	public void setAge(int age) {					//设置年龄
		this.age = age;
	}

	public int getAge() {							//获取年龄
		return age;
	}

	public void show() {							//输出姓名和年龄
		System.out.println("我叫" + name + "," + "我" + age + "岁了.");
	}
}