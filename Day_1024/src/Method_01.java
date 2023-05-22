
public class Method_01 {

	public static void main(String[] args) {
		System.out.println("main method");
		//int value1=10, valu2=15; 이렇게 선언해서 밑으로 전달해도 됨
		
		//call by value 
		output(); //제어가 이동했다가 되돌아 옴 , 이게 call한거 
		add(10,20); /*add에 value 값을 대입해줘야한다. 변수의 개수만큼 값을 대입해줘야한다 value가 두개니깐
		            두개 대입*/
					//호출하는 쪽의 값: argument
		minus(50,30);
		
		System.out.println("End");
	}
	
	//int value1, value2: 매개변수(parameter)
	public static void add(int value1, int value2) {
		//int value1 = 10, value2 = 20; 지역변수
		int result = value1+value2;
		System.out.println("결과: " + result);
	}
	//main -> output-> end
	
	//method 정의
	public static void output() {
		System.out.println("output method");
		return;
	}
	
	//두개의 파라미터를 받는 minus라는 이름의 메소드를 정의 하시오
	public static void minus(int value1, int value2) {
		int result = value1-value2;
		System.out.println("결과: " + result);
	}
	
	
	
	
}
