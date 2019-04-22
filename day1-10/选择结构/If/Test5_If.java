import java.util.Scanner;
public class Test5_If {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("请输入第一个数:");
	int a = sc.nextInt();
	System.out.print("请输入第二个数:");
	int b = sc.nextInt();
	System.out.print("请输入第三个数:");
	int c = sc.nextInt();
		if (a > b) {
			if (a > c) {
			System.out.print(a + "是最大值");
			} else { 
			System.out.print(c + "是最大值");
			}
		} else {
			if (b > c) {
				System.out.print(b + "是最大值");
			} else {
				System.out.print(c + "是最大值");
			}
		}

	}
}