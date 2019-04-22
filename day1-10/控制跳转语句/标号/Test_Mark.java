class Test_Mark {                                                                //mark  标记
	public static void main(String[] args) {
		outer : for (int x = 1;x  <= 10; x++){                                              //outer是标号,只要是合法的标识符即可
			System.out.println("x = " + x);
			inner : for(int y = 1;y <= 10;y++) {
				System.out.println("y = " + y);
				break outer;
			}
		}
	}
}