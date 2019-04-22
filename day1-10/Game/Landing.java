import java.util.Scanner;
public class Landing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int x = 1;x <= 3;x++){
			System.out.println("请输入用户名:");
			String userName = sc.nextLine();
			System.out.println("请输入密码:");
			String passWord = sc.nextLine();

			if("admin".equals(userName) && "admin".equals(passWord)) {
				System.out.println("HelloWorld");
				break;
			}else{
				if(x == 3) {
					System.out.println("您输入的次数过多,明天下来吧!");
				}else{
					System.out.println("您输入的用户名或密码有误!" + "您还有" + (3-x) + "次机会");
				}
			}
		}
	}
}