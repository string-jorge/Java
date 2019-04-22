class Test2_Abstract 
{
	public static void main(String[] args) 
	{
		
	}
}

/*
1.抽象类的成员特点
	a.成员变量:既可以是常量,也可以是变量;abstract不可以修饰成员变量
	b.有构造方法,用于子类访问父类数据的初始化
	c.成员方法:既可以是首相的也可以是非抽象的
2.抽象类成员方法的特征:
	a.抽象方法:强制要求子类做的事情
	b.非抽象方法:子类继承的事情,提高代码的复用性
*/

abstract class Demo
{
	int num1 = 10;								//变量
	public static final int num2 = 20;			//常量

	public Demo() {}							//构造方法

	public void print() {						//非抽象方法(子类继承的事情)
		System.out.println("print方法");
	}

	public abstract void method();				//抽象方法(强制要求子类做的事情)
}

class Test extends Demo
{
	public void method(){						//重写父类抽象方法(父类要求做的事)
		System.out.println("method方法");
	}
}