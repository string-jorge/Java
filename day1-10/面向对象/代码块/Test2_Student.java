class Student
{
	static {
		System.out.println("Student ��̬�����");
	}

	{
		System.out.println("Student ��������");
	}

	public Student() {
		System.out.println("Student ���췽��");
	}
}

class Test2_Student {

	static {
		System.out.println("Test2_Student ��̬�����");
	}

	public static void main(String[] args) 
	{
		System.out.println("main������");

		Student s1 = new Student();
		Student s2 = new Student();
	}
}

/*
���н��:
Test2_Student ��̬�����
main������
Student ��̬�����
Student ��������
Student ���췽��
Student ��������
Student ���췽��
*/