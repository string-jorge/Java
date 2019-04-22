/*
	数组遍历 : 就是一次输出数组中的每一个元素
	数组的属性 : arr.length数组的长度
	数组的最大索引 : arr.length - 1;
*/
class Test4_Array {
	public static void main (String[] args) {
		int [ ] arr1 = {11,22,33,44,55};			//定义赋值第一个数组
			/*System.out.println(arr1 [ 0 ]);
			System.out.println(arr1 [ 1 ]);
			System.out.println(arr1 [ 2 ]);
			System.out.println(arr1 [ 3 ]);
			System.out.println(arr1 [ 4 ]);*/

			for(int x =0;x < arr1.length;x++) {
				System.out.println(arr1 [ x ]);
		}
		//arr.length表示数组的长度
		System.out.println(arr1.length);
		int [ ] arr2 = {10,20,30};			//定义赋值第二个数组
		printArr (arr2);				//调用数组方法
	}
	/*数组遍历的方法
		1.返回值类型void
		2.参数列表int [ ] arr*/
	public static void printArr (int [ ] arr) {
		for(int x =0;x < arr.length;x++) {
			System.out.print(arr [ x ] + " ");
		}
	}
}