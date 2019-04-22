class Test7_Employee 
{
	public static void main(String[] args) 
	{
		Coder c = new Coder("德玛西亚","007",8000.88);
		c.work();
		
		Manager m = new Manager("苍老师","9527",3000.33,20000);
		m.work();
	}
}
//雇员类
abstract class Employee
{
	private String name;
	private String id;
	private double salary;

	public Employee() {};											//空参构造

	public Employee(String name,String id,double salary) {			//有参构造
		this.name = name;											//姓名
		this.id = id;												//工号
		this.salary = salary;										//工资
	}

	public void setName(String name) {								//设置姓名
		this.name = name;
	}

	public String getName() {										//设置年龄
		return name;
	}

	public void setId(String id) {									//设置工号
		this.id = id;
	}

	public String getId() {											//设置工号
		return id;
	}

	public void setSalary(double salary) {							//设置工资
		this.salary = salary;
	}

	public double getSalary() {										//设置工资
		return salary;
	}

	public abstract void work();									//抽象方法
}
//程序员类
class Coder extends Employee
{
	public Coder() {}												//空参构造

	public Coder(String name,String id,double salary) {				//有参构造
		super(name,id,salary);
	}

	public void work() {
		System.out.println("我的姓名是:" + getName() + ",我的工号是:" + getId() + ",我的工资是:" + getSalary() + ",我的工作是:敲代码");
	}
}
//项目经理
class Manager extends Employee
{
	private int bonus;
	public Manager() {}													//空参构造

	public Manager(String name,String id,double salary,int bonus) {				//有参构造
		super(name,id,salary);
		this.bonus = bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void work() {
		System.out.println("我的姓名是:" + getName() + ",我的工号是:" + getId() + ",我的工资是:" + getSalary() + ",我的奖金是:" + getBonus() + ",我的工作是:管理");
	}
}