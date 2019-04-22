/*
1.类与类
	继承关系,只能单继承,可以多层继承
2.类与接口
	实现关系,可以单实现,也可以多实现
	并且还可以在继承一个类的同时实现接口
3.接口与接口
继承关系,可以单继承,也可以多继承
*/
class Test2_Interface 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

interface InterA													//接口A
{
	public abstract void printA();
}

interface InterB													//接口B
{
	public abstract void printB();
}

interface InterC extends InterA,InterB								//接口与接口是继承,继承接口A,接口B
{
}

class Demo implements InterA,InterB									//类与接口是实现,实现接口A,接口B
{
	public void printA() {
		System.out.println("PrintA");
	}

	public void printB() {
		System.out.println("PrintB");
	}
}