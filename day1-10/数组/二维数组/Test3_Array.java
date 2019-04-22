//二维数组格式3
class Test3_Array {
	public static void main(String[] args) {
		int [ ] [ ] arr ={ {1,2,3},{4,5},{6,7,8,9} };		//这个二维数组中每个大括号都代表一个一维数组
		System.out.println(arr);			//[[I@2e5c649,二维数组的地址值
		System.out.println(arr [ 0 ]);			//[I@136432db,二维数组中第一个一维数组的地址值
		System.out.println(arr [ 0 ] [ 0 ]);		//1,二维数组中第一个一维数组中的第一个元素
	}
}