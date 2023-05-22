import java.util.Scanner;

public class Exam_10 {

	public static void main(String[] args) {
		// exam 18번 문제풀이
		
		Scanner sc = new Scanner(System.in);
		int basic, overTime;
		double total;
		
		System.out.println("기본급: ");
		basic = sc.nextInt();
		
		System.out.println("초과근무시간: ");
		overTime = sc.nextInt();
		
		total = basic * 0.9 + (overTime * 15000);
		System.out.printf("실수령액 : %,d원%n", (int)total);
		
		
	}

}
