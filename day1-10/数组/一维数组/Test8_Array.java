//����Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)
class Test8_Array {
	public static void main (String[] args) {
		int [ ] arr = {10,20,30,40,50,60,70};
		int index = getIndex(arr,60);
		System.out.println(index);
	}	

/*
	����Ԫ������
	1.����ֵ����int
	2.��ȷ�����б�,int [ ] arr,int value
*/
	public static int getIndex(int [ ] arr,int value) {
		for (int x = 0;x < arr.length;x++) {
			if(arr[ x ] == value) {
				return x;
			}
		}
		return -1;
	}
}
