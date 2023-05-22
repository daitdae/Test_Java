import java.util.Scanner;

public class Exam_08 {

	public static void main(String[] args) {
		// 저번주에 나온문제인데 다시한번 풀어보자 실제 기업입사문제, 어려움
		Scanner sc = new Scanner(System.in);
		
		int number;
		String and, or, result;
		boolean four, five, onlyOne;
		
		System.out.print("정수입력: ");
		number = sc.nextInt();
		
		four = number % 4 == 0;
		five = number % 5 == 0;
		onlyOne = (four && ! five) || (!four && five) ? true : false;
				  //4로만 나누어진다   5로만 나누어진다
		and = four && five ? "4와 5로 나누어집니다.":"4와 5로 나누어지지않습니다.";
		or = four || five ?"4또는 5로 나누어집니다.":"4또는 5로 나누어지지않습니다.";
		result = onlyOne && four ? "4로 나누어집니다.":"";
		result += onlyOne && five ? "\n5로 나누어집니다.":"";
		
		System.out.println(and);
		System.out.println(or);
		System.out.println(result);
				
		
		
				
		
		
	}

}
