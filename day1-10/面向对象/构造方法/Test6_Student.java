class  Test6_Student
{
	public static void main(String[] args) 
	{
		Student s = new Student();
		s.show();
	}
}

class Student
{
	private String name = "����";
	private int age = 20;
	
	public Student() {
		name = "����";
		age = 21;
	}

	public void show() {
		System.out.println(name + "   " + age);
	}
}