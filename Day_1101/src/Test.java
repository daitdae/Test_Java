import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		//스캐너 앞에 java.util이 생략된거, 위에 import를 해줘서 생략가능하게 만들어주는거
		System.out.println();
		//java.lang 내부에 선언된 클래스는 import를 안해도 된다 ex.system, math)
		
		// E 하고 PI constant(상수) 생긴건 변수인데 하는건 리터럴
		System.out.println(Math.PI);
		System.out.println(Math.E); //잘안씀
		
		//static double	abs(double a)
		double result = Math.abs(-45.67);  //절대값을  반환해주는 메소드
		System.out.println(result);
		
	
		
		

		

	}

}
