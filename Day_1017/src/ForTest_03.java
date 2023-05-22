import java.util.Scanner; //다시 복습하기

public class ForTest_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int f=1, input, count=0; 
		System.out.print("10보다 작은 정수입력:");
		input = sc.nextInt();

		for(int i = 2; i<=input; ++i) {
			f=1;
			for(count = 1; count <= i; ++count) {
				f = f * count;

			}
			System.out.println(i+"!="+f);
		}

	}


}