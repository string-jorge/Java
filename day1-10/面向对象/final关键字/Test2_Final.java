class Test2_Final {
	public static void main(String[] args) {
		final int NUM = 10;
		//NUM = 20;								//����
		System.out.println(NUM);

		final Person p = new Person("����",20);
		//p = new Person("����",21);			//����
		p.setName("����");
		p.setAge(21);
		System.out.println(p.getName() + "   " + p.getAge());

		method(10);
		method(20);
	}

	public static void method(final int X){		//������������final����
		System.out.println(X);
	}
}
/*
���λ�������,��ֵ���ܱ��ı�
������������,�ǵ�ֵַ���ܱ��ı�,�����е����Կ��Ըı�
*/
class Person {
	private String name;
	private int age;

	public Person() {}						//�ղι���

	public Person(String name,int age) {	//�вι���
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {		//��������
		this.name = name;
	}

	public String getName() {				//��ȡ����
		return name;
	}

	public void setAge(int age) {			//��������
		this.age = age;
	}

	public int getAge() {					//��ȡ����
		return age;
	}
}
