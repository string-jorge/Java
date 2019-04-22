class Test8_Abstract 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*
1.抽象类中可以没有抽象方法,这么就是不让其他类创建本类对象,交给子类完成
2.abstract不能和static,private,final共存
	A:abstract和static
		被abstract修饰的方法没有方法体
		被static修饰的的可以用(类名.)调用,但是(类名.)调用抽象方法是没有意义的
	B:abstract和final
		被abstract修饰的方法强制子类重写
		被final修饰的不让子类重写,所以他俩是矛盾的
	C.abstract和private
		被abstract修饰的是为了让子类看到并强制重写
		被private修饰不让子类访问,所以他俩是矛盾的
*/
abstract class Demo
{
	//public static abstract void print();		//错误: 非法的修饰符组合: abstract和static
	//public final abstract void print();		//错误: 非法的修饰符组合: abstract和final
	//private abstract void print();			//错误: 非法的修饰符组合: abstract和private
}