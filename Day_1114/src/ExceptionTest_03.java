import java.util.Scanner;

public class ExceptionTest_03 {

	public static void main(String[] args)  throws Exception {
		//try 코드 지저분 하면 메인에 그냥 throw넣어도 되는데 별로
		//좋은 방법이 아님

		Scanner sc = new Scanner(System.in);

		int x,y;

		System.out.print("두개의 정수를 입력하세요: ");
		x = sc.nextInt();
		y = sc.nextInt();

		//		try {
		//			int result = calc(x, y);
		//			System.out.println("결과 = "+result);
		//		} catch (Exception e) {
		//			System.out.println(e.getMessage());
		//			//e.printStackTrace();
		//		}

		int result = calc(x, y);
		//		System.out.println("결과 = "+result);
	}


	private static int calc(int x, int y) throws Exception {	
		//메인에서 호출했기 때문에 static
		//메소드 내부에서 발생한 익셉션을 호출했던 곳으로.. 익셉션 전가
		//기업에서 throw 와 throws의 차이 많이 물어봄
		//y는 0을 초과해야한다.
		if(y<=0) {
			throw new Exception("y는 0을 초과해야합니다");
			//			return 0; //좋은 리턴값이 아니다
		}
		return x+y;
	}

}
