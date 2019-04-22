/*
继承的注意事项
	1.子类只能继承父类所有非私有的成员(成员方法和成员变量)
	2.子类不能继承父类的构造方法,但可以通过super关键字去访问父类构造方法
*/
class Test3_Extends 
{
	public static void main(String[] args) 
	{
		Son s = new Son();
		s.show();
	}
}

class Father {
	//private void show() {						//这样私有子类就不能继承父类的成员方法
	//private String name;						//这样私有成员变量还原创建公共的steXxx和setXxx方法(可以继承steXxx和setXxx方法)
	public void show() {
		System.out.println("Hello World!");
	}
}

class Son extends Father{}