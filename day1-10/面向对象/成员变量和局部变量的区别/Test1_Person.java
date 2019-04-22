class Test1_Person {
	public static void main(String[] args) {
		Person p = new Person();
		p.speak();
	}
}
class Person {
	String name;			//成员变量,初始化值默认为null(在类中方法外)

	public void speak() {
		int sum = 1;		//局部变量,使用前要初始化赋值(在方法定义中或方法声明上)
		System.out.println(name);
		System.out.println(sum);
	}
}