//��ά����ı���
class Test4_Array {
	public static void main(String[] args) {
		int [ ] [ ] arr ={ {1,2,3},{4,5},{6,7,8,9} };

		for(int x = 0;x < arr.length;x++) {			//��ȡ��û����ά�����е�ÿ��һά����
			for(int y = 0; y < arr [x].length;y++) {			//��ȡÿ��һά�����е�ÿ��Ԫ��
				System.out.print(arr[x][y] + " ");
			}
			System.out.println();
		}
	}
} 