public class ArrayTool 
{
	//如果一个类中的所有方法都是静态的,需要再多做一步,私有构造方法,目的是不让其他类创建本类对象
	//直接用(类名.)调用即可

	private ArrayTool() {}						//私有构造方法

	//1.获取最大值
	public static int getMax(int[] arr) {
		int max = arr[0];						//记录第一个元素
		for(int i = 1;i < arr.length;i++) {		//从第二个元素开始遍历
			if(max < arr[i]) {					//max与数组中其他的元素比较
			max = arr[i];						//记录住较大的
			}
		}
		return max;								//将最大值返回
	}
	//2.数组的遍历
	public static void print(int[] arr) {
		for(int i = 0;i < arr.length;i++) {		//遍历数组
			System.out.print(arr[i] + " ");
		}
	}
	//3.数组的交换
	public static void revArray(int[] arr) {
		for(int i = 0;i < arr.length / 2;i++){	//循环次数是元素个数的一半.
			/*
			arr[0]与arr[arr.length-1-0]交换
			arr[1]与arr[arr.length-1-1]交换
			arr[2]与arr[arr.length-1-2]交换
			*/
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
	}
}