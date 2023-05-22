import java.util.Scanner;

//Array Test 만드는 방법
public class ArrayTest_02 {

	public static void main(String[] args) {
		int[] a = new int[5]; // 정수배열 선언 a의 0번 방에서 4번까지 있는거
		char[] c = new char[20];
		double[] d = new double[10];
		String[] s = new String[20];
		
		
		int[] arr; //참조하고 있는건 없지만 참조 변수만
		arr = new int[100];
		
		System.out.println(a);    //위치값을 출력하란 얘기 hash값 출력
		System.out.println(a[0]); //배열은 초기화 안해도 0으로
		// a[0] ==> 인덱스 첨자(반드시 정수만 가능), 변수
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		//출력
		for(int i=0; i<a.length; ++i) {
			System.out.println(a[i]);
		}
			
		
		//입력
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<a.length; ++i)
			System.out.println(a[i]);
		
		System.out.println(a.length); //배열의 개수 확인방법
		for(int i=0; i<a.length; ++i) {
			
		}
		

	}

}
