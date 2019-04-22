class Test1_Student {
	public static void main(String[] args) {

		//创建对象的格式:类名  对象名 = new 类名 ( );
		//对象名:就是合法的标识符,如果是一个单词,所有字母小写,如果是多个单词,从第二个单词首字母大写
		Student s = new Student ( );

		//如何使用变量名?
		//对象名.变量名
		s.name = "张三";
		s.age = 23;
		s.gender = "男";

		System.out.println(s.name + "   " + s.age + "   " + s.gender);

		//如何使用成员方法?
		//对象名.方法名(...)
		s.study();
		s.sleep();
	}
}

class Student {
	String name;		//姓名
	int age;			//年龄
	String gender;		//性别

	public void study() {			//定义学习方法
		System.out.println("学习");
	}

	public void  sleep() {			//定义睡觉方法
		System.out.println("睡觉");
	}
}