import java.util.Scanner;

/*한 과목의 점수를 입력 받은 후 합격 여부를 출력하는 프로그램을 작성하시오.

<조건>
70점 이상은 합격
50~69점은 재시험
50점 미만은 탈락

<실행결과>
점수 입력 : 75
합격입니다.

점수 입력 : 60
재시험입니다.

점수 입력 : 49
탈락입니다.*/

public class Exam_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		System.out.print("한과목의 점수을 입력하시오: ");
		a = sc.nextInt();
		
		if(a >= 70)
			System.out.println("합격입니다");
		else if (a >= 50 && a <=69)
			System.out.println("재시험입니다");
		else
			System.out.println("탈락입니다");
		
		

}
}
