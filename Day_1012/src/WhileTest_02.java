import java.util.Scanner;

//정수 2개를 입력받는다 이때 첫번째 정수는 두번째보다 작아야한다

public class WhileTest_02 {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		int start, end;
		
		System.out.print("숫자1:");
		start = sc.nextInt();
		System.out.print("숫자2:");
		end = sc.nextInt();
		
		while(start < end) {
			start+=1;
			System.out.println(start+" ");
		}*/
		
		Scanner sc = new Scanner(System.in);
		int start, end, cnt=1, temp;
		
		System.out.print("숫자 1: ");
		start = sc.nextInt();
		
		System.out.print("숫자 2: ");
		end = sc.nextInt();
		
		temp = start;
		while(temp <= end) {
			System.out.print(temp+ " ");
			temp++;
		}
		System.out.println();
		// V02
		temp = start;
		while(temp <= end) {
			System.out.print(temp+ " ");
			
			if(cnt % 5 ==0) System.out.println();
			temp++;cnt++;
		}
		System.out.println();
	}

}
