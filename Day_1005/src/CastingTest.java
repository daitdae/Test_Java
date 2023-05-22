
public class CastingTest {

	public static void main(String[] args) {
		
		
		int a;
		double result;
		a = 15;
		result = 15 * 1.7;  //프로그램안에서 15가 15.0으로 변환되면서 15.0 * 1.7이 된다 why? double이 int보다 크기때문
		
		int b;
		b = (int)12.7; // 앞에 괄호로 타입을 넣어서 강제로 형변환(casting), boolean 타입은 casting 불가
		
		// 작은-->큰
		// byte < short < int < long < float < double
		// int < float, long < float (바이트의 크기가 중요한게 아니라 안의 데이터 크기가 중요하다)
		// char short 메모리 크기가 같지만 char는 음수를 처리 할수 없어서 대소비교 불가
	}

}
