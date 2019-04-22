class Test1_Math 
{
	public static void main(String[] args) 
	{
		//double d = Math.random();
		//System.out.println(d);

		//Math.random()会生成大于等于0.0并且小于1.0的伪随机数
		for(int i = 0;i < 10;i++) {
			System.out.println(Math.random());
		}

		//生成1-100的随机数
		//Math.random();0.000000000 到 0.999999999
		//Math.random() * 100;0.0000000 到99.9999999
		//(int)(Math.random() * 100);0 到 99			//将double类型数强转为int类型数
		//(int)(Math.random() * 100) + 1;1 到 100

		for(int i = 0;i < 10;i++) {
			System.out.println((int)(Math.random() * 100) + 1);
		}
	}
}
