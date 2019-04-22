package com.qiao.exception;

public class Test3_Exception {

	/**
	 * try...catch�ķ�ʽ�������쳣
	 * JDK7�Ժ������쳣�ķ�ʽ��ע������
	 * 
	 * Android,�ͻ��˿���,��δ����쳣?try{}catch(Exception){}
	 * JavaEE,����������,һ�㶼�ǵײ㿪��,�ӵײ�������
	 * 
	 * try��������catch,��ôС���쳣����ǰ��,����쳣���ں���,���ݶ�̬��ԭ��,�����ķ���ǰ��,�ͻὫ��������������
	 * �����catch��û��������
	 */
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int[] arr = {11,22,33,44,55};
		
		try{
			System.out.println(a / b);
			System.out.println(arr[10]);
			arr = null;
			System.out.println(arr[0]);
		} /*catch(ArithmeticException e) {
			System.out.println("��������Ϊ��");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("����Խ����");
		} catch(NullPointerException e) {
			System.out.println("��ָ���쳣");
		} */
		//JDK7��δ������쳣
		catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e){
			System.out.println("������");
		} catch (Exception e) {
			System.out.println("������");
		}
		System.out.println("over");
	}

}
