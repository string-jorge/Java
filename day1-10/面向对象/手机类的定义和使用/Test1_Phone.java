class Test1_Phone {
	public static void main(String[] args) {
		Phone x = new Phone ( );
		x.brand = "ƻ��";
		x.price = 8000;
		System.out.println(x.brand + "   " + x.price);
		x.call();
		x.sendMessage();
		x.playGame();
	}
}

class Phone {
	String brand;		//Ʒ��
	int price;			//�۸�

	public void call () {			//��绰
		System.out.println("��绰");
	}

	public void sendMessage () {		//����Ϣ
		System.out.println("����Ϣ");
	}

	public void playGame () {		//����Ϸ
		System.out.println("����Ϸ");
	}
}