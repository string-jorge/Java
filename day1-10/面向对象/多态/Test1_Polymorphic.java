/*
��̬ǰ��
	1.Ҫ�м̳й�ϵ
	2.Ҫ�з�����д
	3.Ҫ�и�������ָ���������
*/
class Test1_Polymorphic {						//Polymorphic�Ƕ�̬����˼
	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();

		Animal a = new Cat();					//��������ָ���������
		a.eat();
	}
}

class Animal{
	public void eat() {
		System.out.println("����Է�");
	}
}

class Cat extends Animal {						//�̳й�ϵ
	public void eat() {							//������д
		System.out.println("è����");
	}
}
