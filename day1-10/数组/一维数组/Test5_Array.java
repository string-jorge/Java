//��ȡ�����е���ֵ
class Test5_Array {
	public static void main(String[] args) {
		int [ ] arr = new int [ ] {10,51,231,32,13,123};
		int max = getMax(arr);
			System.out.println("max = " + max);
	}
	/*
	��ȡ�����е����ֵ
		1.��������int
		2.�����б�int [ ] arr
	*/
	public static int getMax (int [ ] arr) {
		int max = arr[ 0 ];
		for(int x = 1;x < arr.length;x++) {			//������ĵڶ���Ԫ�ؿ�ʼ����
			if (max < arr [ x ]) {				//���max��¼��ֵС�������е�Ԫ��
				max = arr [ x ];			//max��¼�ϴ��ֵ
			}
		}
		return max;
	}
}