/*��Ա������
	��Ա����
	��Ա����
	��̬����(�෽��)
*/
class Test2_Polymorphic {
	public static void main(String[] args) {
		Father f = new Son();					//��������ָ���������
		System.out.println(f.num);				//��Ա����
		f.print();								//��Ա����
		f.method();	//�൱��Father.method();	//��̬����(�෽��)

		Son s = new Son();
		System.out.println(s.num);
	}
}
/*
��Ա����
	���뿴���(����),����Ҳ�����(����)
��Ա����
	���뿴���(����),���п��ұ�(����),Ҳ�ж�̬��
��̬����
	���뿴���(����),����Ҳ�����(����)
	(��̬�������,�㲻����д,���Է��ʻ�����ߵ�)
ֻ�зǾ�̬�ĳ�Ա����,���뿴���,���п��ұ�
*/
class Father {
	int num = 10;

	public void print() {
		System.out.println("Father����");
	}

	public static void method() {
		System.out.println("Father��̬����");
	}
}

class Son extends Father {
	int num = 20;

	public void print() {
		System.out.println("Son����");
	}

	public static void method() {
		System.out.println("Son��̬����");
	}
}
