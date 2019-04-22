import java.util.Scanner;
class Test1_Scanner {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数:");
		int x = sc.nextInt();

		System.out.println("请输入第二个整数:");
		int y = sc.nextInt();
		int sum = x + y;
		System.out.println("两个数的和为:" + sum);
	}
}