class Test2_Extends {
	public static void main(String[] args) {
		Son s1 = new Son();
		System.out.println(s1.getName() + "   " + s1.getAge());
		Son s2 = new Son("����",20);
		System.out.println(s2.getName() + "   " + s2.getAge());
	}
}

class Father {
	private String name;
	private int age;

	public Father() {							//�ղι���
		System.out.println("Father �ղι���");
	}

	public Father(String name,int age) {		//�вι���
		this.name = name;
		this.age = age;
		System.out.println("Father �вι���");
	}

	public void setName (String name) {			//��������
		this.name = name;
	}

	public String getName() {					//��ȡ����
		return name;
	}

	public void setAge (int age) {				//��������
		this.age = age;
	}

	public int getAge() {						//��ȡ����
		return age;
	}
}

class Son extends Father {
	public Son() {								//�ղι���
		//super();								//���ø����еĿղι���
		//super("����",21)						//���ø����е��вι���
		this("����",22);						//���ñ����еĹ��췽��
		System.out.println("Son �ղι���");
	}

	public Son(String name,int age) {			//�вι���
		//super();								//���ø����еĿղι���
		super(name,age);						//���ø����е��вι���
		System.out.println("Son �вι���");
	}
}