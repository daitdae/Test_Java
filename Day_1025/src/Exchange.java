
public class Exchange {
  //double value = 34.5;	 //인스턴스 변수
	static double data = 25; //클래스 변수

	public static void main(String[] args) {
		
		int x=10, y=20;
		System.out.println("x = "+x+ ", y = " +y);
		
		//call by value :  원본 접근 불가
		exchange(x , y);
		System.out.println("exchange method");
		System.out.println("x = "+x+ ", y = " +y);
		System.out.println("인스턴스 변수 출력: " +data);
	}
	
	public static void exchange(int x, int y) {
		int temp;
		temp = x;	//temp x y 교환한거
		x = y;
		y = temp;
	}

}
