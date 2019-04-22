class Test8_Extends {
	public static void main(String[] args) {
		Son s = new Son();
		s.print();
		s.method();
	}
}
class Father {
	public void print() {
		System.out.println("Father print");
	}
}
class Son extends Father{
	public void method() {						//重写
		System.out.println("Son method");
	}
	public void print() {
		super.print();							//super可以调用父类成员方法
		System.out.println("Son print");
	}
}