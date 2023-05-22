import java.util.Scanner;

public class Exam_15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a, b, c, avg;
		
		System.out.print("운영체제 과목 입력: "); 
		a = input.nextInt();
		
		System.out.print("네트워크 과목 입력 : "); 
		b = input.nextInt();
		
		System.out.print("데이터베이스 과목 입력 : "); 
		c = input.nextInt();
		
		avg = (a+b+c)/3;
		System.out.println("평균점 : "+ avg);
		
		System.out.println(80<=b && 70<=avg && 50<a && 50<b && 50<c ? "합격":"탈락");
	
	}

}
