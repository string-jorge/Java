class Test3_InnerClass 
{
	public static void main(String[] args) 
	{
		Outer.Inner oi = new Outer.Inner();
		oi.method();

		Outer.Inner2.print();
	}
}

class Outer
{
	static class Inner
	{
		public void method() {
			System.out.println("method");
		}
	}
	static class Inner2										//静态内部类
	{
		public static void print() {						//公共的静态方法
			System.out.println("print");
		}
	}
}