/*
	������� : ����һ����������е�ÿһ��Ԫ��
	��������� : arr.length����ĳ���
	������������ : arr.length - 1;
*/
class Test4_Array {
	public static void main (String[] args) {
		int [ ] arr1 = {11,22,33,44,55};			//���帳ֵ��һ������
			/*System.out.println(arr1 [ 0 ]);
			System.out.println(arr1 [ 1 ]);
			System.out.println(arr1 [ 2 ]);
			System.out.println(arr1 [ 3 ]);
			System.out.println(arr1 [ 4 ]);*/

			for(int x =0;x < arr1.length;x++) {
				System.out.println(arr1 [ x ]);
		}
		//arr.length��ʾ����ĳ���
		System.out.println(arr1.length);
		int [ ] arr2 = {10,20,30};			//���帳ֵ�ڶ�������
		printArr (arr2);				//�������鷽��
	}
	/*��������ķ���
		1.����ֵ����void
		2.�����б�int [ ] arr*/
	public static void printArr (int [ ] arr) {
		for(int x =0;x < arr.length;x++) {
			System.out.print(arr [ x ] + " ");
		}
	}
}