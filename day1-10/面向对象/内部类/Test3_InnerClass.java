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
	static class Inner2										//��̬�ڲ���
	{
		public static void print() {						//�����ľ�̬����
			System.out.println("print");
		}
	}
}