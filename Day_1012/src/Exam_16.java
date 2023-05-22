import java.util.Scanner;
//오름차순
public class Exam_16 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, temp;
		
		System.out.print("1번 정수: ");
		a = sc.nextInt();
		System.out.print("2번 정수: ");
		b = sc.nextInt();
		System.out.print("3번 정수: ");
		c = sc.nextInt();
		
		if(a < b) {
			temp = a;
			a = b;
			b = temp;
		} 
		
		if(a < c) {
			temp = a;
			a = c;
			c = temp;
		}
		
		if(b > c) {
			temp = b;
			b = c;
			c = temp;
		}
		System.out.println(a+","+ b +","+c);
				
	}

}
