/*成员访问特
	成员变量
	成员方法
	静态方法(类方法)
*/
class Test2_Polymorphic {
	public static void main(String[] args) {
		Father f = new Son();					//父类引用指向子类对象
		System.out.println(f.num);				//成员变量
		f.print();								//成员方法
		f.method();	//相当于Father.method();	//静态方法(类方法)

		Son s = new Son();
		System.out.println(s.num);
	}
}
/*
成员变量
	编译看左边(父类),运行也看左边(父类)
成员方法
	编译看左边(父类),运行看右边(子类),也叫动态绑定
静态方法
	编译看左边(父类),运行也看左边(父类)
	(静态和类相关,算不上重写,所以访问还是左边的)
只有非静态的成员方法,编译看左边,运行看右边
*/
class Father {
	int num = 10;

	public void print() {
		System.out.println("Father方法");
	}

	public static void method() {
		System.out.println("Father静态方法");
	}
}

class Son extends Father {
	int num = 20;

	public void print() {
		System.out.println("Son方法");
	}

	public static void method() {
		System.out.println("Son静态方法");
	}
}
