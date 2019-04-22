class Test5_Demo {
	public static void main(String[] args) {
		Fu f = new Zi();						//编译看左边,运行看右边,Fu类没有method方法
		//f.method();							//错误
		f.show();
	}
}

class Fu {
	public void show() {
		System.out.println("Fu show");
	}
}

class Zi extends Fu {
	public void show() {
		System.out.println("Zi show");
	}

	public void method() {
		System.out.println("Zi method");
	}
}