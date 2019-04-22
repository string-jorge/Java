//this关键字,代表当前对象的引用,用来区分成员变量和局部变量重名
class Test2_Person {
	public static void main (String[] args) {
		Person p1 = new Person();
		p1.setName("张三");
		p1.setAge(20);
		System.out.println(p1.getName() + "   " + p1.getAge());

		Person p2 = new Person();
		p2.setName("李四");
		p2.setAge(21);
		System.out.println(p2.getName() + "   " + p2.getAge());
		
	}
}

class Person {
	private String name;				//姓名
	private int age;				//年龄,private私有的意思

	public void setAge(int age){			//设置年龄
		if (age > 0 && age < 200) {
			this.age = age;
		} else {
			System.out.println("请回火星吧,地球不适合你");
		}
	} 

	public int getAge() {				//获取年龄
		return age;
	}

	public void setName(String name){		//设置姓名
		this.name = name;
	}

	public String getName() {			//获取姓名
		return name;
	}
}