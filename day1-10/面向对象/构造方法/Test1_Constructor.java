class Test1_Constructor {
	public static void main(String[] args) {
		Person p = new Person();			//在一创建对象的时候系统就帮我们调用了构造方法
		//p.Person();						//构造方法不能用对象调用
		p.show();

		Person p2 = new Person();
		p2.show();
	}
}
class Person {
	private String name;
	private int age;

	//构造方法
	public Person () {
		//System.out.println("Hello World!");
		//return;								//构造方法也是有return语句的,格式是return;
		name = "张三";
		age = 20;
	}

	public void show() {
		System.out.println(name + "   " + age);
	}
}