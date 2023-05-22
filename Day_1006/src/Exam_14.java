import java.util.Scanner;

public class Exam_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int attend, it, japanese;
		double total;
		boolean result;
		
		System.out.print("출결점수:");
		attend = input.nextInt();
		
		System.out.print("IT 점수:");
		it = input.nextInt();
		
		System.out.print("일본어 점수:");
		japanese = input.nextInt();
		
		total = attend * 0.4 + it * 0.3 + japanese * 0.3;
		System.out.println("총점 : "+total);
		
		result = 70 <= (attend * 0.4 + it * 0.3 + japanese * 0.3);
		System.out.println("수료여부 : "+result);
		

	}

}
