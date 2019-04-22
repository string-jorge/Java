/*
公司年销售额求和
	第一季度:22,66,44
	第二季度:77,33,88
	第三季度:25,45,65
	第四季度:11,66,99
*/
class Test5_Array {
	public static void main(String[] args) {
		int arr [ ] [ ] = { {22,66,44},{77,33,88},{25,45,65},{11,66,99} };

		int sum = 0;						//定义变量,记录每次相加的结果
		for(int x = 0;x < arr.length;x++) {				//获取到没个二维数组中的每个一维数组
			for(int y = 0; y < arr [x].length;y++) {			//获取每个一维数组中的每个元素
				sum = sum + arr[ x ] [ y ];			//累加
			}
		}
		System.out.println(sum);
	}
}