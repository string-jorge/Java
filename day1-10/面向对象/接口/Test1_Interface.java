/*
接口
	接口中的变量只能是常量public static final int num = 10；不能是变量（在抽象类中可以是常量，也可以是变量）
	接口中的成员方法只能是抽象方法（在抽象类中可以是抽象方法，也可以是非抽象方法）
*/
class Test1_Interface 
{
	public static void main(String[] args) 
	{
		//Inter i = new Inter();			//接口不能被实例化，因为调用抽象法没有意义
		Inter i = new Demo();				//父类引用指向子类对象
		i.print();

		Demo d = new Demo();
		d.printNum();
		System.out.println(Inter.num);		//Inter.num类成员变量
	}
}

interface Inter								//接口
{
	public static final int num = 10;		//接口中的变量都是常量
	public abstract void print();			//接口中的方法都是抽象的
	//public Inter() {}						//错误，接口中没有构造方法
	//public void print() {}				//错误，接口中不能定义非抽象方法
}

class Demo /*extends Object*/ implements Inter					//子类实现接口，一个类中没有继承任何类，默认会继承Object类
{
	public void print() {					//重写父类的抽象方法
		System.out.println("print方法");
	}

	public void printNum() {
		//num = 20;							//错误，int在接口中为常量，不能再赋值
		System.out.println(num);
	}

	public Demo() {
		super();							//访问父类Object的成员方法
	}
}