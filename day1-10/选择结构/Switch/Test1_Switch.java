import java.util.Scanner;
public class Test1_Switch {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("������1-7֮�������:");
	int week = sc.nextInt();
	switch (week) {
	case 1 :
		System.out.println("����һ");
	break;
	case 2 :
		System.out.println("���ڶ�");
	break;
	case 3 :
		System.out.println("������");
	break;
	case 4 :
		System.out.println("������");
	break;
	case 5 :
		System.out.println("������");
	break;
	case 6 :
		System.out.println("������");
	break;
	case 7 :
		System.out.println("������");
	break;
	default :
		System.out.println("Sorry,û�ж�Ӧ������!");
	break;
		}
	}
}