class Test1_Car {
	public static void main (String[] args) {
		/*
		Car c1 = new Car();			//创建有名字的对象
		c1.run();
		c1.run();

		new Car().run();			//匿名对象调用方法
		new Car().run();			//匿名对象只适合对方法的一次调用,因为调用多次就会产生多个对象,不如用有名字对象
		*/

		//匿名对象是否可以调用属性并赋值?有什么意义?
		/*
		匿名对象可以调用属性,但是没有意义,因为调用完后就变成垃圾
		如果需要赋值还是用有名字的对象
		*/
		new Car().color = "red";
		new Car().num = 4;
		new Car().run();			//运行为null,0
	}
}

class Car {
	String color;			//颜色
	int num;				//轮胎数

	public void run () {
		System.out.println(color + "   " + num);
	}	
}