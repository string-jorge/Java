class Test1_Code {
	public static void main(String[] args) {
		//1.�ֲ������.�ڷ����г���,�޶������ĵ�������
		{
			int x = 10;
			System.out.println(x);
		}

		Student s1 = new Student();

		Student s2 = new Student("����",20);
	}

	static{
		System.out.println("���������еľ�̬�����");
	}
}

class Student {
	private String name;						//����
	private int age;							//����

	public Student() {							//�ղι���
		//study();
		System.out.println("�ղι���");
	}

	public Student(String name,int age){		//�вι���
		//study();
		this.name = name;
		this.age = age;
		System.out.println("�вι���");
	}

	public void setName(String name) {			//��������
		this.name = name;
	}

	public String getName() {					//��ȡ����
		return name;
	}

	public void setAge(int age) {				//��������
		this.age = age;
	}

	public int getAge() {						//��ȡ����
		return age;
	}
	//2.��������.�����з��������,ÿ����һ�ζ���ͻ�ִ��һ��,�����ڹ��췽��ִ��
	{
		System.out.println("��������");
		study();
	}

	public void study() {
		System.out.println("ѧ��ѧϰ");
	}
	//3.��̬�����.�����з��������,������ļ��ض�����,��ִ��һ��;����:����������г�ʼ��,һ��������������;��̬�������������������ִ�е�
	static {
		System.out.println("��̬�����");
	}
}