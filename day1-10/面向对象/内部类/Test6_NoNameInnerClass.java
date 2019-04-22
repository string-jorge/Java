//匿名内部类(局部内部类的一种)
class Test6_NoNameInnerClass 
{
	public static void main(String[] args) 
	{
		Outer o = new Outer();
		o.method();
	}
}

interface Inter
{
	public abstract void print();					//接口中的抽象方法,可以省略public abstract
}

class Outer											//外部类
{
	class  Inner implements Inter					//内部类实现了Inter接口
	{
		public void print() {						//重写接口中的抽象方法
			System.out.println("print");
		}
	}
	public void method() {							//访问外部类中的方法
		//Inner i = new Inner();					//先要创建内部类子类对象
		//i.print();
		//new Inner.print();

//匿名内部类相当于接口的子类对象
		new Inter() {
			public void print() {					//重写接口中的抽象方法
				System.out.println("print");
			}
		}.print();
	}
}