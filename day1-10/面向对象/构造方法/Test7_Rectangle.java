class Test7_Rectangle {
	public static void main (String[] args) {
		Rectangle r1 = new Rectangle();
		r1.setWidth(20);
		r1.setHeight(30);
		System.out.println("周长为" + (r1.getWidth() + r1.getHeight()) * 2);	//周长
		System.out.println("面积为" + r1.getWidth() * r1.getHeight());			//面积

		Rectangle r2 = new Rectangle(12,13);
		System.out.println("周长为" + r2.getGirth());							//周长
		System.out.println("面积为" + r2.getArea());							//面积
	}
}

class Rectangle {
	private int width;								//宽
	private int height;								//高

	public Rectangle() {}							//空参构造

	public Rectangle(int width,int height) {		//有参构造
		this.width = width;
		this.height = height;
	}

	public void setWidth(int width) {				//设置宽
		this.width = width;
	}

	public int getWidth() {							//获取宽
		return width;
	}

	public void setHeight(int height) {				//设置高
		this.height = height;
	}

	public int getHeight() {						//获取高
		return height;
	}

	public int getGirth() {							//求周长
		return (width + height) * 2;
	}

	public int getArea() {							//求面积
		return width * height;
	}
}