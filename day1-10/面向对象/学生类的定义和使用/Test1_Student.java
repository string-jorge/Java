class Test1_Student {
	public static void main(String[] args) {

		//��������ĸ�ʽ:����  ������ = new ���� ( );
		//������:���ǺϷ��ı�ʶ��,�����һ������,������ĸСд,����Ƕ������,�ӵڶ�����������ĸ��д
		Student s = new Student ( );

		//���ʹ�ñ�����?
		//������.������
		s.name = "����";
		s.age = 23;
		s.gender = "��";

		System.out.println(s.name + "   " + s.age + "   " + s.gender);

		//���ʹ�ó�Ա����?
		//������.������(...)
		s.study();
		s.sleep();
	}
}

class Student {
	String name;		//����
	int age;			//����
	String gender;		//�Ա�

	public void study() {			//����ѧϰ����
		System.out.println("ѧϰ");
	}

	public void  sleep() {			//����˯������
		System.out.println("˯��");
	}
}