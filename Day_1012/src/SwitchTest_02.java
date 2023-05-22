import java.util.Scanner;

/*[연습문제-2] switch~case문을 이용한 연산
정수 2개, 연산자 1개를 입력받아
사칙연산을 수행하는 코드를 switch~case로 작성하시오

int value1, value2;
String operator;

<실행>
숫자 1 : 5
숫자 2 : 4
연산자(+ - * /) :  *

결과 : 5 * 4 = 20

숫자 1 : 5
숫자 2 : 4
연산자(+ - * /) : ^

연산자 오류*/

public class SwitchTest_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* 내가한거 
		int  value1, value2;
		String operator;
		
		System.out.print("숫자1 : ");
		value1 = sc.nextInt();
		System.out.print("숫자2 : ");
		value2 = sc.nextInt();
		System.out.print("문자열 : ");
		operator = sc.next();
		
		switch(operator) {
		case "+" : 
			System.out.println(value1+value2); break;
		case "-" : 
			System.out.println(value1-value2); break;
		case "*" : 
			System.out.println(value1*value2); break;
		case "/" :
			System.out.println(value1/value2); break;
		default : 
			System.out.println("연산자오류");
			} */
		
		int value1, value2;
		String operator, result = null;
		
		System.out.print("숫자1 : ");
		value1 = sc.nextInt();
		System.out.print("숫자2 : ");
		value2 = sc.nextInt();
		System.out.print("문자열 : ");
		operator = sc.next();
	
		switch(operator) {
		case "+" : 
			result = value1+"+"+value2+"="+(value1+value2); break;
		case "-" : 
			result = value1+"-"+value2+"="+(value1-value2); break;
		case "*" : 
			result = value1+"*"+value2+"="+(value1*value2); break;
		case "/" : 
			result = value1+"/"+value2+"="+(value1/value2); break;
		default : 
			result = "연산자 오류!";
		}
		System.out.println(result);
		
	}

}
