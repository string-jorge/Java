class  Test3_Person
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("张三",20);
		//p1 = new Person("张天一",20);		//这种方式看运行结果貌似是改名了,其实是江源对象变成了垃圾
		System.out.println(p1.getName() + "   " + p1.getAge());

		Person p2 = new Person();			//空参构造创建对象
		p2.setName("李四");
		p2.setAge(21);

		//p2.setName("李逵");				//这种方法才是改名
		System.out.println(p2.getName() + "   " + p2.getAge());
	}
}
/*
构造方法
	给属性进行初始化
setXxx方法
	修改属性值
	这两种方法,在开发中用setXxx更多一些,因为比较灵活
*/
class Person
{
	private String name;					//姓名
	private int age;						//年龄

	public Person() {						//空参构造
	}

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