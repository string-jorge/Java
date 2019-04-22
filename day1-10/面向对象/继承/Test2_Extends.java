/*
Java种类的特点
	(1)Java只支持单继承,不支持多继承
		有些语言是支持多继承的,格式:extends类1,类2,...
	(2)Java支持多层继承(继承体系)
	(3)如果想用这个体系的所有功能,用最底层的类创建对象
	(4)如果想用这个体系的共有功能,用最顶层的类
*/
class Test2_Extends 
{
	public static void main(String[] args) {
		DemoC d = new DemoC();
		d.show();
		d.method();
		d.print();
	}
}

class DemoA {
	public void show() {
		System.out.println("DemoA");
	}
}

class DemoB extends DemoA {
	public void method() {
		System.out.println("DemoB");
	}
}

class DemoC extends DemoB {
	public void print() {
		System.out.println("DemoC");
	}
}


