import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice;
		
		while(true){											//무한루프
			System.out.print("1)입력 2)출력 3)삭제 4)수정 0)종료: ");
			choice = sc.next();
			
			switch(choice) {
			case "1" : input(); break; 
			case "2" : output(); break;
			case "3" : delete(); break;
			case "4" : update(); break;
			case "0" : 
				System.out.println("** 프로그램 종료!"); 
				return; //or system.exit
			default : System.out.println("** 메뉴를 다시 선택해주세요");
			}
		}
	}
	
	// return type = void 인 아래 4개의 메소드
	// 각 메소드 안에는 출력문 1개씩만 있음
	// input()  : "input" 이라고 출력하는 문장 하나만 있음
	// output() 
	// delete()
	// update()
	
	public static void input() {
		System.out.println("input");
	}
	public static void output() {
		System.out.println("output");
	}
	public static void delete() {
		System.out.println("delete");
	}
	public static void update() {
		System.out.println("update");
	}

}
