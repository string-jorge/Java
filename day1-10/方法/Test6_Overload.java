/*
����:��������ͬ,�����б�ͬ,�뷵��ֵ�����޹�
	���ࣺ
		1.����������ͬ
		2.�������Ͳ�ͬ
		3.˳��ͬ��int a��double b���ͣ�double a��int b��
*/
class Test6_Overload {			//overload����
	public static void main(String[] args) {
		double sum1 = add (50,60);
		System.out.println(sum1);

		int sum2 = add (50,60,70);
		System.out.println(sum2);

		double sum3 = add (12.3,13.4);
		System.out.println(sum3);
	}

	public static double add (int a,int b) {	//�������ĺͣ�int����
		return a + b;
	}

	public static int add (int a,int b,int c) {	//�������ĺ�double����
		return a + b + c;
	}

	public static double add (double a,double b) {	//�������ĺ�double����
		return a + b;
	}
}