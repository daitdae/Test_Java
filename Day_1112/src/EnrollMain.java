
import java.util.Scanner;

public class EnrollMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Speakable[]s = new Speakable[2];

		System.out.println("Speaker 등록 메인 메뉴 입니다."
				+ "단 2명만 등록할 수 있습니다."
				+ "\n어떤 Speaker를 등록하는 지 선택하세요");

		System.out.println();
		
		for(int i=0; i<s.length; ++i) {
			System.out.println("1.Reader 등록 \n2.Worker 등록");
			int num = sc.nextInt();

			switch(num) {
			case 1 :
				System.out.println("이름을 입력하세요.");
				String n1 = sc.next();
				s[0] = new Reader(n1);
				break;

			case 2 :
				System.out.println("이름을 입력하세요.");
				String n2 = sc.next();
				s[1] = new Worker(n2);
				break;

			default : 
				System.out.println("선택오류");
			}
		}
		
		System.out.println("두 명 Speaker의 등록이 완료되었습니다."
				+ " 이제 Speaker들의 speak 실행 결과입니다.");

		System.out.println();

		for(int i=0; i<s.length; ++i) {
			System.out.println(s[i].speak());


		}
	}


}








