package global.sesoc.polygon;

public class MyTriangle extends MyPoint implements Calc {
	private int width;
	private int height;

	public MyTriangle() {
		super();   
	}
	public MyTriangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public MyTriangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public double area() {
		return this.width * this.height * 0.5;
	}

	@Override
	public String toString() {
		String temp  = super.toString();
		String temp2 = String.format("%.2f", area());
		return  temp + ", width=" + width +", height=" + height 
				+" , area = " + temp2 ;
	}

	

}
