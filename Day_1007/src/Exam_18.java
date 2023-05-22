import java.util.Scanner;

public class Exam_18 {

	public static void main(String[] args) {
		/*[문제-10] 실수령액 구하기
		기본급(pay)과 초과 근무 시간(time)을 입력 받아,
		실수령액(income)을 구하는 프로그램을 작성하시오.
		실수령액 = 기본급 + 시간수당 - 세금(기본급의 10%)
		시간수당 = 초과근무시간 X 15000

		<실행결과>
		기본급 입력 : 2340000
		초과근무시간 입력 : 40
		실수령액  : 2706000원*/
		
		Scanner sc = new Scanner(System.in);
		
		int pay, time;
		double income;
		
		System.out.print("기본급 : "); 
		pay = sc.nextInt();
		
		System.out.print("초과근무시간 : "); 
		time = sc.nextInt();
		
		income = (int)pay + (int)(time*15000) - (double)(pay*0.1);
		
		System.out.println("실수령액 : "+income);

	}

}
