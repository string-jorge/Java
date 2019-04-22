//数组元素反转(就是把数组对调)
class Test6_Array {
	public static void main (String[] args) {
		int [ ] arr = {10,20,30,40,50,60};
		reverseArray(arr);
		printArray(arr);
	}

	/*
	数组元素反转方法
		1.明确返回值类型void
		2.明确参数类型int [ ] arr
	*/
	public static void reverseArray (int [ ] arr) {
		for (int x = 0;x < arr.length / 2;x++) {
			//arr [ 0 ]和arr[arr.length-1-0]交换
			//arr [ 1 ]和arr[arr.length-1-1]交换
			//arr [ 2 ]和arr[arr.length-1-2]交换
			//...

			int temp = arr[ x ];
			arr[ x ] = arr[ arr.length - 1 - x];
			arr[ arr.length - 1 - x] = temp;
		}
	}

	/*
	数组遍历方法
		1.明确返回值类型void
		2.明确参数列表int [ ] arr
	*/
	public static void printArray(int [ ] arr) {
		for(int x = 0;x < arr.length;x++) {
			System.out.print(arr[ x ] + " ");
		}
	}
}