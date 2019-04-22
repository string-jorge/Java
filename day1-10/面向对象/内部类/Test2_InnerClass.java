class Test2_InnerClass 
{
	public static void main(String[] args) 
	{
		//Outer.Inner oi = new Outer().new Inner();						//class Inner 被私有了,这样不能访问了
		Outer o = new Outer();
		o.print();
	}
}
class Outer
{
	private int num = 10;
	private class Inner													//内部类私有
	{
		public void method() {
			System.out.print(num);
		}
	}
	public void print() {
		Inner i = new Inner();											//创建内部类对象
		i.method();														//访问内部类method方法
	}
}
