/*
�Ƚ����������Ƿ����,����main�����н��в���
	1.int����
	2.double����
*/
class Test7_Overload {
	public static void main (String[] args) {
		boolean b1 = isEquals(10,10);
		System.out.println(b1);

		boolean b2 = isEquals(10.5,10.5);
		System.out.println(b2);

	}

	public static boolean isEquals (int x,int y) {
		return x == y;
	}

	public static boolean isEquals (double x,double y) {
		return x == y;
	}

}