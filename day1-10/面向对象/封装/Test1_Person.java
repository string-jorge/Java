//�ؼ���private
class Test1_Person {
	public static void main (String[] args) {
		Person p1 = new Person();
		p1.name = "����";			//�����������Բ���ֵ
		//p1.age = -20;			//�����������Բ���ֵ,-20����ȫ
		//p1.speak();			//���÷���(��Ϊ)

		p1.setAge(-20);
		
		System.out.println(p1.getAge( ) );
	}
}
class Person {
	String name;				//����
	private int age;				//����,private˽�е���˼

	public void setAge(int x){			//��������
		if (x > 0 && x < 200) {
			age = x;
		} else {
			System.out.println("��ػ��ǰ�,�����ʺ���");
		}
	} 

	public int getAge() {				//��ȡ����
		return age;
	}

	public void speak(){
		System.out.println(name + "   "  + age);
	}
}