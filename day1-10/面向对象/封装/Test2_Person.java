//this�ؼ���,����ǰ���������,�������ֳ�Ա�����;ֲ���������
class Test2_Person {
	public static void main (String[] args) {
		Person p1 = new Person();
		p1.setName("����");
		p1.setAge(20);
		System.out.println(p1.getName() + "   " + p1.getAge());

		Person p2 = new Person();
		p2.setName("����");
		p2.setAge(21);
		System.out.println(p2.getName() + "   " + p2.getAge());
		
	}
}

class Person {
	private String name;				//����
	private int age;				//����,private˽�е���˼

	public void setAge(int age){			//��������
		if (age > 0 && age < 200) {
			this.age = age;
		} else {
			System.out.println("��ػ��ǰ�,�����ʺ���");
		}
	} 

	public int getAge() {				//��ȡ����
		return age;
	}

	public void setName(String name){		//��������
		this.name = name;
	}

	public String getName() {			//��ȡ����
		return name;
	}
}