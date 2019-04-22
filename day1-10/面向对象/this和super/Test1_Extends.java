class Test1_Extends
{
	public static void main(String[] args) 
	{
		Son s = new Son();
		s.print();
	}
}

class Father {
	int num1 = 10;
	int num2 = 30;
}

class Son extends Father {
	int num2 = 20;

	public void print() {
	System.out.println(this.num1);					//10,this即可以调用子类的的也可以调用父类的(本类没有的情况下)/继承下来调用的
	System.out.println(this.num2);					//20,就近原则,子类有就不用父类的了
	System.out.println(super.num2);					//30
	}
}