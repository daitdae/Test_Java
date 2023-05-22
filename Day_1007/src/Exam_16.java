import java.util.Scanner;

public class Exam_16 {

	public static void main(String[] args) {
		/*[ 문제-8 ] 나누어 떨어지는 수 구하기
		키보드로 정수를 입력 받아, 4와 5로 나누어 떨어지는 지의 여부를 구하는 프로그램을 작성하시오.

		<실행결과>
		정수입력 :45
		4와 5로 나누어 지지 않습니다.
		4또는 5로 나누어집니다.
		5로 나누어 집니다."

		정수입력 :20
		4와 5로 나누어 집니다.
		4또는 5로 나누어집니다.

		정수입력 :8
		4와 5로 나누어 지지 않습니다.
		4또는 5로 나누어집니다.
		4로 나누어 집니다.*/
		
		/*Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.print("정수입력 : ");
		num = input.nextInt();
		
		System.out.println("4와 5로 나누어집니다.");
		System.out.println((num%4==0)&&(num%5==0));
		
		System.out.println("4와 5로 나누어지지않습니다.");
		System.out.println((num%4!=0)&&(num%5!=0));
		
	    System.out.print("4 또는 5로 나누어지지않습니다 : ");
	    System.out.println((num % 4 == 0) ^ (num % 5 == 0));
	        
        System.out.print("③ 정수가 4 나 5로 나누어지지만 두 수 모두로는 나누어지지 않는가 : ");
        System.out.println((num % 4 == 0) ^ (num % 5 == 0));  */
		
		 int num;
	        
	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("정수 입력 : ");
	        num = input.nextInt();
	        
	        System.out.print("① 정수가 4 와 5로 나누어지는가 : ");
	        System.out.println((num % 4 == 0) && (num % 5 == 0));
	        
	        System.out.print("② 정수가 4 또는 5로 나누어지는가 : ");
	        System.out.println((num % 4 == 0) || (num % 5 == 0));
	        
	        System.out.print("③ 정수가 4 나 5로 나누어지지만 두 수 모두로는 나누어지지 않는가 : ");
	        System.out.println((num % 4 == 0) ^ (num % 5 == 0));
		
		
		  
	      
	        
	
	        
	          
		

	}

}
