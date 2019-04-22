class Test3_ArrayTool 
{
	public static void main(String[] args) 
	{
		int[] arr = {11,22,33,44,55,66,77};
		/*	ArrayTool at = new ArrayTool();
		int max = at.getMax(arr);					//取最值
		System.out.println(max);

		at.print(arr);								//打印

		System.out.println();

		at.revArray(arr);							//反转
		at.print(arr);	*/

		ArrayTool.print(arr);						//方法私有后的调用
	}
}