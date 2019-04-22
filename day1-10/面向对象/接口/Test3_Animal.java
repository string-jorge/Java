class Test3_Animal {
	public static void main(String[] args) {
		Cat c = new Cat("Cat����",7);
		System.out.println("����:" + c.getName());
		System.out.println("����:" + c.getAge());
		c.eat();
		c.sleep();

		JumpCat jc = new JumpCat("����è",7);
		System.out.println("����:" + jc.getName());
		System.out.println("����:" + jc.getAge());
		jc.eat();
		jc.sleep();
		jc.jump();
		
	}
}
//������
abstract class Animal
{
	private String name;						//����
	private int age;							//����

	public Animal() {}							//�ղι���

	public Animal(String name,int age) {		//�вι���
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

	public abstract void eat();					//�Է�

	public abstract void sleep();				//˯��
}
//���߽ӿ�
interface Jumping
{
	public abstract void jump();				//����
}
//è��
class Cat extends Animal
{
	public Cat() {}								//�ղι���

	public Cat(String name,int age) {			//�вι���
		super(name,age);
	}

	public void eat() {							//è�Է�
		System.out.println("è����");
	}

	public void sleep() {						//è˯��
		System.out.println("����˯");
	}
}
//����è
class JumpCat extends Cat implements Jumping
{
	public JumpCat() {}							//�ղι���

	public JumpCat(String name,int age) {		//�вι���
		super(name,age);
	}

	public void jump() {						//����
		System.out.println("è����");
	}
}