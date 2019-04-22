import java.util.Scanner;
public class Test5_SwitchIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入月份:");
		int month = sc.nextInt();
		if (month > 12 || month < 1 ) {
			System.out.println("对不起没有对应季节!");
		}else if (month >= 3 && month <= 5) {
			System.out.println(month + "月是春季");
		}else if (month >= 6 && month <= 8) {
			System.out.println(month + "月是夏季");
		}else if (month >= 9 && month <= 11) {
			System.out.println(month + "月是秋季");
		}else {
			System.out.println(month + "月是冬季");
		}
	}
}