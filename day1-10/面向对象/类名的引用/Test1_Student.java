class Test1_Student {
	public static void main(String[] args) {
		print(10);				//��int x����ֵ

		Student s = new Student();		//��������,��������ĵ�ֵַ���Ƹ�s
		print(s);				//��Student s���ǵ�ֵַ
	}

	public static void print(int x) {			//�����������͵�����ʽ����
		System.out.println(x);
	}

	public static void print (Student s) {		//�����������͵�����ʽ����
		s.name = "����";
		s.age = 23;
		s.speak();
	}
}
class Student {
	String name;				//����
	int age;					//����

	public void speak() {
		System.out.println(name + "   " + age);
	}
}