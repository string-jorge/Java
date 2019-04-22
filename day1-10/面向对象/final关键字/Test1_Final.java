class Test1_Final 
{
	public static void main(String[] args) 
	{
		Son s = new Son();
		s.print();
	}
}
/*
1.final 最终的意思
2.修饰特点
	修饰类,类不能被继承
	修饰变量,变量就变成了常量,只能被赋值一次
	修饰方法,方法不能被重写
*/
/*final class Father {
	public void print() {
		System.out.println("访问底层数据资源");
	}
}*/

class Son /*extends Father*/ {

	final int NUM = 10;					//常量的命名规范,如果是一个单词所有字母都大写,如果是多个单词,所有字母都大写,用下划线分开
	//public static final double PI = 3.14;			//final修饰变量叫常量,一般会与public static共用
	public void print() {
		System.out.println(NUM);
	}
}