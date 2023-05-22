import java.util.Scanner;

public class InputTest_01 {

	public static void main(String[] args) {
		/* 세과목의 점수를 입력받는다.
		 * 모든과목이 70점이상이면 "수료가능" 아니면 수료 불가능*/
		
		Scanner keyin = new Scanner(System.in);
		
		int a, b, c;
		System.out.print("a과목의 점수를 입력해라.");
		a = keyin.nextInt();
		
		System.out.print("b과목의 점수를 입력해라.");
		b = keyin.nextInt();
		
		System.out.print("c과목의 점수를 입력해라.");
		c = keyin.nextInt();
		
		System.out.println((a >= 70 && b >= 70 && c >= 70) ? "수료가능":"수료불가능");
		
		

	}

}
