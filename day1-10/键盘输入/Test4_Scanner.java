import java.util.Scanner;
public class Test4_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数:");
		int x = sc.nextInt();
		System.out.println("请输入第二个整数:");
		int y = sc.nextInt();
		System.out.println("请输入第三个整数:");
		int z = sc.nextInt();
		int temp = (x > y)? x : y;
		int max = (temp > z)? temp : z;
		System.out.println("max =" + max);
	}
}