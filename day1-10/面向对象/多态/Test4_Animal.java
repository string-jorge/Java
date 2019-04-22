class Test4_Animal {
	public static void main(String[] args) {
		//Cat c1 = new Cat();
		//c1.eat();
		method(new Cat());
		method(new Dog());

		//Animal a = new Cat();						//���������ڴ��������ʱ���ø�������ָ���������,ֱ�Ӵ���������������,����ֱ��ʹ���������е����Ժ���Ϊ
	}
/*  //Cat c = new Dog();è��һֻ��,���Ǵ����
	public static void method(Cat c) {
		c.eat();
	}

	public static void method(Dog d) {
		d.eat();
	}
*/
	//����ѹ�ǿת��è�ͻ��������ת���쳣,ClassCastException
	public static void method(Animal a) {			//����������ʱ���ö�̬���,��Ϊ��չ��ǿ
		/*Cat c = (Cat) a;
		c.eat();
		c.catchMouse();*/
		//�ؼ���instanceof�ж�ǰ�ߵ������Ƿ��Ǻ�ߵ���������
		if(a instanceof Cat) {
			Cat c = (Cat)a;
			c.eat();
			c.catchMouse();
		}else if(a instanceof Dog) {
			Dog d = (Dog)a;
			d.eat();
			d.lookHome();
		}else {
			a.eat();
		}
	}
}

class Animal {
	public void eat() {
		System.out.println("����Է�");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("è����");
	}

	public void catchMouse() {
		System.out.println("ץ����");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("���Թ�ͷ");
	}

	public void lookHome() {
		System.out.println("����");
	}
}