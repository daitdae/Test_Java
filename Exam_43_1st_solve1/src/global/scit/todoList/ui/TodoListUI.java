package global.scit.todoList.ui;

import java.util.List;
import java.util.Scanner;

import global.scit.todoList.service.TodoListService;
import global.scit.todoList.vo.Personal;
import global.scit.todoList.vo.SigninInfo;
import global.scit.todoList.vo.Todo;

public class TodoListUI {
	Scanner keyin = new Scanner(System.in);
	TodoListService service = new TodoListService();

	public TodoListUI() {
		String choice = null;

		while(true) {
			mainMenu();
			choice = keyin.next();

			switch(choice) {
			case "1" :  // 로그인 선택
				boolean result = signin();
				if(result) break;
				else continue;
			case "2" :  // 회원가입 선택
				signup();
				continue;
			case "0" :	// 종료 선택
				System.out.println("** TodoList 프로그램을 종료합니다.");
				return;
			default : 
				System.out.println("** 메뉴 선택을 다시 해 주세요");
				continue;
			} // end switch

			while(true) {
				todoMenu();
				choice = keyin.next();

				switch(choice){
				case "1" : 
					todoInsert();
					continue;
				case "2" : 
					todoUpdate();
					continue;
				case "3" : 
					todoDelete();
					continue;
				case "4" : 
					selectTodoList();
					continue;
				case "5" : 
					findTodoListByType();
					continue;
				case "0" :
					signout(); 
					break;
				default : 
					System.out.println("** 메뉴를 다시 선택해 주세요");
					keyin.nextLine();
				} // end switch
				break;
			} // end inner while
		} // end outer while
	}

	//==================== [ Todo 관리 ] ======================
	// 1) todo 등록
	private void todoInsert() {
		String email, todo, temp, importance, categories;

		email = SigninInfo.email;
		
		System.out.println("\n>>>>>> todo 등록 <<<<<<");
		System.out.print("- 해야 할일 : ");
		keyin.nextLine(); // 버퍼 비우는 작업
		todo = keyin.nextLine();
		
		System.out.print("- 중요도 : (1. 높음  2. 보통  3. 낮음) : " );
		temp = keyin.next();
		
		switch(temp) {
		case "1" : importance="높음"; break;
		case "2" : importance="보통"; break;
		default  : importance="낮음"; break;
		}
		
		System.out.print("- (개인 / 회사): ");
		categories = keyin.next();
		
		if(!categories.equals("회사")) categories = "개인";
		
		Todo job = new Todo(0, email, null, todo, importance, categories);

		int result = service.insertTodo(job);
		
		if(result == 0) {
			System.out.println("** todo List 등록을 실패하였습니다.");
			return;
		}
		System.out.println("** 등록 완료!");
	}
	
	// 2) todo 수정
	private void todoUpdate() {
		String email, todo, temp, importance, categories=null;
		int seqno;
		
		email = SigninInfo.email;
		
		System.out.println("\n>>>>>> todo 수정 <<<<<<");

		List<Todo> list = service.selectTodoList(email, categories);
		
		if(list.size() == 0) {
			System.out.println("** todo 목록이 없습니다.");
			return;
		}
		
		for(Todo tmp : list) {
			System.out.println(tmp);
		}
		
		System.out.print("- 수정번호 선택: ");
		seqno = keyin.nextInt();
		
		System.out.print("- 중요도 : (1. 높음  2. 보통  3. 낮음) : " );
		temp = keyin.next();
		
		switch(temp) {
		case "1" : importance="높음"; break;
		case "2" : importance="보통"; break;
		default  : importance="낮음"; break;
		}
		
		System.out.print("- (개인 / 회사): ");
		categories = keyin.next();
		
		if(!categories.equals("회사")) categories = "개인";
		
		Todo job = new Todo(seqno, email, null, null, importance, categories);

		int result = service.updateTodo(job);
		
		if(result == 0) {
			System.out.println("** todo List 수정을 실패하였습니다.");
			return;
		}
		System.out.println("** 수정 완료!");
	}
	
