import java.util.Scanner;
public class Test1_Switch {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("请输入1-7之间的整数:");
	int week = sc.nextInt();
	switch (week) {
	case 1 :
		System.out.println("星期一");
	break;
	case 2 :
		System.out.println("星期二");
	break;
	case 3 :
		System.out.println("星期三");
	break;
	case 4 :
		System.out.println("星期四");
	break;
	case 5 :
		System.out.println("星期五");
	break;
	case 6 :
		System.out.println("星期六");
	break;
	case 7 :
		System.out.println("星期日");
	break;
	default :
		System.out.println("Sorry,没有对应的星期!");
	break;
		}
	}
}