//匿名内部类重写多个方法调用
class Test7_NoNameInnerClass 
{
	public static void main(String[] args) 
	{
		Outer o = new Outer();
		o.method();
	}
}

interface Inter {
	void show1();
	void show2();
}
//匿名内部类只针对重写一个方法时候使用
class Outer {
	public void method() {
		/*new Inter() {
			public void show1() {
				System.out.println("show1");
			}

			public void show2() {
				System.out.println("show2");
			}
		}.show1();

		new Inter() {
			public void show1() {
				System.out.println("show1");
			}

			public void show2() {
				System.out.println("show2");
			}
		}.show2();*/

		Inter i = new Inter() {
			public void show1() {
				System.out.println("show1");
			}

			public void show2() {
				System.out.println("show2");
			}

			/*public void show3() {							//匿名内部类,子类有自己独有的方法
				System.out.println("show3");
			}*/
		};

		i.show1();
		i.show2();
		//i.show3();										//错误,匿名内部类是不能向下转型的,因为没有子类类名
	}
}