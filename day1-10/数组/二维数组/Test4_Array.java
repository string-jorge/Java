//二维数组的遍历
class Test4_Array {
	public static void main(String[] args) {
		int [ ] [ ] arr ={ {1,2,3},{4,5},{6,7,8,9} };

		for(int x = 0;x < arr.length;x++) {			//获取到没个二维数组中的每个一维数组
			for(int y = 0; y < arr [x].length;y++) {			//获取每个一维数组中的每个元素
				System.out.print(arr[x][y] + " ");
			}
			System.out.println();
		}
	}
} 