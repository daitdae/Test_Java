package global.master43.fitness.service;
import java.util.Scanner;
import global.master43.fitness.vo.GymVO;

public class GymService {

	Scanner sc = new Scanner(System.in);
	GymVO vo;

	//	생성자
	public GymService() {
		String choice;

		while(true) {
			menu();
			choice = sc.next();

			switch(choice) {
			case "1" :
				this.join();
				break;

			case "2" :
				this.update(); //키와 몸무게를 다시입력받아 세터로
				break;

			case "3" :
				this.delete();
				break;

			case "4" :
				this.retrieve();
				break;

			case "0" :
				System.out.println("**프로그램을 종료합니다.");
				return;
			default : 
				System.out.println("메뉴선택을 오류");
			}
		}
	}

	

	public void menu() {
		System.out.println("========[1인 피트니스 클럽]========");
		System.out.println("          1. 가      입          ");
		System.out.println("          2. 수      정          ");
		System.out.println("          3. 탈      퇴          ");
		System.out.println("          4. 조      회          ");
		System.out.println("          0.     끝              ");
		System.out.println("===================================");
		System.out.print  ("          > 선택 : ");
	}

	//가입
	private void join() {
		System.out.println("======[회원가입]======");

		int id;
		String name;
		double height,weight;

		if(vo !=null) {			//null 이유는 위에 vo 선언만했지 값없어서 null
			System.out.println("**가입을 할 수 없습니다.");
			return;
		}

		System.out.print("> 아이디 : ");
		id = sc.nextInt();
		System.out.print("> 이름 : ");
		name = sc.next();
		System.out.print("> 키(cm) : ");
		height = sc.nextDouble();
		System.out.print("> 몸무게(kg) : ");
		weight = sc.nextDouble();

		vo = new GymVO(id,name,height,weight);
		System.out.println("**회원가입이 완료되었습니다.");
		return;
	}
	
	private void update() {
		System.out.println("[수   정]");
		double height,weight;
		String answer;
		
		if(vo==null) {
			System.out.println("**수정할 수 없습니다.");
			return;
		}
		
		System.out.print("> 키(cm) : ");
		height = sc.nextDouble();
		System.out.print("> 몸무게(kg) : ");
		weight = sc.nextDouble();
		
		System.out.println("> 수정하시겠습니까? (y/n): ");
		answer=sc.next();
		if(!(answer.equals("y")||answer.equals("y"))) {
			System.out.println("**작업이 취소되었습니다.");
			return;
		}
		
		//setter를 통해 수정
		vo.setHeight(height);
		vo.setWeight(weight);
		
		System.out.println("**수정이 완료되었습니다.");
		return;
	}

	//탈퇴
	private void delete() {
		System.out.println("[탈   퇴]");
		String answer;

		if(vo==null) {
			System.out.println("** 탈퇴할 수 없습니다.");
			return;
		}
		
		System.out.print("> 탈퇴하시겠습니까? (y/n)");
		answer = sc.next();
		if(!answer.equals("y") || answer.equals("Y")) {
			System.out.println("**작업이 취소되었습니다.");
			return;
		}
		
		vo = null;				//실제 탈퇴 되는 코드 vo에 널 넣어줌
		System.out.println("**탈퇴 완료 되었습니다.");
		return;
	}






	//조회
	private void retrieve() {
		System.out.println("[조   회]");
		if(vo==null) {
			System.out.println("**조회할 수 없습니다.");
			return;
		}
		vo.output();
	}
}
