class Test_Mark {                                                                //mark  ���
	public static void main(String[] args) {
		outer : for (int x = 1;x  <= 10; x++){                                              //outer�Ǳ��,ֻҪ�ǺϷ��ı�ʶ������
			System.out.println("x = " + x);
			inner : for(int y = 1;y <= 10;y++) {
				System.out.println("y = " + y);
				break outer;
			}
		}
	}
}