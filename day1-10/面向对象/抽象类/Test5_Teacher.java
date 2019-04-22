class Test5_Teacher 
{
	public static void main(String[] args) 
	{
		BaseTeacher bt = new BaseTeacher("苍老师",18);
		bt.teach();

		EmploymentTeacher et = new EmploymentTeacher("小泽老师",18);
		et.teach();
	}
}
abstract class Teacher
{
	private String name;
	private int age;

	public Teacher() {};						//空参构造

	public Teacher(String name,int age) {		//有参构造
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

	public abstract void teach();				//抽象方法:讲课
}

class BaseTeacher extends Teacher				//基础班老师
{
	public BaseTeacher() {}						//空参构造

	public BaseTeacher(String name,int age) {	//有参构造
		super(name,age);
	}

	public void teach() {
		System.out.println("我的姓名是:" + this.getName() + ",我的年龄是:" + this.getAge() + ",讲的内容是Java基础");
	}
}

class EmploymentTeacher extends Teacher				//基础班老师
{
	public EmploymentTeacher() {}						//空参构造

	public EmploymentTeacher(String name,int age) {	//有参构造
		super(name,age);
	}

	public void teach() {
		System.out.println("我的姓名是:" + this.getName() + ",我的年龄是:" + this.getAge() + ",讲的内容是JavaEE和Android");
	}
}