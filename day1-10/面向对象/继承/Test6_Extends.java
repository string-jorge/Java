//√Ê ‘Ã‚“ª
class Test6_Extends {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.show();
	}
}

class Fu {
	public int num = 10;
	public Fu() {
		System.out.println("Fu");
	}
}

class Zi extends Fu {
	public int num = 20;
	public Zi() {
		//super();
		System.out.println("Zi");
	}
	public void show() {
		int num = 30;
		System.out.println(num);							//30
		System.out.println(this.num);						//20
		System.out.println(super.num);						//10
	}
}