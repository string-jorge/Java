//获取数组中的最值
class Test5_Array {
	public static void main(String[] args) {
		int [ ] arr = new int [ ] {10,51,231,32,13,123};
		int max = getMax(arr);
			System.out.println("max = " + max);
	}
	/*
	获取数组中的最大值
		1.返回类型int
		2.参数列表int [ ] arr
	*/
	public static int getMax (int [ ] arr) {
		int max = arr[ 0 ];
		for(int x = 1;x < arr.length;x++) {			//从数组的第二个元素开始遍历
			if (max < arr [ x ]) {				//如果max记录的值小于数组中的元素
				max = arr [ x ];			//max记录较大的值
			}
		}
		return max;
	}
}