/*
方法:两个整数求和的方法
	1.整数的和还是整数
	2.有两个未知内容参与运算
如何写方法
	1.明确返回值类型      int
	2.明确参数列表         有两个int数
*/
public class Test1_Method {
	public static void main(String[] args) {
		int x = add (10,50);		//(推荐的)调用方法;add是调用的方法10,50两个实际参数
		//add(10,50);	有返回值的单独调用,没有意义
		//System.out.println(add(10,50));	这样调用是可以的,but如果需要用这个结果,不推荐这样调用
			System.out.println(x);
	}

	public static int add (int a,int b){            //public static 是两个修饰符;int返回类型是int类型的数;add方法名(符合命名规则即可);int a,int b是两个形式参数用于接受实际参数
		int sum = a + b;
		return sum;		//如果有返回值,必须用return带回
	}
}