import java.util.Scanner;

public class ArrayTest_03 {

	public static void main(String[] args) {
		//정수 5개 입력받아서 합과 평균구해라
		int[] a = new int[5];
		int total=0;
		double avg;
		
		//입력
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<a.length; ++i) {
			System.out.print("정수입력: ");
			a[i] = sc.nextInt();
		}
		//처리
		for(int i=0; i<a.length; ++i) {
			total = total +a[i];
		}
		
		avg = (double)total/a.length;
		
		//출력
		for(int i =0; i<a.length;++i) {
			System.out.println(a[i]+" ");
		}
		
		System.out.println("합계: "+total);
		System.out.println("평균: "+avg);
		
	}

}
