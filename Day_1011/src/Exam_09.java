import java.util.Scanner;

public class Exam_09 {

	public static void main(String[] args) {
		// exam 17번 문제
		Scanner sc = new Scanner(System.in);
		
		int number, digit, decimal, hundred;
		
		System.out.print("0~999사이의 정수 : ");
		number = sc.nextInt();
		
		hundred = number / 100;
		decimal = number % 100  / 10;
		digit = number % 100 % 10;
		
		System.out.println(hundred+decimal+digit);
		
		
		
		
	}

}
