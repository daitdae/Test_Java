import java.util.Scanner;

public class BufferTest_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1, str2;
		int value;
		//next(), nextLine(), nextInt(), nextDouble()
		while(true) {
			System.out.print("입력(정수):");
			value = sc.nextInt(); //문자를 입력하면 익셉션이 발생
			str1 = sc.next();
			str2 = sc.nextLine();
			System.out.println("데이터:" +value+", "+str1+str2);
		}

	}

}
