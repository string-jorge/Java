//����Ԫ�ط�ת(���ǰ�����Ե�)
class Test6_Array {
	public static void main (String[] args) {
		int [ ] arr = {10,20,30,40,50,60};
		reverseArray(arr);
		printArray(arr);
	}

	/*
	����Ԫ�ط�ת����
		1.��ȷ����ֵ����void
		2.��ȷ��������int [ ] arr
	*/
	public static void reverseArray (int [ ] arr) {
		for (int x = 0;x < arr.length / 2;x++) {
			//arr [ 0 ]��arr[arr.length-1-0]����
			//arr [ 1 ]��arr[arr.length-1-1]����
			//arr [ 2 ]��arr[arr.length-1-2]����
			//...

			int temp = arr[ x ];
			arr[ x ] = arr[ arr.length - 1 - x];
			arr[ arr.length - 1 - x] = temp;
		}
	}

	/*
	�����������
		1.��ȷ����ֵ����void
		2.��ȷ�����б�int [ ] arr
	*/
	public static void printArray(int [ ] arr) {
		for(int x = 0;x < arr.length;x++) {
			System.out.print(arr[ x ] + " ");
		}
	}
}