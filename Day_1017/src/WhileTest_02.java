import java.util.Scanner;

//10보다 작은 정수값을 입력받아서 해당 값까지의 factorial 을 구하여 출력하시오
public class WhileTest_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int f = 1, input, count=0; //f:결과 f=f*count, input입력, 1~input까지 증가
		System.out.print("10보다 작은 정수입력:");
		input = sc.nextInt();
		
		while(count < input) {
			++count;					//증가하고나서
			f = f * count;				//곱함
		}
		System.out.println(input+"!="+f);
	
	}

}
