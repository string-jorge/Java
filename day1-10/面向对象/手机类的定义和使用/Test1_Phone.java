class Test1_Phone {
	public static void main(String[] args) {
		Phone x = new Phone ( );
		x.brand = "苹果";
		x.price = 8000;
		System.out.println(x.brand + "   " + x.price);
		x.call();
		x.sendMessage();
		x.playGame();
	}
}

class Phone {
	String brand;		//品牌
	int price;			//价格

	public void call () {			//打电话
		System.out.println("打电话");
	}

	public void sendMessage () {		//发信息
		System.out.println("发信息");
	}

	public void playGame () {		//打游戏
		System.out.println("打游戏");
	}
}