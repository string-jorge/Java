/*
输出方法及其调用
	根据键盘录入的行数和列数,在控制台输出星形
调用方法
	单独调用
	输出调用(错误)
	赋值调用(错误)
*/
import java.util.Scanner;
class Test4_Method {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);		//创建从键盘录入对象
		System.out.print("请输入行数:");
		int row = sc.nextInt();			//键盘录入的数存到row中
		System.out.print("请输入列数:");
		int column = sc.nextInt();			//键盘录入的数存到column中
		printStar(row,column);			//单独调用
		//System.out.println(printStar(row,column));	//输出调用(错误):此处不允许使用'空'类型,返回值是void的方法不能输出调用
		//void v = printStar(row,column);		//赋值调用(错误)
	}
/*
在控制台输出矩形星形
	1.明确返回值类型,经分析没有具体返回值类型,用void代替
	2.明确参数列表int x,int y
*/
	public static void printStar(int x,int y) {
		for(int a = 1;a <= x;a++) {			//行数
			for(int b = 1;b <= y;b++) {		//列数
			System.out.print("*");
			}
		System.out.println();
		}
	return ;						//如果返回值类型是void,return可以省略,即使省略系统也会默认给加上,形式是return;
	}
}