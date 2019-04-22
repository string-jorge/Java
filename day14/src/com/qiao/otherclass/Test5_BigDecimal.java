package com.qiao.otherclass;

import java.math.BigDecimal;

public class Test5_BigDecimal {

	/**
	 * A:BigDecimal��ĸ���
	 * 		���������ʱ��,float���ͺ�double���ͺ����׶�ʧ����
	 * 		����,Ϊ���ܾ�ȷ�ı�ʾ,���㸡����,Java�ṩ��BigDecimal
	 * 
	 * 		���ɱ��,���⾫�ȵ��з���ʮ������
	 * B:���췽��
	 * 		public BigDecimal(String val)
	 * C:��Ա����
	 * 		public BigDecimal add(BigDecimal augend)
	 * 		public BigDecimal subtract(BigDecimal subtrahend)
	 * 		public BigDecimal multiply(BigDecimal multiplicand)
	 * 		public BigDecimal divide(BigDecimal divisor)
	 */
	public static void main(String[] args) {
		//���
		//System.out.println(2.0 - 1.1);//0.8999999999999999
		/*BigDecimal bd1 = new BigDecimal(2.0);//���ַ�ʽ�ڿ����в��Ƽ�,��Ϊ������ȷ
		BigDecimal bd2 = new BigDecimal(1.1);
		System.out.println(bd1.subtract(bd2));*/
		
		BigDecimal bd1 = new BigDecimal("2.0");//��ȷ,ͨ�������д����ַ����ķ�ʽ,����ʱ�Ƽ�
		BigDecimal bd2 = new BigDecimal("1.1");
		System.out.println(bd1.subtract(bd2));//0.9
		
		BigDecimal bd3 = BigDecimal.valueOf(2.0);//��ȷ,���ַ�ʽ�ڿ�����Ҳ���Ƽ���
		BigDecimal bd4 = BigDecimal.valueOf(1.1);
		System.out.println(bd3.subtract(bd4));//0.9
		
		//���
		System.out.println(bd1.add(bd2));//3.1
		
		System.out.println(bd3.add(bd4));//3.1
		
		//���
		System.out.println(bd1.multiply(bd2));//2.20
		System.out.println(bd3.multiply(bd4));//2.20
		
		//���
		BigDecimal bd5 = new BigDecimal("2.0");
		BigDecimal bd6 = new BigDecimal("1.0");
		System.out.println(bd5.divide(bd6));//2
		
		BigDecimal bd7 = BigDecimal.valueOf(2.0);
		BigDecimal bd8 = BigDecimal.valueOf(1.0);
		System.out.println(bd7.divide(bd8));//2
	}

}
