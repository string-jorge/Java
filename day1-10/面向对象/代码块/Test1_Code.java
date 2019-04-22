class Test1_Code {
	public static void main(String[] args) {
		//1.局部代码块.在方法中出现,限定变量的的声明期
		{
			int x = 10;
			System.out.println(x);
		}

		Student s1 = new Student();

		Student s2 = new Student("张三",20);
	}

	static{
		System.out.println("主方法类中的静态代码块");
	}
}

class Student {
	private String name;						//姓名
	private int age;							//年龄

	public Student() {							//空参构造
		//study();
		System.out.println("空参构造");
	}

	public Student(String name,int age){		//有参构造
		//study();
		this.name = name;
		this.age = age;
		System.out.println("有参构造");
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
	//2.构造代码块.在类中方法外出现,每创建一次对象就会执行一次,优先于构造方法执行
	{
		System.out.println("构造代码块");
		study();
	}

	public void study() {
		System.out.println("学生学习");
	}
	//3.静态代码块.在类中方法外出现,随着类的加载而加载,且执行一次;作用:用来给类进行初始化,一般用来加载驱动;静态代码块是优先于主方法执行的
	static {
		System.out.println("静态代码块");
	}
}