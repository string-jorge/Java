import java.util.Scanner;
public class Landing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int x = 1;x <= 3;x++){
			System.out.println("�������û���:");
			String userName = sc.nextLine();
			System.out.println("����������:");
			String passWord = sc.nextLine();

			if("admin".equals(userName) && "admin".equals(passWord)) {
				System.out.println("HelloWorld");
				break;
			}else{
				if(x == 3) {
					System.out.println("������Ĵ�������,����������!");
				}else{
					System.out.println("��������û�������������!" + "������" + (3-x) + "�λ���");
				}
			}
		}
	}
}