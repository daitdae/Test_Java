package global.sesoc.polygon;

public class MyCircle extends MyPoint implements Calc {

	private int radius;

	public MyCircle() {
		super();					//x0, y0, r0 으로 초기화
	}
	public MyCircle(int radius) {
		super();					//x0, y0, 전달받은 r값 으로 초기화
		this.radius = radius;
	}
	public MyCircle(int x, int y, int radius) {
		super(x, y);				//부모의 기본생성자 호출되는 코드
		this.radius = radius;		//x--,y--,r--
	}
	
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	// 부모 클래스(Mypoint)의 세터 게터, toString
	// 부모 인터페이스(calc) area 


	@Override
	public double area() {
		return Math.PI * this.radius * this.radius;
	}
	
	@Override
	public String toString() {
		String temp = super.toString();
		String temp2 = String.format("%.2f", area());
		return temp + ", radius= " + radius+",area= "+temp2;

//		System.out.printf("%.2f",area); //소숫점 두자리까지
	}

}
