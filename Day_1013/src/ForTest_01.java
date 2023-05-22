import java.util.Scanner;

//ctrl+a 전체선택 ctrl+i 자동들여쓰기
public class ForTest_01 {

	public static void main(String[] args) {
		//변수 i 는 for문 내부에서만 사용할 수 있는 지역변수다
		int i;
		for(i=0; i<10; ++i) {	//int i말고 그냥 i만쓰면 됨 왜냐 두번 선언해서 안됨
			System.out.println(i);
		}
		System.out.println("end: "+i);

		//2~20까지 짝수만 출력
		for(i=2; i<=20; i+=2) {
			System.out.println(i +" ");
		}

		System.out.println();

		//홀수만 출력
		for(i=1; i<=20; i+=2) {	
			System.out.println(i +" ");
		}

		System.out.println();

		//1~20까지 3이나 5의 배수만 출력
		for(i=1; i<=20; ++i) {
			if(i%3 == 0 || i%5 ==0) 
			System.out.println(i+"");
		}

		System.out.println();

		//정수변수 value 선언, 입력받는다
		//value는 100을 초과하거나 음수면 종료
		//value 소수인지 확인하여 "소수다","소수가 아니다.
		//1과 자기자신 나누어떨어지지 x
		int value;

		Scanner sc = new Scanner(System.in);
		System.out.print("100미만의 정수를 입력해라");
		value = sc.nextInt();

		if(value < 0 || value > 100) {
			System.out.println("잘못된값이 입력되었음!");
			System.exit(0);  //early stopping
		}
		
		for(i = 2; i < value; ++i) {
			if(value % i == 0) {
				System.out.println(value+"는소수가아님");
				System.exit(0);
			}
		}
		System.out.println(value+"는 소수다");

		/* 내가한거
		 * for(i=2; i<value; ++i) {
			if(value<100) {
				value = value%i==0 || value%(value-1)==0;
				System.out.println("소수다");
				System.exit(i);
			}

			System.out.println("소수가아니다");
		}*/




	}
}

