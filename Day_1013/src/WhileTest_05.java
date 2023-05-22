import java.util.Scanner;

public class WhileTest_05 {

	public static void main(String[] args) {
		// 1~9까지 출력하는 코드 변수는 i
		// 정수 value 변수와 Scanner 선언
		// value 변수에 정수를 입력받는다.
		// ex) 5를 입력했으면 위의 i변수와 함께 사용해서 구구단 5단 출력
		// 코드 잘기억하기
		
		Scanner sc = new Scanner(System.in);
		
		int i=0, value;
		
		System.out.println("정수입력: ");
		value = sc.nextInt();
		
		while (i<9) {
			++i;
			System.out.printf("%d X %d= %d%n", value, i, (i*value));
		}
		
	}

}
