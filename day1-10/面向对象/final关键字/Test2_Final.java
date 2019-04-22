class Test2_Final {
	public static void main(String[] args) {
		final int NUM = 10;
		//NUM = 20;								//错误
		System.out.println(NUM);

		final Person p = new Person("张三",20);
		//p = new Person("李四",21);			//错误
		p.setName("李四");
		p.setAge(21);
		System.out.println(p.getName() + "   " + p.getAge());

		method(10);
		method(20);
	}

	public static void method(final int X){		//方法声明上用final修饰
		System.out.println(X);
	}
}
/*
修饰基本类型,是值不能被改变
修饰引用类型,是地址值不能被改变,对象中的属性可以改变
*/
class Person {
	private String name;
	private int age;

	public Person() {}						//空参构造

	public Person(String name,int age) {	//有参构造
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {		//设置姓名
		this.name = name;
	}

	public String getName() {				//获取姓名
		return name;
	}

	public void setAge(int age) {			//设置年龄
		this.age = age;
	}

	public int getAge() {					//获取年龄
		return age;
	}
}
