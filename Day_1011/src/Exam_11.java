import java.util.Scanner;

public class Exam_11 {

	public static void main(String[] args) {
		// 10월7일 마지막문제
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, temp;
		
		System.out.println("첫번째 수: ");
		a = sc.nextInt();
		System.out.println("두번째 수: ");
		b = sc.nextInt();
		System.out.println("세번째 수: ");
		c = sc.nextInt();
		
		//a가 b보다 큰값을 가지도록 정렬
		/*a 10 b 20 입력했다면
		temp = 10 a = 10 b = 20
		temp = 10 a = 20 b = 20
		temp = 10 a = 20 b = 10*/
		
		temp = (b > a) ? a : 0; //둘중 작은값이 temp
		a = (temp != 0)? b : a; // !=0 의 뜻은 0이아닌값
		b = (temp != 0)? temp : b;
		
		temp = 0;
		
		temp = (c > a) ? a : 0;
		a = (temp != 0)? c : a; 
		c = (temp != 0)? temp : c;
		
		temp = 0;
		//b가 c보다 큰값을 가지도록 정렬
		temp = (c > b) ? b : 0;
		b = (temp != 0)? c : b; 
		c = (temp != 0)? temp : c;
		
		System.out.println(a +"," + b + "," + c);
		
		
		
		
		

	}

}
