package global.sesoc.ui;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import global.sesoc.service.GymService;
import global.sesoc.service.GymServiceImpl;
import global.sesoc.vo.GymVO;

public class GymUI {
	Scanner sc = new Scanner(System.in);
	GymService service = new GymServiceImpl(); //has-a관계

	//생성자
	public GymUI() {
		service.loadFile();					//생성자는 딱 한번만 호출되니깐 여기다 넣는다			
		String choice;

		while(true) {
			menu();
			choice = sc.next();

			switch(choice) {
			case"1":
				regist();		//회원 등록
				break;
			case"2":
				findById();		//회원 조회
				break;
			case"3":			//정보 수정
				update();
				break;
			case"4":
				delete();
				break;
			case"5":
				findAll();
				break;
			case"0":
				service.saveFile();
				System.out.println("**프로그램 종료합니다");
				System.exit(0);			//or return;
			default: 
			}
		}
	}

	//탈퇴
	private void delete() {		
		String usrid, answer;

		System.out.print("* 아이디: ");
		usrid = sc.next();

		GymVO temp = service.selectOne(usrid);
		if(temp==null) {			
			System.out.println("** id가 존재하지 않습니다.");
			return;
		}

		System.out.print("> 탈퇴하시겠습니까?  (Y,n)");
		answer= sc.next();
		if(!answer.equals("Y") || answer.equals("n")) {
			System.out.println("**작업이 취소되었습니다.");
			return;
		}
		if(answer.equals("n")) {
			System.out.println("**작업이 취소되었습니다.");
		}
		if(answer.equals("Y")) {
			service.delete(usrid);
			System.out.println("탈퇴가 완료되었습니다.");
			return;
		}


	}

	//회원의 몸무게와 키를 수정(키 몸무게 아이디 받아야한다)
	private void update() {
		String usrid;
		double weight, height;

		System.out.print("* 아이디: ");
		usrid = sc.next();

		GymVO temp = service.selectOne(usrid);
		if(temp==null) {			
			System.out.println("** id가 존재하지 않습니다.");
			return;
		}
		temp.output();


		System.out.print("* 몸무게(kg): ");
		weight = sc.nextDouble();

		System.out.print("* 키(cm): ");
		height = sc.nextDouble();

		GymVO vo = new GymVO(usrid, null, weight, height);
		boolean result = service.update(vo);

		if(result) {
			System.out.println("** 수정완료");
		} else {
			System.out.println("** 수정오류");
		}


	}

	//전체출력
	private void findAll() {
		List<GymVO> list = service.selectALL();
		if(list.size()==0) {
			System.out.println("**회원이 없습니다");
			return;
		}
		Iterator <GymVO> iter = list.iterator();	//회원정보 출력 코드
		while(iter.hasNext()) {
			iter.next().output();
		}

	}

	//회원검색
	private void findById() {	
		String usrid;

		System.out.print("* 아이디:  ");
		usrid = sc.next();

		GymVO vo= service.selectOne(usrid);
		if(vo==null) {
			System.out.println("**해당 아이디의 회원은 없습니다");
			return;
		}
		vo.output();
	}

	//회원 가입
	private void regist() {
		String usrid, usrname;
		double height = 0, weight = 0;

		System.out.print("* 아이디: ");
		usrid = sc.next();
		if(service.selectOne(usrid) !=null) {			//중복된 아이디 찾는 코드
			System.out.println("** 동일한 id가 존재합니다.");
			return;
		}

		System.out.print("* 이 름: ");
		usrname = sc.next();

		try {
			System.out.print("* 몸무게(kg): ");
			weight = sc.nextDouble();

			System.out.print("* 키(cm): ");
			height = sc.nextDouble();
		} catch(InputMismatchException e) {
			System.out.println("입력 오류");
			sc.nextLine();
			return;
		}

		GymVO vo = new GymVO(usrid, usrname, weight, height);
		boolean result = service.insert(vo);

		if(result) {
			System.out.println("** 가입 완료");
		} else {
			System.out.println("** 가입 실패");
		}
	}

	//메뉴 화면
	private void menu() {
		System.out.println("=======================");
		System.out.println("[피트니스클럽 회원관리]");
		System.out.println("   1.  등      록    ");
		System.out.println("   2.  조      회    ");
		System.out.println("   3. 정  보  수  정   ");
		System.out.println("   4.  탈      퇴    ");
		System.out.println("   5. 전  체  출  력   ");
		System.out.println("   0.  종      료    ");
		System.out.println("=======================");
		System.out.println("   >   선      택    ");
	}


}
