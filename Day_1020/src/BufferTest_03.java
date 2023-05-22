import java.util.Scanner;

public class BufferTest_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1, str2;
		int value;
		//nextLine(), nextInt()
		while(true) {
			System.out.print("이름:"); //nextLine()
			// 2번째 이후는 키보드로 입력 불가 ==> 이전루프에서 nextInt가 남긴 엔터 때문에
			// 그래서 밑에 sc.nextLine을 다시 넣어서 버퍼를 지워줘야한다.
			// 버퍼는 nextLine이 지운다
			str1 = sc.nextLine();	   
			
			System.out.print("번호:"); //nextInt()
			value = sc.nextInt(); 
			sc.nextLine();  //버퍼 비우는 동작
			
			System.out.println("데이터:" +str1+", "+value);
		}

	}

}
