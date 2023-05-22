package global.sesoc.polygon;

public class MyRectangle extends MyPoint implements Calc {
	
	private int width;
	private int height;
	
	//기본생성자
	public MyRectangle() {
		super();
	}
	//전달받은 값 초기화
	public MyRectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public MyRectangle(int x, int y, int width, int height) { //잘안씀 그냥 편하게 하려고 한거
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
		return width*height;
	}
	@Override
	public String toString() {
		String temp = super.toString();
		String temp2 = String.format("%.2f", area());
		return  temp + ", width=" + width +", height=" + height 
				+" , area = " + temp2 ;
	}
	

}
