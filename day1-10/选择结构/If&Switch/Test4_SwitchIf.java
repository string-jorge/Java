import java.util.Scanner;
public class Test4_SwitchIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������·�:");
		int month = sc.nextInt();
		switch (month) {
		case 3 :
		case 4 :
		case 5 :
			System.out.println(month + "���Ǵ���");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println(month + "�����ļ�");
			break;
		case 9 :
		case 10 :
		case 11 :
			System.out.println(month + "�����＾");
			break;
		case 12 :
		case 1 :
		case 2 :
			System.out.println(month + "���Ƕ���");
			break;
		default :
			System.out.println("�Բ���û�ж�Ӧ����!");
			break;
		}
	}
}