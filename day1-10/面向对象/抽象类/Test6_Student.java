class Test6_Student 
{
	public static void main(String[] args) 
	{
		BaseStudent bs = new BaseStudent("小苍",18);
		bs.study();

		EmploymentStudent es = new EmploymentStudent("小泽",18);
		es.study();
	}
}
abstract class Student
{
	private String name;
	private int age;

	public Student() {};						//空参构造

	public Student(String name,int age) {		//有参构造
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {			//设置姓名
		this.name = name;
	}

	public String getName() {					//获取姓名
		return name;
	}

	public void setAge(int age) {				//设置年龄
		this.age = age;
	}

	public int getAge() {						//获取年龄
		return age;
	}

	public abstract void study();				//抽象方法:学习
}

class BaseStudent extends Student				//基础班老师
{
	public BaseStudent() {}						//空参构造

	public BaseStudent(String name,int age) {	//有参构造
		super(name,age);
	}

	public void study() {
		System.out.println("我的姓名是:" + this.getName() + ",我的年龄是:" + this.getAge() + ",学的内容是Java基础");
	}
}

class EmploymentStudent extends Student				//基础班老师
{
	public EmploymentStudent() {}					//空参构造

	public EmploymentStudent(String name,int age) {	//有参构造
		super(name,age);
	}

	public void study() {
		System.out.println("我的姓名是:" + this.getName() + ",我的年龄是:" + this.getAge() + ",学的内容是JavaEE和Android");
	}
}