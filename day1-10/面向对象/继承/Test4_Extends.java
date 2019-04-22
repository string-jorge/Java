class Test4_Extends
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
	System.out.println(num1);					//10
	System.out.println(num2);					//就近原则
	}
}
