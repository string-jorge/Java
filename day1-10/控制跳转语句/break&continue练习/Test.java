/*
Ҫ��:
	1.�ڿ���̨���2��:HelloWorld
	2.�ڿ���̨���7��:HelloWorld
	3.�ڿ���̨���13��:HelloWorld
*/
class Test {
	public static void main(String[] args) {
		for(int x = 1;x <= 10;x++) {
			if(x % 3 == 0) {
				//�ڴ˴�д����
				//break;            //���2��:HelloWorld
				//continue;          //���7��:HelloWorld
				System.out.println("HelloWorld");     //���13��:HelloWorld
			}
			System.out.println("HelloWorld");
		}
	}
}