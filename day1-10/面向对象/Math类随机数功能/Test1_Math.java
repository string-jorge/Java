class Test1_Math 
{
	public static void main(String[] args) 
	{
		//double d = Math.random();
		//System.out.println(d);

		//Math.random()�����ɴ��ڵ���0.0����С��1.0��α�����
		for(int i = 0;i < 10;i++) {
			System.out.println(Math.random());
		}

		//����1-100�������
		//Math.random();0.000000000 �� 0.999999999
		//Math.random() * 100;0.0000000 ��99.9999999
		//(int)(Math.random() * 100);0 �� 99			//��double������ǿתΪint������
		//(int)(Math.random() * 100) + 1;1 �� 100

		for(int i = 0;i < 10;i++) {
			System.out.println((int)(Math.random() * 100) + 1);
		}
	}
}
