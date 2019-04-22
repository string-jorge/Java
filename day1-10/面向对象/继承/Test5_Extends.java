/*
继承中构造方法的关系
	1.子类中的构造方法默认都会访问父类中的空参的构造方法
	2.子类会继父类中的数据,可能还会使用父类中的数据
	3.子类初始化前,一定要先完成父类数据的初始化
	4.一个构造方法的第一条语句默认都是:super()
	5.Object类是最顶层的类
*/
class Test5_Extends 
{
	public static void main(String[] args) 
	{
		Son s = new Son();
	}
}

class Father extends Object
{
	public Father() {
		super();
		System.out.println("Father 的构造方法");
	}
}

class Son extends Father
{
	public Son() {
		super();									//这是一条语句,如果不写,系统会默认加上,用来访问父类中的空参构造
		System.out.println("Son 的构造方法");
	}
}
