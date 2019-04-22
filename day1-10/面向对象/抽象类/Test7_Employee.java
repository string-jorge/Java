class Test7_Employee 
{
	public static void main(String[] args) 
	{
		Coder c = new Coder("��������","007",8000.88);
		c.work();
		
		Manager m = new Manager("����ʦ","9527",3000.33,20000);
		m.work();
	}
}
//��Ա��
abstract class Employee
{
	private String name;
	private String id;
	private double salary;

	public Employee() {};											//�ղι���

	public Employee(String name,String id,double salary) {			//�вι���
		this.name = name;											//����
		this.id = id;												//����
		this.salary = salary;										//����
	}

	public void setName(String name) {								//��������
		this.name = name;
	}

	public String getName() {										//��������
		return name;
	}

	public void setId(String id) {									//���ù���
		this.id = id;
	}

	public String getId() {											//���ù���
		return id;
	}

	public void setSalary(double salary) {							//���ù���
		this.salary = salary;
	}

	public double getSalary() {										//���ù���
		return salary;
	}

	public abstract void work();									//���󷽷�
}
//����Ա��
class Coder extends Employee
{
	public Coder() {}												//�ղι���

	public Coder(String name,String id,double salary) {				//�вι���
		super(name,id,salary);
	}

	public void work() {
		System.out.println("�ҵ�������:" + getName() + ",�ҵĹ�����:" + getId() + ",�ҵĹ�����:" + getSalary() + ",�ҵĹ�����:�ô���");
	}
}
//��Ŀ����
class Manager extends Employee
{
	private int bonus;
	public Manager() {}													//�ղι���

	public Manager(String name,String id,double salary,int bonus) {				//�вι���
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
		System.out.println("�ҵ�������:" + getName() + ",�ҵĹ�����:" + getId() + ",�ҵĹ�����:" + getSalary() + ",�ҵĽ�����:" + getBonus() + ",�ҵĹ�����:����");
	}
}