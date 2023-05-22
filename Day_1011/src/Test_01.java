import java.util.Scanner;

/* 정수를 입력받아 홀수인지 짝수인지 판별하는 프로그램을 작성
 * 실행결과
 * 정수입력: 15
 * 15는 홀수
 * 
 * 정수입력: 22
 * 22는짝수
 */
public class Test_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.print("정수입력:");
		a = sc.nextInt();
		
		if(a%2==0)
		System.out.print(a+"는 짝수");
		 else 
		System.out.print(a+"는 홀수");
		
	}

}
