import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FriendUI {

	Scanner sc = new Scanner(System.in);

	FriendList service = new FriendListImple();

	public FriendUI() {
		service.loadFile();
		String choice;

		while(true) {
			menu();
			choice = sc.next();

			switch(choice) {
			case"1":
				regist(); //회원등록
				break;
			case"2":
				findByName(); //검색
				break;
			case"3":
				delete(); //삭제
				break;
			case"4":
				findAll(); //전체출력
				break;
			case"9":
				service.saveFile();
				System.out.println("**프로그램 종료합니다");
				System.exit(0);
			default:
			}
		}
	}

	private void menu() {
		System.out.println("=== 전화번호 목록===");
		System.out.println("  1) 입 력");
		System.out.println("  2) 검 색");
		System.out.println("  3) 삭 제");
		System.out.println("  4) 전체 출력");
		System.out.println("  9) 종 료");
		System.out.println("--------------------");
		System.out.print(" 선택 : ");

	}

	private void regist() {
		String name, phone;

		System.out.println("<<<<< 친구 등록 >>>>>");

		System.out.print("- 이름: ");
		name = sc.next();

		System.out.print("- 전화번호:  ");
		phone = sc.next();
		if(service.selectOne(phone) !=null) {		
			System.out.println("** 동일한 전화번호가 존재합니다.");
			return;
		}

		Friend fr = new Friend(name, phone);
		boolean result = service.insert(fr);

		if(result) {
			System.out.println("** 한사람의 정보가 입력되었습니다");
		}	else {
			System.out.println("** 정보 입력 실패");
		}
	}

	private void findByName() {
		String name;

		System.out.print("- 검색할 친구의 이름 입력: ");
		name = sc.next();

		Friend fr = service.selectOne(name);
		if(fr==null) {
			System.out.println("** 검색된 이름이 없습니다.");
			return;
		}
		System.out.println("** 검색된 데이터 항목");
		fr.output();
	}

	private void delete() {
		String phone;

		System.out.print("-삭제할 친구의 전화번호 입력: ");
		phone = sc.next();

		Friend temp = service.selectOne(phone);
		if(temp == null) {
			System.out.println("** 삭제 실패 하였습니다.");
			return;
		}
		service.delete(phone);
		System.out.println("** 다음의 정보가 삭제 되었습니다");
		System.out.println(phone);
		return;
	}

	private void findAll() {
		List<Friend> list = service.selectALL();
		Iterator<Friend> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println("<<<<< 친구 목록 >>>>>");
			iter.next().output();
		}
	}

}
