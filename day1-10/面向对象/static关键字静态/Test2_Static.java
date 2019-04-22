class  Test2_Static
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();					//创建对象
		d.print1();								//非静态访问

		Demo.print2();							//静态访问(类名.静态成员方法名)
	}
}

class Demo
{
	int num1 = 10;								//非静态的成员变量
	static int num2 = 20;						//静态的成员变量

	public void print1() {						//非静态的成员方法,即可以访问静态的成员变量也可以访问非静态的成员变量
		System.out.println(num1);
		System.out.println(num2);
	}

	public static void print2() {				//静态的成员方法
		//System.out.println(this.num1);		//不能访问非静态的成员,错误: 无法从静态上下文中引用非静态变量num1;不能有this.,this是有对象才有值
		System.out.println(num2);
	}
}
