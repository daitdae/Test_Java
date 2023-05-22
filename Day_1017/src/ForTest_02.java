import java.util.Scanner;

public class ForTest_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int f=1, input, count=0; 
		System.out.print("10보다 작은 정수입력:");
		input = sc.nextInt();
		
		for(count = 1/*1순위*/; count<=input/*2순위*/; ++count/*4순위*/) {
			
			f = f*count;/*3순위*/
			
		}
		System.out.println(input+"!="+f);
	}

}
