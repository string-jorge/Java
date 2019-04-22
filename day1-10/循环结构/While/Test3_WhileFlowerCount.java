class Test3_WhileFlowerCount {
	public static void main(String[] args) {
		int count = 0;
		int i = 100;
			while(i <= 999) {
			int units = i %10;
			int tens = i / 10 % 10;
			int hundreds = i / 10 / 10 % 10;
			if(units * units * units + tens * tens * tens + hundreds * hundreds * hundreds == i) {
				count++;
			}
			i++;
		}
		System.out.println("count = " + count);
	}
}