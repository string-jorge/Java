/*
要求:
	1.在控制台输出2次:HelloWorld
	2.在控制台输出7次:HelloWorld
	3.在控制台输出13次:HelloWorld
*/
class Test {
	public static void main(String[] args) {
		for(int x = 1;x <= 10;x++) {
			if(x % 3 == 0) {
				//在此处写代码
				//break;            //输出2次:HelloWorld
				//continue;          //输出7次:HelloWorld
				System.out.println("HelloWorld");     //输出13次:HelloWorld
			}
			System.out.println("HelloWorld");
		}
	}
}