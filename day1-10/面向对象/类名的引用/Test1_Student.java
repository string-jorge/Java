class Test1_Student {
	public static void main(String[] args) {
		print(10);				//给int x的是值

		Student s = new Student();		//创建对象,并将对象的地址值复制给s
		print(s);				//给Student s的是地址值
	}

	public static void print(int x) {			//基本数据类型当作形式参数
		System.out.println(x);
	}

	public static void print (Student s) {		//引用数据类型当作形式参数
		s.name = "张三";
		s.age = 23;
		s.speak();
	}
}
class Student {
	String name;				//姓名
	int age;					//年龄

	public void speak() {
		System.out.println(name + "   " + age);
	}
}