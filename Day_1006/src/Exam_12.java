
public class Exam_12 {

	public static void main(String[] args) {
		// 변수에 x에 임의의 정수값으로 초기화 시킨다.
		// 그 값이 홀수이면 "x는 홀수입니다."
		
		int x = 3;
		String msg;
		msg = (x % 2 == 0) ? "x는 짝수입니다.":"x는 홀수입니다.";
			System.out.println( x +"는" +msg);
	}

}
