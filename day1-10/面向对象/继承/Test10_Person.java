class Test10_Person {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("����");
		s1.setAge(20);
		System.out.println(s1.getName() + "   " + s1.getAge());
		s1.eat();
		s1.study();

		Student s2 = new Student("����",21);
		System.out.println(s2.getName() + "   " + s2.getAge());
		s2.eat();
		s2.study();
	}
}

class Person {
	private String name;
	private int age;

	public Person () {}									//�ղι���

	public Person (String name,int age) {				//�вι���
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {					//��������
		this.name = name;
	}

	public String getName() {							//��ȡ����
		return name;
	}

	public void setAge(int age) {						//��������
		this.age = age;
	}

	public int getAge() {								//��ȡ����
		return age;
	}

	public void eat() {									//�Է��ķ���
		System.out.println(name + "�Է�");
	}
}

class Student extends Person {
	public Student () {}								//�ղι���

	public Student (String name,int age) {				//�вι���
		super(name,age);
	}

	public void study() {								//ѧϰ����
		System.out.println(this.getName() + "ѧϰ");	//this�̳�����ʹ��
	}
}

class Teacher extends Person {
	public Teacher () {}								//�ղι���

	public Teacher (String name,int age) {				//�вι���
		super(name,age);
	}

	public void teach () {
		System.out.println(super.getName() + "����");	//superֱ�ӵ��ø����
	}
}