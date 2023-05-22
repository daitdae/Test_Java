//[연습문제] 
//PolygonVO를 아래와 같이 설계하고 테스트하는 코드를 작성하시오
//(멤버변수)
//밑변 : width - double
//높이 : height - double
//반지름 : radius - double
//면적 : area - double
//다각형의 종류 : type - int
//    - 타입에는 1, 3, 4의 값만 넣을 수 있다.
//    - 1이면 원, 3이면 삼각형, 4라면 사각형

//오버로딩된생성자 Polygon(int, double, double) # 사각형이나 삼각형
//오버로딩된생성자 Polygon(int, double)  # 원
//세터, 게터,
//output()
//calcArea() :
//   - 원(타입이 1)이면 원의 면적을
//   - 삼각형(타입이 3) 이면 삼각형의 면적을
//   - 사각형(타입이 4) 면 사각형의 면적을 구하는 메소드

public class PolygonVO {

	//프라이빗 데이터 입력
	private int type;
	private double width;
	private double height;
	private double radius;
	private double area;

	//기본생성자
	public PolygonVO() {}

	//생성자 오버로딩
	public PolygonVO(int type,double width,double height,double radius) {
		this.type = type;
		this.width = width;
		this.height = height;
		this.radius = radius;
		calcArea();
	}
	//세터
	public void setType(int type) {
		this.type=type;
	}
	public void setWidth(double width) {
		this.width=width;
		calcArea();
	}
	public void setHeight(double height) {
		this.height=height;
		calcArea();
	}
	public void setRadius(double radius) {
		this.radius=radius;
		calcArea();
	}

	//게터
	public int getType() {
		return type;
	}
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return area;
	}

	//계산
	public void calcArea() {

		if(type==1) {
			this.area = radius*radius*3.14;
		} if(type==3) {
			this.area = width*height/2;
		} if (type==4) {
			this.area = width*height;
		} 
	}

	//출력
	public void output() {
		System.out.println(area);


	}
}
