/*
�ӿ�
	�ӿ��еı���ֻ���ǳ���public static final int num = 10�������Ǳ������ڳ������п����ǳ�����Ҳ�����Ǳ�����
	�ӿ��еĳ�Ա����ֻ���ǳ��󷽷����ڳ������п����ǳ��󷽷���Ҳ�����Ƿǳ��󷽷���
*/
class Test1_Interface 
{
	public static void main(String[] args) 
	{
		//Inter i = new Inter();			//�ӿڲ��ܱ�ʵ��������Ϊ���ó���û������
		Inter i = new Demo();				//��������ָ���������
		i.print();

		Demo d = new Demo();
		d.printNum();
		System.out.println(Inter.num);		//Inter.num���Ա����
	}
}

interface Inter								//�ӿ�
{
	public static final int num = 10;		//�ӿ��еı������ǳ���
	public abstract void print();			//�ӿ��еķ������ǳ����
	//public Inter() {}						//���󣬽ӿ���û�й��췽��
	//public void print() {}				//���󣬽ӿ��в��ܶ���ǳ��󷽷�
}

class Demo /*extends Object*/ implements Inter					//����ʵ�ֽӿڣ�һ������û�м̳��κ��࣬Ĭ�ϻ�̳�Object��
{
	public void print() {					//��д����ĳ��󷽷�
		System.out.println("print����");
	}

	public void printNum() {
		//num = 20;							//����int�ڽӿ���Ϊ�����������ٸ�ֵ
		System.out.println(num);
	}

	public Demo() {
		super();							//���ʸ���Object�ĳ�Ա����
	}
}