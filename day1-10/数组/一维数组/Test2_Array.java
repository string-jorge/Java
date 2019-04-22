class Test2_Array {
	public static void main (String[] args) {
	//动态初始化格式 : 数据类型[ ] 数组名 = new 数据类型[ 数组的长度 ];
	int [ ] arr = new int [ 5 ];		//动态初始化,在内存中开辟连续的5块空间

	System.out.println( arr[ 0 ] );		//系统给出默认初始化值,整数类型的都是0

	arr [ 0 ] = 10;
	System.out.println( arr[ 0 ] );

	System.out.println( arr );		//[I@2e5c649
	}
}
/*
	整数类型:byte,short,int,long默认初始化值都是0
	浮点类型:float,double默认初始化值都是0.0
	布尔类型:boolean默认初始化值是false
	字符类型:char默认初始化值'\u0000'		
		char在内存中占两个字节,是16个二进制位
		\u0000中的每一个零代表的是十六进制的0,那么四个零代表16个二进制位
	[I@2e5c649的解释:
	[ :代表的是数组,几个[ 就代表几维
	I :代表的是int类型
	@ :是固定的
	2e5c649:代表的是十六进的地址值
*/
/*
	Java中的内存分配以及栈和堆的区别
		A:栈*(特点:先进后出)
			存储局部变量
			局部变量:定义在方法声明上和方法中的变量
		B:堆*
			存储new出来的数据或对象
		C:方法区
			面向对象部分讲解
		D:本地方法区
			和系统相关
		E:寄存器
			给CPU使用
*/