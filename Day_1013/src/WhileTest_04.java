import java.util.Scanner;

public class WhileTest_04 {

	public static void main(String[] args) {
		String choice;  //0일때 종료 
		//while 안에 스위치를 써서 빠져나갈수도 있다 
		//단 프로그램 종료시키는 방법이 필요

		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("*메뉴를 선택: - 1) 입력: , 2)수정: , 0)종료: ");
			choice = sc.next();

			switch(choice){
			case "1" : 
				System.out.println("1을 선택");
				break;
			case "2" : 
				System.out.println("2를 선택");
				break;
			case "0" : 
				System.out.println("종료합니다.");
				System.exit(0);					//프로그램을 종료시키는 메소드
			default : 
				System.out.println("err> 선택오류");
			}
		}
	}

}
