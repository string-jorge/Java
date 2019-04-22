class Test4_InnerClass 
{
	public static void main(String[] args) 
	{
		Outer.Inner oi = new Outer().new Inner();
		oi.show();
	}
}
//要求在控制台输出30,20,10
class Outer{
	public int num = 30;
	class Inner {
		public int num = 10;
		public void show() {
			int num = 20;
			System.out.println(Outer.this.num);
			System.out.println(num);
			System.out.println(this.num);
		}
	}
}