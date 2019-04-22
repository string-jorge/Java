//匿名对象参数传递
class Test2_Car {
	public static void main (String[] args) {
		/*
		Car c1 = new Car();
		c1.color = "red";
		c1.num = 8;
		c1.run();

		Car c2 = new Car();
		c2.color = "red";
		c2.num = 8;
		c2.run();

		Car c1 = new Car();			//调用方法
		method(c1);
		Car c2 = new Car();
		method(c2);
		*/
		method(new Car( ) );			//匿名对象可以当作参数传递
		method(new Car( ) );

	}
	//抽取方法提高代码复用性
	public static void method(Car c) {		//Car c = new Car();
		c.color = "red";
		c.num = 8;
		c.run();
	}
}

class Car {
	String color;			//颜色
	int num;				//轮胎数

	public void run () {
		System.out.println(color + "   " + num);
	}	
}