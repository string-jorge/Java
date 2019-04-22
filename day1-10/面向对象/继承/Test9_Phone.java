/*
1.父类中私有方法不能被重写
2.子类重写父类方法时,访问权限不能更低(最好一致)
3.父类静态方法,子类也必须通过静态方法进行重写(不算重写,多态讲解)
*/
class Test9_Phone {
	public static void main(String[] args) {
		Ios8 i = new Ios8();
		i.siri();
		i.print();
	}
}
class Ios7 {
	public void call() {
		System.out.println("打电话");
	}

	public void siri() {
		System.out.println("speak English");
	}

	public static void print() {					//父类静态方法
		System.out.println("Fu print");
	}
}
class Ios8 extends Ios7 {
	public void siri() {
		System.out.println("说中文");
		super.siri();
	}
	public static void print() {					//子类也必须是静态才能重写(不算重写)
		System.out.println("Zi print");
	}
}