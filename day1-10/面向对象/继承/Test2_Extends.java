/*
Java������ص�
	(1)Javaֻ֧�ֵ��̳�,��֧�ֶ�̳�
		��Щ������֧�ֶ�̳е�,��ʽ:extends��1,��2,...
	(2)Java֧�ֶ��̳�(�̳���ϵ)
	(3)������������ϵ�����й���,����ײ���ഴ������
	(4)������������ϵ�Ĺ��й���,��������
*/
class Test2_Extends 
{
	public static void main(String[] args) {
		DemoC d = new DemoC();
		d.show();
		d.method();
		d.print();
	}
}

class DemoA {
	public void show() {
		System.out.println("DemoA");
	}
}

class DemoB extends DemoA {
	public void method() {
		System.out.println("DemoB");
	}
}

class DemoC extends DemoB {
	public void print() {
		System.out.println("DemoC");
	}
}


