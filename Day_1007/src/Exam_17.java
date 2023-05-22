import java.util.Scanner;

public class Exam_17 {

	public static void main(String[] args) {
		
		/*[ 문제-9 ] 자릿수 합계 구하기
		키보드로 0 부터 999까지의 정수를 입력 받은 수 
		각각의 자릿수의 합한 결과를 출력하는 프로그램을 작성하시오
		단,  사용자가 입력한 수는 999를 넘지 않는 것으로 한다.

		<실행결과>
		0~999까지의 정수입력 :456
		15

		0~999까지의 정수입력 :123
		6*/
		
		Scanner sc = new Scanner(System.in);
		
		int num, a, b, c, sum;
		System.out.println("세자리수를 넣어라: ");
		num = sc.nextInt();
		
		a = num/100;
		b = num%100/10;
		c = num%100%10;
		sum = a+b+c;
		
		System.out.println(sum);
	}

}
