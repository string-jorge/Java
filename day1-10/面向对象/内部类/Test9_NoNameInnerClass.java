class Test9_NoNameInnerClass 
{
	public static void main(String[] args) 
	{
		Outer.method().show();
	}
}

interface Inter
{
	public abstract void show();
}

class Outer 
{
	public static Inter method() {
		return new Inter() {
			public void show() {
				System.out.println("HelloWorld");
			}
		};
	}
}