/*
break��ʹ�ó���:
	ֻ����switch��ѭ����ʹ��
*/
class Test_Break {
	public static void main(String[] args) {
		for (int x = 1;x <= 10;x++){
			if (x == 5) {
				break;                            //����ѭ��
			}
			System.out.println("x = " + x);
		}
	}
}