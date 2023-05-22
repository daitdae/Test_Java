package global.sesoc.phonebook.ui;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import global.sesoc.phonebook.service.PhoneService;
import global.sesoc.phonebook.service.PhoneServiceImpl;
import global.sesoc.phonebook.vo.Phone;

public class PhoneUI {

	Scanner sc = new Scanner(System.in);
	PhoneService service = new PhoneServiceImpl();

	//생성자
	public PhoneUI() {
		String choice;

		while(true) {
			menu();
			choice = sc.next();

			switch(choice) {
			case "1": insert();				break;		//입력
			case "2": selectOne();			break;		//전화번호 이용해 조회
			case "3": update();				break;		//데이터수정
			case "4": delete();				break;		//데이터 삭제
			case "5": selectAll();			break;		//전체 출력
			case "0":
				System.out.println("**프로그램을 종료합니다");
				System.exit(0);
			default:
				System.out.println("**메뉴를 다시 선택해 주세요");

			}
		}
	}

	private void menu() {
		System.out.println("===[전화번호부 관리]===");
		System.out.println("===[1.   등  록    ]===");
		System.out.println("===[2.   조  회    ]===");
		System.out.println("===[3.   수  정    ]===");
		System.out.println("===[4.   삭  제    ]===");
		System.out.println("===[5. 전 체 출 력 ]===");
		System.out.println("===[0.프로그램 종료]===");
		System.out.println("=======================");
		System.out.print(  "        > 선택 :       ");
		
		
	}
	
	//등록
	private void insert() {
		String number,name,relationship;
		int age;
		
		System.out.print("> 전화번호입력 : ");
		number = sc.next();
		System.out.print("> 이름 입력: ");
		name = sc.next();
		System.out.print("> 관계 입력: ");
		relationship = sc.next();
		System.out.println(">나이 입력: ");
		age = sc.nextInt();
	}
	
	//조회
	private void selectOne() {
		String number;
		System.out.print("> 조회할 전화번호");
		number = sc.next();
		
		Phone phone = service.selectOne(number);
		if(phone == null) {
			System.out.println("** 조회하려는 전화번호가 없음");
		}else
			System.out.println(phone);
		
	}

	private void update() {
		String number;
		String relationship;
		int age;
		
		System.out.print(">번호: ");
		number = sc.next();
		
		System.out.print("> 관계: ");
		relationship = sc.next();
		
		System.out.print("> 나이: ");
		age = sc.nextInt();
		
		Phone ph = new Phone(number,null,relationship,age);
		boolean result = service.update(ph);
		if(result) {
			System.out.println("수정완료");
		} else {
			System.out.println("수정오류");
		}
	}

	private void delete() {
		String number, answer;
	
		System.out.print("*전화번호: ");
		number = sc.next();
		
		System.out.print(">탈퇴하시겠습니까:");
		answer = sc.next();
		
		if(answer.equals("y")||answer.equals("Y")) {
			service.delete(number);
			System.out.println("탈퇴가완료되었습니다.");
		}	
	}

	private void selectAll() {
		Map<String, Phone> map = service.selectAll();
		if(map.size()==0) {
			System.out.println("**아무도 없습니다");
			return;
		}
		Set<String>keys = map.keySet();
		Iterator<String>iter = keys.iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(map.get(key));
		}
		
		
		
		
	}




}
