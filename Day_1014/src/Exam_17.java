import java.util.Scanner;

public class Exam_17 {

	public static void main(String[] args) {
		/*[ 문제-17 ] while문을 이용하여 올바른 값 입력 받기
		while문과 if문을 사용하여 정수를 입력 받되, 0미만의 값이나 
		100초과한 값이 입력되면 계속 다시 받는 프로그램을 작성하시오.
		단, 0이 입력되면 프로그램 종료

		<실행 결과>
		정수를 입력 : 123
		입력 값 오류
		정수를 입력 : -67
		입력 값 오류
		정수를 입력 : 70*/

		int value;
		Scanner sc = new Scanner(System.in);


		while(true) {
			System.out.print("정수를 입력: ");
			value = sc.nextInt();

			if(value == 0) break;
			if(value < 0 || value > 100) {
				System.out.println("입력값오류");

			}
		}
	}
}





