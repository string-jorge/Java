class Test3_�������� {
	public static void main(String[] args) 
	{
		����Ⱥ С���� = new ����Ⱥ();
		С����.�Թ�();
	}
}

abstract class ��������{							//������
	public abstract void �Թ�();					//���󷽷�,Ҫ���������������
}

class ����Ⱥ extends �������� {
	public void �Թ�() {
		System.out.println("����ǩ");
	}
}

class ��ƽ֮ extends �������� {
	public void �Թ�() {
		System.out.println("��ָ�׵�");
	}
}

class �������� extends �������� {
	public void �Թ�() {
		System.out.println("�ô���,����ֱ��");
	}
}