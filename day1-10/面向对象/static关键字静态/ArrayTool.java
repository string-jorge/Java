public class ArrayTool 
{
	//���һ�����е����з������Ǿ�̬��,��Ҫ�ٶ���һ��,˽�й��췽��,Ŀ���ǲ��������ഴ���������
	//ֱ����(����.)���ü���

	private ArrayTool() {}						//˽�й��췽��

	//1.��ȡ���ֵ
	public static int getMax(int[] arr) {
		int max = arr[0];						//��¼��һ��Ԫ��
		for(int i = 1;i < arr.length;i++) {		//�ӵڶ���Ԫ�ؿ�ʼ����
			if(max < arr[i]) {					//max��������������Ԫ�رȽ�
			max = arr[i];						//��¼ס�ϴ��
			}
		}
		return max;								//�����ֵ����
	}
	//2.����ı���
	public static void print(int[] arr) {
		for(int i = 0;i < arr.length;i++) {		//��������
			System.out.print(arr[i] + " ");
		}
	}
	//3.����Ľ���
	public static void revArray(int[] arr) {
		for(int i = 0;i < arr.length / 2;i++){	//ѭ��������Ԫ�ظ�����һ��.
			/*
			arr[0]��arr[arr.length-1-0]����
			arr[1]��arr[arr.length-1-1]����
			arr[2]��arr[arr.length-1-2]����
			*/
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
	}
}