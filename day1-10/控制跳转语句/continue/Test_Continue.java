/*
continue��ʹ�ó���:
	ֻ����ѭ����ʹ��
*/
class Test_Continue {
	public static void main(String[] args) {
		for (int x = 1;x <= 10;x++){
			if (x == 5) {
				continue;                            //��ֹ����ѭ��,�����´�ѭ��
			}
			System.out.println("x = " + x);
		}
	}
}