class Test1_Person {
	public static void main(String[] args) {
		Person p = new Person();
		p.speak();
	}
}
class Person {
	String name;			//��Ա����,��ʼ��ֵĬ��Ϊnull(�����з�����)

	public void speak() {
		int sum = 1;		//�ֲ�����,ʹ��ǰҪ��ʼ����ֵ(�ڷ��������л򷽷�������)
		System.out.println(name);
		System.out.println(sum);
	}
}