/*
1.������˽�з������ܱ���д
2.������д���෽��ʱ,����Ȩ�޲��ܸ���(���һ��)
3.���ྲ̬����,����Ҳ����ͨ����̬����������д(������д,��̬����)
*/
class Test9_Phone {
	public static void main(String[] args) {
		Ios8 i = new Ios8();
		i.siri();
		i.print();
	}
}
class Ios7 {
	public void call() {
		System.out.println("��绰");
	}

	public void siri() {
		System.out.println("speak English");
	}

	public static void print() {					//���ྲ̬����
		System.out.println("Fu print");
	}
}
class Ios8 extends Ios7 {
	public void siri() {
		System.out.println("˵����");
		super.siri();
	}
	public static void print() {					//����Ҳ�����Ǿ�̬������д(������д)
		System.out.println("Zi print");
	}
}