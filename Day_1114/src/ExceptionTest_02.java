import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int count=0;	//귤의 갯수를 세는 변수
		int weight=0;	//귤의 무게를 세는 변수

		while(true) {
			System.out.print("귤의 무게를 입력하시오:");
			try {
				weight = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("입력 오류");
				sc.nextLine();	//버퍼를 비운다
				continue;
			}

			if(weight>=10 && weight<=15) {
				++count;
			}	
			System.out.println(count+"개 포장완료");	
			//if랑 상관없이 나오게 하고싶어서 if밖으로 뺀다

			if(count == 5) {
				break;
			} 
		} 
		System.out.println("작업 끝!");
	}

}
