class Test3_SuperMan {
	public static void main(String[] args) {
		Person p = new SuperMan();					//��������ָ���������(����ת��),���˻�Ϊ��ͨ��
		p.talk();
		//p.fly();									//����,����û��fly����

		SuperMan sm = (SuperMan)p;					//����ת��
		sm.fly();
	}
}

class Person {
	String name = "Jenny";
	public void talk() {
		System.out.println("̸����");
	}
}

class SuperMan extends Person {
	String name = "SuperMan";
	public void talk() {
		System.out.println("̸��ëǮ������");
	}

	public void fly() {
		System.out.println("�ɳ�ȥ����");
	}
}