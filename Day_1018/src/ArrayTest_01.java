import java.util.Scanner;

public class ArrayTest_01 {

	public static void main(String[] args) {
		// 정수 변수 5개를 선언한 후 데이터를 입력받아 합계와 평균을 구하여 출력하시오
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, e, sum;
		double avg;

		System.out.print("정수입력:");
		a = sc.nextInt();
		System.out.print("정수입력:");
		b = sc.nextInt();
		System.out.print("정수입력:");
		c = sc.nextInt();
		System.out.print("정수입력:");
		d = sc.nextInt();
		System.out.print("정수입력:");
		e = sc.nextInt();


		sum = a+b+c+d+e;
		System.out.println("합계"+ sum);

		avg = sum/5.0;
		System.out.println("평균"+ avg);

	}

}
