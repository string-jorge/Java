//二维数组格式1
class Test1_Array {
	public static void main (String[] args) {
		int [ ] [ ] arr = new int [ 3 ] [ 2 ];			//二维数组格式1,这个二维数组中有3个一维数组,每个一维数组中有2个元素
		System.out.println(arr);			//二维数组
		System.out.println(arr[ 0 ]);			//二维数组中的每一个一维数组
		System.out.println(arr[ 0 ] [ 0 ]);			//二维数组中的第一个一维数组中的第一个元素
	}
}
/*
运行结果分析:
[[I@2e5c649		二维数组的地址值
[I@136432db		一维数组的地址值
0			元素值
*/