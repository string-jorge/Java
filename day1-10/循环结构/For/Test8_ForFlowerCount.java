//输出水仙花数的个数count
class Test8_ForFlowerCount {
	public static void main(String[] args) {
		int count = 0;
		for(int i = 100;i <= 999;i++) {
		int units = i %10;
		int tens = i / 10 % 10;
		int hundreds = i / 10 / 10 % 10;
			if(units * units * units + tens * tens * tens + hundreds * hundreds * hundreds == i) {
			count++;
			}
		}
		System.out.print(count);
	}
}