import java.util.Scanner;

/*1~n 까지의 자연수의 합계 구하기
키보드로부터 정수를 입력 받아 1에서부터 입력 받은 수까지의 
자연수의 합을 모두 구하여 출력하시오.

<실행 결과>
정수 입력 : 100
1~100까지 더한 값 : 5050
정수 입력 : 20
1~20까지 더한 값 : 210*/

public class Exam_21 {

	public static void main(String[] args) {
		
		int n, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력: ");
		n = sc.nextInt();
		
		for(int i=1; i<=n; ++i) {
			sum += i;
		}
		System.out.printf("1~%d까지 더한값: %d%n",n,sum);

	}

}
