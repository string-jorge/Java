//键盘输入两个数据,返回两个数中的最大值
import java.util.Scanner;
class Test2_Method {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);	//创建键盘录入对象
		System.out.print("请输入第一个整数:");
		int x = sc.nextInt();
		System.out.print("请输入第二个整数:");
		int y = sc.nextInt();
		int max = getMax(x,y);	//调用方法
		System.out.println("max = " + max);
	}
/*
返回两个数中的最大值
	1.明确返回值类型	int
	2.明确参数列表	int a,int b
*/
	public static int getMax (int a,int b) {
		return a > b ? a : b;
	}
}