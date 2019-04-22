class Test1_Main 
{
	public static void main(String[] args) 
	{
		/*
		public : 被jvm调用,所以权限要足够大
		static : 被jvm调用,不需要创建对象,直接(类名.)调用即可
		void   : 被jvm调用,不需要任何的返回值
		main   : 这有这样写才能被jvm识别,main不是关键字(关键字不能被用作类名)
		String[] args : 以前是用来接收键盘录入的
		*/

		System.out.println(args.length);
		for(int i = 0;i < args.length;i++)
			System.out.println(args[i]);
	}
}
