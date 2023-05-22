import java.util.Scanner;

public class Test_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String choice;
		
		int a,b;
		
		System.out.print("숫자 1: ");
		a = sc.nextInt();
		System.out.print("숫자 2: ");
		b = sc.nextInt();

		System.out.print("1)덧셈 2)뺄셈 3)곱셈 4)나눗셈 5)나머지: ");
		choice = sc.next();

		switch (choice) {
		case"1": int result1;
			result1 = add(a,b);
			System.out.println(result1);break;
			
		case"2": int result2;
			result2 = minus(a,b);
			System.out.println(result2);break;
			
		case"3": int result3;
			result3 = multiply(a,b);
			System.out.println(result3);break;
			
		case"4": int result4;
			result4 = divide(a,b);
			System.out.println(result4);break;
			
		case"5": int result5; 
			result5 = mode(a,b);
			System.out.println(result5);break;

		}

	}

	public static int add(int a, int b) {
		return (int) a+b;
	}
	public static int minus(int a, int b) {
		return (int) a-b;
	}
	public static int multiply(int a, int b) {
		return (int) a*b;
	}
	public static int divide(int a, int b) {
		return (int) a/b;
	}
	public static int mode(int a, int b) {
		return (int) a%b;
	}

}
