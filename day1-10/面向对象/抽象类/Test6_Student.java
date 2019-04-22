class Test6_Student 
{
	public static void main(String[] args) 
	{
		BaseStudent bs = new BaseStudent("С��",18);
		bs.study();

		EmploymentStudent es = new EmploymentStudent("С��",18);
		es.study();
	}
}
abstract class Student
{
	private String name;
	private int age;

	public Student() {};						//�ղι���

	public Student(String name,int age) {		//�вι���
		this.name = name;
		this.age = age;
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

	public abstract void study();				//���󷽷�:ѧϰ
}

class BaseStudent extends Student				//��������ʦ
{
	public BaseStudent() {}						//�ղι���

	public BaseStudent(String name,int age) {	//�вι���
		super(name,age);
	}

	public void study() {
		System.out.println("�ҵ�������:" + this.getName() + ",�ҵ�������:" + this.getAge() + ",ѧ��������Java����");
	}
}

class EmploymentStudent extends Student				//��������ʦ
{
	public EmploymentStudent() {}					//�ղι���

	public EmploymentStudent(String name,int age) {	//�вι���
		super(name,age);
	}

	public void study() {
		System.out.println("�ҵ�������:" + this.getName() + ",�ҵ�������:" + this.getAge() + ",ѧ��������JavaEE��Android");
	}
}