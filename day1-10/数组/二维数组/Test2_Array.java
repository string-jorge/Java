//��ά�����ʽ2
class Test2_Array {
	public static void main (String[] args) {
		int [ ] [ ] arr = new int [3] [ ];		//��ά��������3��һά����,����һά���鶼û�б���ֵ

		System.out.println(arr[ 0 ]);
		System.out.println(arr[ 1 ]);
		System.out.println(arr[ 2 ]);
		arr [ 0 ] = new int [ 3 ];		//��һ��һά�����п��Դ洢3��int���͵�ֵ
		arr [ 1 ] = new int [ 5 ];		//�ڶ���һά�����п��Դ洢5��int���͵�ֵ
		System.out.println("--------------------------------");
		System.out.println(arr[ 0 ]);
		System.out.println(arr[ 1 ]);
		System.out.println(arr[ 2 ]);

	}
}