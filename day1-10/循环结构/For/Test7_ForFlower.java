/*For循环实现"水仙花数"
	1. 100-999
	2.获取每个位上的数的值(个,十,百)
	3.判断各个位上的立方和是否等于这个数,如果等于打印
*/
class Test7_ForFlower {
	public static void main(String[] args) {
		for(int i = 100;i <= 999;i++) {
			int units = i % 10;					//取个位数
			int tens = i / 10 %10;                    //取十位数
			int hundreds = i / 10 / 10 % 10;                    //取百位数
				if(units * units * units + tens * tens * tens + hundreds * hundreds * hundreds == i) {
				System.out.println(i);
			}
		}
	}
}