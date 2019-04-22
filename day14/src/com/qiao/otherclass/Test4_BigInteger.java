package com.qiao.otherclass;

import java.math.BigInteger;

public class Test4_BigInteger {

	/**
	 * A:BigInteger��ĸ���
	 * 		�����ó���Integer��Χ�ڵ����ݽ�������
	 * B:���췽��
	 * 		public BigInteger(String val)
	 * C:��Ա����
	 * 		public BigInteger add(BigInteger val):���
	 * 		public BigInteger subtract(BigInteger val):���
	 * 		public BigInteger multiply(BigInteger val):���
	 * 		public BigInteger divide(BigInteger val):���
	 * 		public BigInteger[] divideAndRemainder(BigInteger val)
	 */
	public static void main(String[] args) {
		//long num = 12345678998765432112L;//װ������
		//String s = "12345678998765432112";//���ᱨ��
		
		BigInteger bi1 = new BigInteger("100");
		BigInteger bi2 = new BigInteger("2");
		
		//���
		System.out.println(bi1.add(bi2));//bi1 + bi2 = 102
		
		//���
		System.out.println(bi1.subtract(bi2));//bi1 - bi2 = 98
		
		//���
		System.out.println(bi1.multiply(bi2));//bi1 * bi2 = 200
		
		//���
		System.out.println(bi1.divide(bi2));//bi1 / bi2 = 50
		
		//ȡ����������
		BigInteger[] arr = bi1.divideAndRemainder(bi2);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);//����50,����0
		}
	}

}
