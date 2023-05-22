import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest_04 {

	public static void main(String[] args) throws Exception {

		int[]ary = new int[5];

		Scanner sc = new Scanner(System.in);

		try {
			for(int i=0; i<ary.length; ++i) {
				System.out.print("정수입력: ");

				//				try {						//이것도 괜찮음
				ary[i] = sc.nextInt();
				//				} catch(InputMismatchException e) {
				//					System.out.println("잘못된 문자열이 입력되었습니다.");
				//					sc.nextLine();
				//					continue; }
				if(!(ary[i]>=10 && ary[i]<=20)) {
					throw new Exception("입력값이 범주(10~20)을 벗어났습니다");
				}
			}


		} catch(InputMismatchException e) {
			System.out.println("잘못된 문자열이 입력되었습니다.");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

//10~20범주면 if넣어야할거같은데 어떻게 넣어야할지 모르겠다 확인해보자
//if는 입력받고 바로 확인하면 됨
