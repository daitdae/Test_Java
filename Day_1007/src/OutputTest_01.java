import java.util.Scanner;

public class OutputTest_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x;
		double y;
		String str;
		
		System.out.print("정수 입력: ");  //%d
		x = scanner.nextInt();
		
		System.out.print("실수 입력: "); //%f
		y = scanner.nextDouble();
		
		System.out.print("문자열 입력: "); //%s
		str = scanner.next(); //nextLine():줄단위 next(): 단어단위
		
		System.out.printf("%d %f %n %s", x, y, str);  
		//%n은 뒤에거를 줄바꿈  ,입력문 빼먹음 안됨

	}

}
