class Test5_Demo {
	public static void main(String[] args) {
		Fu f = new Zi();						//���뿴���,���п��ұ�,Fu��û��method����
		//f.method();							//����
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