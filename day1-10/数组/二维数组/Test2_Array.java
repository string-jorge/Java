//二维数组格式2
class Test2_Array {
	public static void main (String[] args) {
		int [ ] [ ] arr = new int [3] [ ];		//二维数组中有3个一维数组,三个一维数组都没有被赋值

		System.out.println(arr[ 0 ]);
		System.out.println(arr[ 1 ]);
		System.out.println(arr[ 2 ]);
		arr [ 0 ] = new int [ 3 ];		//第一个一维数组中可以存储3个int类型的值
		arr [ 1 ] = new int [ 5 ];		//第二个一维数组中可以存储5个int类型的值
		System.out.println("--------------------------------");
		System.out.println(arr[ 0 ]);
		System.out.println(arr[ 1 ]);
		System.out.println(arr[ 2 ]);

	}
}