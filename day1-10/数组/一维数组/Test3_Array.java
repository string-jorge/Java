class Test3_Array {
	public static void main (String[] args) {
	//静态初始化格式 : 数据类型[ ] 数组名 = new 数据类型[ ] {元素1,元素2,...};
	int [ ] arr1 = new int [ ] {11,22,33,44,55};		//静态初始化,可以先声明(int [] arr1;)再赋值数(arr1 = new int [] {11,22,33,44,55};)

	//简化格式 : 数据类型[ ] 数组名 = {元素1,元素2,...};
	int [ ] arr2 = {11,22,33,44,55};			//(常用)简化格式,声明和赋值在同一行,不可以先声明再赋值

	//int [ ] arr1 = new int [ 5 ] {11,22,33,44,55};	(错误的格式,不允许动静结合)

	System.out.println( arr1[ 2 ] );
	System.out.println( arr2[ 4 ] );
	}
}