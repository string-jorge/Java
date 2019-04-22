class Test3_Final 
{
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.print();
	}
}
/*
final修饰变量的初始化时机
	显示初始化
	在对象构造完毕前即可
*/

class Test {
	final int NUM;						//成员变量的默认初始化值是无效的

	public Test() {
		NUM = 10;
	}

	public void print() {
		System.out.println(NUM);
	}
}