	// 3) todo 삭제
	private void todoDelete() {
		String email, categories;

		email = SigninInfo.email;
		
		System.out.println("\n>>>>>> todo 삭제 <<<<<<");
		
		System.out.print("- 개인 / 회사 : ");
		categories = keyin.next();
		
		if(!categories.equals("회사")) categories = "개인";
		
		List<Todo> list =  service.selectTodoList(email, categories);
		
		if(list.size() == 0) {
			System.out.println("** Todo 정보가 없습니다.");
			return;
		}
		
		for(Todo data : list) {
			System.out.println(data);
		}
		
		int seqno;
		System.out.print("- 삭제할 todo 번호를 입력하세요 : ");
		seqno = keyin.nextInt();
		
		int result =  service.deleteTodo(seqno, email);
		if(result == 0) {
			System.out.println("** todo List 삭제를 실패하였습니다.");
			return;
		}
		System.out.println("** 삭제 완료!");
		
	}
	
	// 4) 전체 todo 목록 조회 (5점)
	private void selectTodoList() {
		System.out.println("\n>>>>>> 전체 todo List 조회 <<<<<<");
		
		String email = SigninInfo.email;  // 로그인한 회원의 정보(SigninInfo 클래스)에 저장된 이메일을 가져온다.
		
		List<Todo> list = service.selectTodoList(email, null);
		
		for(Todo todo : list) {
			System.out.println(todo);
		}
	}
	
	// 5) 종류 별 todo 목록 조회 
	private void findTodoListByType() {
		System.out.println("\n>>>>>> 종류(개인/회사) 별 todo List 조회 <<<<<<");
		
		String email, categories;
		email = SigninInfo.email;
		
		System.out.print("- 개인 / 회사 : ");
		categories = keyin.next();
		
		if(!categories.equals("회사")) categories = "개인";
		
		List<Todo> list =  service.selectTodoList(email, categories);
		
		if(list.size() == 0) {
			System.out.println("** Todo 정보가 없습니다.");
			return;
		}
		
		for(Todo data : list) {
			System.out.println(data);
		}
	}
	
	//==================== [ 회원 관리 ] ======================
	// 1) 로그인
	private boolean signin() {
		System.out.println("\n>>>>>> 로 그 인 <<<<<<");
		
		String email, passwd;
		System.out.print("> Email : ");
		email = keyin.next();
		System.out.print("> Password : ");
		passwd = keyin.next();
		
		Personal p = new Personal(email, passwd, null);
		
		Personal p2 = service.findByEmail(p);
		
		if(p2 == null) {
			System.out.println("** 회원 정보가 없습니다.");
			return false;
		}
		
		SigninInfo.email   = p2.getEmail();
		SigninInfo.usrname = p2.getUsrname();
		
		System.out.println("** " + SigninInfo.usrname +"님, 로그인!");
		
		return true;
	}

	// 2) 회원가입
	private void signup() {
		System.out.println("\n>>>>>> 회원 가입 <<<<<<");
		String email, passwd, usrname;
		
		System.out.print("- Email : ");
		email = keyin.next();
		System.out.print("- Password : ");
		passwd = keyin.next();
		System.out.print("- 이름 : ");
		usrname = keyin.next();

		Personal p = new Personal(email, passwd, usrname);
		
		Personal person = service.findByEmail(p);

		if(person != null) {
			System.out.println("** 이미 등록된 정보입니다.");
			return;
		}
		
		int result = service.insertPerson(p);
		if(result == 0) {
			System.out.println("** 회원 가입에 실패하였습니다.");
			return;
		}
		System.out.println("** 회원가입 완료!");

	}
	
	// 3) 로그아웃
	private void signout() {
		// Code Here (3점)
		// 로그아웃 되었음을 알리는 메시지 출력 후
		// SigninInfo 클래스의 email, usrname 정보를 초기화한다. 
		System.out.println("** " + SigninInfo.usrname +"님, 로그아웃!");
		SigninInfo.email   = null;
		SigninInfo.usrname = null;
	}


	//==================== [ 메뉴 ] ======================
	// 1) 주메뉴 : 회원가입/ 로그인 
	private void mainMenu() {
		System.out.println("\n= [ 마스터 todo list ] =");
		System.out.println("       1. 로그인 ");
		System.out.println("       2. 가  입");
		System.out.println("       0. 종  료");
		System.out.println("==========================");
		System.out.print  ("       > 선택 : ");
	}

	// 2) 부메뉴
	private void todoMenu() {
		System.out.println("\n= [ 마스터 todo list ] =");
		System.out.println("   1. todo 등록");
		System.out.println("   2. todo 수정");
		System.out.println("   3. todo 삭제");
		System.out.println("   4. 전체 todo List 조회");
		System.out.println("   5. 종류(개인/회사) 별 todo List 조회");
		System.out.println("   0. 로그아웃");
		System.out.println("==========================");
		System.out.print  ("      > 선택 : ");		
	}
}
