//���������������
class Test2_Car {
	public static void main (String[] args) {
		/*
		Car c1 = new Car();
		c1.color = "red";
		c1.num = 8;
		c1.run();

		Car c2 = new Car();
		c2.color = "red";
		c2.num = 8;
		c2.run();

		Car c1 = new Car();			//���÷���
		method(c1);
		Car c2 = new Car();
		method(c2);
		*/
		method(new Car( ) );			//����������Ե�����������
		method(new Car( ) );

	}
	//��ȡ������ߴ��븴����
	public static void method(Car c) {		//Car c = new Car();
		c.color = "red";
		c.num = 8;
		c.run();
	}
}

class Car {
	String color;			//��ɫ
	int num;				//��̥��

	public void run () {
		System.out.println(color + "   " + num);
	}	
}