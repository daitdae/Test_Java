import java.util.Scanner;

//[ 연습문제 ] 피트니스 프로그램을 참조하여 아래의 코드를 작성해보세요
//1) 애완동물 관리 프로그램을 작성하시오

//Service --> PetService.java
//1. 애완동물 등록
//2. 출력
//3. 종료
//

//<실행 예>
//=====PetShop====
//1.애완동물등록
//2.출력
//0.종료
//===============
//선택 : 1
//
//이름을 입력 해주세요. : 로키
//종류를 입력 해주세요. : 부엉이
//나이를 입력 해주세요. : 2
public class PetService {
	Scanner sc = new Scanner(System.in);
	Pet pet;

	//생성자
	public PetService() {
		String choice;

		while(true) {
			menu();
			choice = sc.next();

			switch(choice) {
			case"1": 
				this.register();
				break;
			case"2": 
				this.out();
				break;
			case"0": 
				System.out.println("프로그램을 종료합니다");
				return;
			}
		}
	}

	private void menu() {
		System.out.println("=====PetShop====");
		System.out.println("> 1 애완동물등록: ");
		System.out.println("> 2 출력: ");
		System.out.println("> 0 종료: ");

	}

	private void register() {
		String name;
		String kind;
		int age;

		System.out.println("이름을 입력 해주세요.: ");
		name=sc.next();
		System.out.println("종류를 입력 해주세요.: ");
		kind=sc.next();
		System.out.println("나이를 입력 해주세요.: ");
		age=sc.nextInt();
	}

	private void out() {
		
		pet.output();

	}

}
