import java.util.Scanner;

/*size라는 이름의 정수변수를 선언한후 정수를 입력받는다.
 * size는 정수배열의 크기이다
 * 배열에 자연수 1~방 크기값까지 넣어 출력하시오
 * 실행
 * 배열의 크기:10
 * arr[0]=1
 * arr[1]=2
 * arr[2]=3
 * ...
 * arr[9]=10*/
public class Exam_25 {

	public static void main(String[] args) {
		
		int[] size = new int[10];
		
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<size.length; ++i) {
			System.out.print("방입력: ");
			size[i] = sc.nextInt();
		}
		
		System.out.println("배열의 크기:"+ size.length);
		
		for(int i = 0; i<size.length; ++i) {
			
			System.out.println(size.length+"="+size[i]);
		}
		
		

	}

}
