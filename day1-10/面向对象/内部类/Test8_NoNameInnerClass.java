class Test8_NoNameInnerClass 
{
	public static void main(String[] args) 
	{
		PersonDemo pd = new PersonDemo();
		pd.method(new Person() {					//�����ڲ��൱����������
			public void show() {
				System.out.println("show");
			}
		});
	}
}

abstract class Person
{
	public abstract void show();
}

class PersonDemo
{
	public void method(Person p) {			//Person p = new Student();
		p.show();
	}
}

class Student extends Person {
	public void show() {
		System.out.println("show");
	}
}