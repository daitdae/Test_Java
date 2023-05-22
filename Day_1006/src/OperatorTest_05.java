import java.util.Scanner;

public class OperatorTest_05 {

	public static void main(String[] args) {
		//키보드로부터 정수를 입력받아서 짝수인지 홀수인지 판별해라
		Scanner keyin = new Scanner(System.in);
		
		int a; //정수를 입력받아 저장할 변수
		
		System.out.print("정수를 입력해라: ");
		a = keyin.nextInt();
		
		System.out.println((a % 2 == 0) ? a+"짝수" : a+"홀수"); 
		
		/* 선언
		 * 입력
		 * 계산
		 * 출력*/
		
		
		

	}

}
