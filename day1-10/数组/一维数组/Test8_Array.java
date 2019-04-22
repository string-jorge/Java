//数组元素查找(查找指定元素第一次在数组中出现的索引)
class Test8_Array {
	public static void main (String[] args) {
		int [ ] arr = {10,20,30,40,50,60,70};
		int index = getIndex(arr,60);
		System.out.println(index);
	}	

/*
	查找元素索引
	1.返回值类型int
	2.明确参数列表,int [ ] arr,int value
*/
	public static int getIndex(int [ ] arr,int value) {
		for (int x = 0;x < arr.length;x++) {
			if(arr[ x ] == value) {
				return x;
			}
		}
		return -1;
	}
}
