class Test6_Demo 
{
	public static void main(String[] args) 
	{
		A a = new B();
		a.show();

		B b = new C();
		b.show();
	}
}

class A
{
	public void show() {
		show2();
	}

	public void show2() {
		System.out.println("��");
	}
}

class B extends A
{
	public void show2() {
		System.out.println("��");
	}
}

class C extends B
{
	public void show() {
		super.show();
	}

	public void show2() {
		System.out.println("��");
	}
}
