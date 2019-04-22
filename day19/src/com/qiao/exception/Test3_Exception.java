package com.qiao.exception;

public class Test3_Exception {

	/**
	 * try...catch的方式处理多个异常
	 * JDK7以后处理多个异常的方式及注意事项
	 * 
	 * Android,客户端开发,如何处理异常?try{}catch(Exception){}
	 * JavaEE,服务器开发,一般都是底层开发,从底层向上抛
	 * 
	 * try后面跟多个catch,那么小的异常放在前面,大的异常放在后面,根据多态的原理,如果大的放在前面,就会将所得子类对象接收
	 * 后面的catch就没有意义了
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
			System.out.println("除数不能为零");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("索引越界了");
		} catch(NullPointerException e) {
			System.out.println("空指针异常");
		} */
		//JDK7如何处理多个异常
		catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e){
			System.out.println("出错了");
		} catch (Exception e) {
			System.out.println("出错了");
		}
		System.out.println("over");
	}

}
