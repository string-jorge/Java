/*
��˾�����۶����
	��һ����:22,66,44
	�ڶ�����:77,33,88
	��������:25,45,65
	���ļ���:11,66,99
*/
class Test5_Array {
	public static void main(String[] args) {
		int arr [ ] [ ] = { {22,66,44},{77,33,88},{25,45,65},{11,66,99} };

		int sum = 0;						//�������,��¼ÿ����ӵĽ��
		for(int x = 0;x < arr.length;x++) {				//��ȡ��û����ά�����е�ÿ��һά����
			for(int y = 0; y < arr [x].length;y++) {			//��ȡÿ��һά�����е�ÿ��Ԫ��
				sum = sum + arr[ x ] [ y ];			//�ۼ�
			}
		}
		System.out.println(sum);
	}
}