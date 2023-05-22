
public class OverloadingTest {

	public static void main(String[] args) {
		
		int a=10, b=20, c=30;
		double x =45.5, y=12.3;
		String s1 = "Hello",s2 = "world";
		
		int result = add(a,b); //메소드앞에는 반드시 어느 클래스에 있는건지 명시를 해줘야한다.
		add(x,y);
		add(a,b,c);
		String test = add(s1,s2);
		
	}
	// 메소드 오버로딩(Method Overloading) 
	// 메소드의 이름은 같고 매개변수의 타입이 달라야한다.()안 int a,int b 이런거 말하는거
	// 메소드의 이름은 같고 매개변수의 계수이 달라야한다.
	// 호출하는 측에서 구별해서 호출이 가능해야 한다.
	// 리턴타입(void 뭐 이런거)
	// 클래스의 생성자도 메소드의 일종이므로 오버로딩이 가능하다.
	public static int add(int a, int b) {
		return a+b;
	}
//	public static void add(int a, int b) {
//		int result = a + b;
//	}
	public static double add(double a, double b) {
		return a+b;
	}
	public static String add (String s1, String s2) {
		return s1+s2;
	}
	public static int add(int a, int b, int c) {
		return a+b+c;
	}
}
