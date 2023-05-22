import java.util.Scanner;

public class EnrollMain_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice, name;
		Speakable[]man = new Speakable[2];

		System.out.println("Speaker 등록 메인 메뉴입니다. 단 2명만 등록할 수 있습니다.");
		System.out.println("어떤 Speaker를 등록하는 지 선택하세요");

		for(int i=0; i<man.length; ++i) {
			System.out.println("1. Reader 등록");
			System.out.println("2. Worker 등록");
			System.out.print("선택 : ");
			choice = sc.next();
			System.out.print("이름을 입력하세요 : ");
			name = sc.next();

			switch(choice) {
			case "1" : man[i]= new Reader(name); break; //upcasting
			case "2" : man[i]= new Worker(name); break;
			}
		}

		for(int i=0; i<man.length;++i){					//동적바인딩
			System.out.println(man[i].speak());
		}


	}

}
