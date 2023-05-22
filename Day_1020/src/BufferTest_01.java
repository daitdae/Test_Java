import java.util.Scanner;

public class BufferTest_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		//next(), nextLine(), nextInt(), nextDouble()
		while(true) {
			System.out.print("입력:");
			//str = sc.next(); //단어(white space: 공백,탭, 엔터)
			str = sc.nextLine(); // 문장(버퍼데이터를 다 가져옴==> 버퍼가비게된다
			
			System.out.println("데이터:" +str);
		}

	}

}
