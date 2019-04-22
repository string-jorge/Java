class Student
{
	static {
		System.out.println("Student 静态代码块");
	}

	{
		System.out.println("Student 构造代码块");
	}

	public Student() {
		System.out.println("Student 构造方法");
	}
}

class Test2_Student {

	static {
		System.out.println("Test2_Student 静态代码块");
	}

	public static void main(String[] args) 
	{
		System.out.println("main主方法");

		Student s1 = new Student();
		Student s2 = new Student();
	}
}

/*
运行结果:
Test2_Student 静态代码块
main主方法
Student 静态代码块
Student 构造代码块
Student 构造方法
Student 构造代码块
Student 构造方法
*/