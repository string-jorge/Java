import java.util.Scanner;
public class Test2_Scanner {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("�������һ������:");
	int x = sc.nextInt();
	System.out.println("�������һ������:");
	int y = sc.nextInt();
	int max = (x>y) ? x:y;
	System.out.println("max = " + max);
	}
}