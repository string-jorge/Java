import java.util.Scanner;
public class Test4_SwitchIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入月份:");
		int month = sc.nextInt();
		switch (month) {
		case 3 :
		case 4 :
		case 5 :
			System.out.println(month + "月是春季");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println(month + "月是夏季");
			break;
		case 9 :
		case 10 :
		case 11 :
			System.out.println(month + "月是秋季");
			break;
		case 12 :
		case 1 :
		case 2 :
			System.out.println(month + "月是冬季");
			break;
		default :
			System.out.println("对不起没有对应季节!");
			break;
		}
	}
}