class Test1_Constructor {
	public static void main(String[] args) {
		Person p = new Person();			//��һ���������ʱ��ϵͳ�Ͱ����ǵ����˹��췽��
		//p.Person();						//���췽�������ö������
		p.show();

		Person p2 = new Person();
		p2.show();
	}
}
class Person {
	private String name;
	private int age;

	//���췽��
	public Person () {
		//System.out.println("Hello World!");
		//return;								//���췽��Ҳ����return����,��ʽ��return;
		name = "����";
		age = 20;
	}

	public void show() {
		System.out.println(name + "   " + age);
	}
}