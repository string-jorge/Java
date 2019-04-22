//关键字private
class Test1_Person {
	public static void main (String[] args) {
		Person p1 = new Person();
		p1.name = "张三";			//调用姓名属性并赋值
		//p1.age = -20;			//调用年龄属性并赋值,-20不安全
		//p1.speak();			//调用方法(行为)

		p1.setAge(-20);
		
		System.out.println(p1.getAge( ) );
	}
}
class Person {
	String name;				//姓名
	private int age;				//年龄,private私有的意思

	public void setAge(int x){			//设置年龄
		if (x > 0 && x < 200) {
			age = x;
		} else {
			System.out.println("请回火星吧,地球不适合你");
		}
	} 

	public int getAge() {				//获取年龄
		return age;
	}

	public void speak(){
		System.out.println(name + "   "  + age);
	}
}