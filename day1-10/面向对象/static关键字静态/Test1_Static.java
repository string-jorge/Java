class Test1_Static 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person();				//创建对象
		p1.name = "苍老师";						//调用姓名属性并赋值
		p1.country = "日本";					//调用国籍属性并赋值

		Person p2 = new Person();				//创建对象
		p2.name = "小泽老师";					//调用姓名属性并赋值
		//p2.country = "日本";					//调用国籍属性并赋值

		p1.speak();
		p2.speak();

		/*
		推荐的调用
		Person.country = "日本";				//静态多了一种调用方法,可以通过(类名.属性名)调用
		System.out.println(Person.country);
		*/
	}
}

class Person
{
	String name;								//姓名
	static String	country;							//国籍

	public void speak() {
		System.out.println(name + "   " + country);
	}
}