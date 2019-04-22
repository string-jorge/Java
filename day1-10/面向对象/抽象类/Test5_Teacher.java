class Test5_Teacher 
{
	public static void main(String[] args) 
	{
		BaseTeacher bt = new BaseTeacher("����ʦ",18);
		bt.teach();

		EmploymentTeacher et = new EmploymentTeacher("С����ʦ",18);
		et.teach();
	}
}
abstract class Teacher
{
	private String name;
	private int age;

	public Teacher() {};						//�ղι���

	public Teacher(String name,int age) {		//�вι���
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

	public abstract void teach();				//���󷽷�:����
}

class BaseTeacher extends Teacher				//��������ʦ
{
	public BaseTeacher() {}						//�ղι���

	public BaseTeacher(String name,int age) {	//�вι���
		super(name,age);
	}

	public void teach() {
		System.out.println("�ҵ�������:" + this.getName() + ",�ҵ�������:" + this.getAge() + ",����������Java����");
	}
}

class EmploymentTeacher extends Teacher				//��������ʦ
{
	public EmploymentTeacher() {}						//�ղι���

	public EmploymentTeacher(String name,int age) {	//�вι���
		super(name,age);
	}

	public void teach() {
		System.out.println("�ҵ�������:" + this.getName() + ",�ҵ�������:" + this.getAge() + ",����������JavaEE��Android");
	}
}