class Test1_Car {
	public static void main (String[] args) {
		/*
		Car c1 = new Car();			//���������ֵĶ���
		c1.run();
		c1.run();

		new Car().run();			//����������÷���
		new Car().run();			//��������ֻ�ʺ϶Է�����һ�ε���,��Ϊ���ö�ξͻ�����������,�����������ֶ���
		*/

		//���������Ƿ���Ե������Բ���ֵ?��ʲô����?
		/*
		����������Ե�������,����û������,��Ϊ�������ͱ������
		�����Ҫ��ֵ�����������ֵĶ���
		*/
		new Car().color = "red";
		new Car().num = 4;
		new Car().run();			//����Ϊnull,0
	}
}

class Car {
	String color;			//��ɫ
	int num;				//��̥��

	public void run () {
		System.out.println(color + "   " + num);
	}	
}