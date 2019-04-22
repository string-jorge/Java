/*
A.内部类访问特点
	1.内部类可以直接访问外部类成员,包括私有
	2.外部类要访问内部类的成员,必须创建内部类对象
*/
class Test1_InnerClass 
{
	public static void main(String[] args) 
	{
		//Inner i = new inner();										//错误
		//格式:外部类名.内部类名 对象名 = 外部类对象.内部类对象
		Outer.Inner oi = new Outer().new Inner();						//创建内部类对象
		oi.method();

		Outer o = new Outer();
		System.out.println(o.getY());
	}
}
class Outer
{
	private int x = 20;													//外部类成员变量

	class Inner {
		private int y = 10;												//内部类成员变量

		public void method() {
			System.out.println(x);
		}
	}

	public int getY() {													//获取内部类成员Y
		return new Inner().y;
	}
}