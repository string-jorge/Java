class Test7_Rectangle {
	public static void main (String[] args) {
		Rectangle r1 = new Rectangle();
		r1.setWidth(20);
		r1.setHeight(30);
		System.out.println("�ܳ�Ϊ" + (r1.getWidth() + r1.getHeight()) * 2);	//�ܳ�
		System.out.println("���Ϊ" + r1.getWidth() * r1.getHeight());			//���

		Rectangle r2 = new Rectangle(12,13);
		System.out.println("�ܳ�Ϊ" + r2.getGirth());							//�ܳ�
		System.out.println("���Ϊ" + r2.getArea());							//���
	}
}

class Rectangle {
	private int width;								//��
	private int height;								//��

	public Rectangle() {}							//�ղι���

	public Rectangle(int width,int height) {		//�вι���
		this.width = width;
		this.height = height;
	}

	public void setWidth(int width) {				//���ÿ�
		this.width = width;
	}

	public int getWidth() {							//��ȡ��
		return width;
	}

	public void setHeight(int height) {				//���ø�
		this.height = height;
	}

	public int getHeight() {						//��ȡ��
		return height;
	}

	public int getGirth() {							//���ܳ�
		return (width + height) * 2;
	}

	public int getArea() {							//�����
		return width * height;
	}
}