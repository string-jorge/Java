import java.util.Scanner;
public class Test4_If {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个整数:");
		int x = sc.nextInt();
		int y = 0;
		if(x >= 3) {
			y = 2 * x + 1;
		} else if (x > -1 && x < 3) {
			y = 2 * x;
		} else if (x <= -1) {
			y = 2 * x - 1;
		}
		System.out.println( y );
	}
}