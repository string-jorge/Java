/*Forѭ��ʵ��"ˮ�ɻ���"
	1. 100-999
	2.��ȡÿ��λ�ϵ�����ֵ(��,ʮ,��)
	3.�жϸ���λ�ϵ��������Ƿ���������,������ڴ�ӡ
*/
class Test7_ForFlower {
	public static void main(String[] args) {
		for(int i = 100;i <= 999;i++) {
			int units = i % 10;					//ȡ��λ��
			int tens = i / 10 %10;                    //ȡʮλ��
			int hundreds = i / 10 / 10 % 10;                    //ȡ��λ��
				if(units * units * units + tens * tens * tens + hundreds * hundreds * hundreds == i) {
				System.out.println(i);
			}
		}
	}
}