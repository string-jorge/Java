class  Test4_Student
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();					//�ղι���
		s1.setName("����");							//��������
		s1.setAge(20);								//��������

		System.out.println("�ҽ�" + s1.getName() + "," + "��" + s1.getAge() + "����.");
		//getXxx()��ȡ����ֵ,���Դ�ӡ,Ҳ���Ը�ֵ����������,����������
		Student s2 = new Student("����",21);		//�вι���
		s2.show();									//ֻ��Ϊ����ʾ����ֵ
	}
}

class Student
{
	private String name;							//����
	private int age;								//����

	public Student() {}								//�ղι���

	public Student(String name,int age) {			//�вι���
		this.name = name;
		this.age = age;
	}

	public void setName (String name) {				//��������
		this.name = name;
	}

	public String getName() {						//��ȡ����
		return name;
	}

	public void setAge(int age) {					//��������
		this.age = age;
	}

	public int getAge() {							//��ȡ����
		return age;
	}

	public void show() {							//�������������
		System.out.println("�ҽ�" + name + "," + "��" + age + "����.");
	}
}