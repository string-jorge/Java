//键盘输入两个数据,比较两个数是否相等
import java.util.Scanner;
class Test3_Method {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);	//创建键盘录入对象
		System.out.print("请输入第一个整数:");
		int x = sc.nextInt();
		System.out.print("请输入第二个整数:");
		int y = sc.nextInt();
		boolean i = isEquals(x,y);
		System.out.print(i);
	}
/*
返回两个数中的最大值
	1.明确返回值类型	boolean
	2.明确参数列表	int a,int b
*/
	public static boolean isEquals (int a,int b) {	//isEquals 是否相等
		return a == b;
	}
}