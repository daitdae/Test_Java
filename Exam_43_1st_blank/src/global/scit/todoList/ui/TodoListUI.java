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
			case "1" :  // �α��� ����
				boolean result = signin();
				if (result) break;
				else continue;
			case "2" :  // ȸ������ ����
				signup();
				continue;
			case "0" :	// ���� ����
				System.out.println("** TodoList ���α׷��� �����մϴ�.");
				return;
			default : 
				System.out.println("** �޴� ������ �ٽ� �� �ּ���");
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
					System.out.println("** �޴��� �ٽ� ������ �ּ���");
					keyin.nextLine();
				} // end switch
				break;
			} // end inner while
		} // end outer while
	}

	//==================== [ Todo ���� ] ======================
	// 1) todo ���
	private void todoInsert() {
		String email, todo, temp, importance, categories;

		email = SigninInfo.email;
		
		System.out.println("\n>>>>>> todo ��� <<<<<<");
		System.out.print("- �ؾ� ���� : ");
		keyin.nextLine();
		todo = keyin.nextLine();
		
		System.out.print("- �߿䵵 : (1. ����  2. ����  3. ����) : " );
		temp = keyin.next();
		
		switch(temp) {
		case "1" : importance="����"; break;
		case "2" : importance="����"; break;
		default  : importance="����"; break;
		}
		
		System.out.print("- (���� / ȸ��): ");
		categories = keyin.next();
		
		if(!categories.equals("ȸ��")) categories = "����";
		
		Todo job = new Todo(0, email, null, todo, importance, categories);

		int result = service.insertTodo(job);
		
		if(result == 0) {
			System.out.println("** todo List ����� �����Ͽ����ϴ�.");
			return;
		}
		System.out.println("** ��� �Ϸ�!");
	}
	
	// 2) todo ����
	private void todoUpdate() {
		String email, todo, temp, importance, categories=null;
		int seqno;
		
		email = SigninInfo.email;
		
		System.out.println("\n>>>>>> todo ���� <<<<<<");

		List<Todo> list = service.selectTodoList(email, categories);
		
		if(list.size() == 0) {
			System.out.println("** todo ����� �����ϴ�.");
			return;
		}
		
		for(Todo tmp : list) {
			System.out.println(tmp);
		}
		
		System.out.print("- ������ȣ ����: ");
		seqno = keyin.nextInt();
		
		System.out.print("- �߿䵵 : (1. ����  2. ����  3. ����) : " );
		temp = keyin.next();
		
		switch(temp) {
		case "1" : importance="����"; break;
		case "2" : importance="����"; break;
		default  : importance="����"; break;
		}
		
		System.out.print("- (���� / ȸ��): ");
		categories = keyin.next();
		
		if(!categories.equals("ȸ��")) categories = "����";
		
		Todo job = new Todo(seqno, email, null, null, importance, categories);

		int result = service.updateTodo(job);
		
		if(result == 0) {
			System.out.println("** todo List ������ �����Ͽ����ϴ�.");
			return;
		}
		System.out.println("** ���� �Ϸ�!");
	}
	
	// 3) todo ����
	private void todoDelete() {
		String email, categories;

		email = SigninInfo.email;
		
		System.out.println("\n>>>>>> todo ���� <<<<<<");
		
		System.out.print("- ���� / ȸ�� : ");
		categories = keyin.next();
		
		if(!categories.equals("ȸ��")) categories = "����";
		
		List<Todo> list =  service.selectTodoList(email, categories);
		
		if(list.size() == 0) {
			System.out.println("** Todo ������ �����ϴ�.");
			return;
		}
		
		for(Todo data : list) {
			System.out.println(data);
		}
		
		int seqno;
		System.out.print("- ������ todo ��ȣ�� �Է��ϼ��� : ");
		seqno = keyin.nextInt();
		
		int result =  service.deleteTodo(seqno, email);
		if(result == 0) {
			System.out.println("** todo List ������ �����Ͽ����ϴ�.");
			return;
		}
		System.out.println("** ���� �Ϸ�!");
		
	}
	
	// 4) ��ü todo ��� ��ȸ (5��)
	private void selectTodoList() {
		System.out.println("\n>>>>>> ��ü todo List ��ȸ <<<<<<");
		
		String email;  // �α����� ȸ���� ����(SigninInfo Ŭ����)�� ����� �̸����� �����´�.
		
		// Code Here
	
	}
	
	// 5) ���� �� todo ��� ��ȸ 
	private void findTodoListByType() {
		System.out.println("\n>>>>>> ����(����/ȸ��) �� todo List ��ȸ <<<<<<");
		
		// email : �α����� ȸ���� ����(SigninInfo Ŭ����)�� ����� �̸����� �����´�.
		// categories : Ű����κ��� �Է¹޴´�. "ȸ��"��� �Էµ��� �ʴ� ��� ���� "����" ������ ġȯ�Ѵ�.
		String email, categories;

		// Code Here (10��) 
	}
	
	//==================== [ ȸ�� ���� ] ======================
	// 1) �α���
	private boolean signin() {
		System.out.println("\n>>>>>> �� �� �� <<<<<<");
		
		String email, passwd;
		
		// Code Here (10��) 
		// email, passwd�� �Է¹޾� DB���� ��ȸ�� �� ��ȸ�� ����� ������ true, �ƴϸ� false ��ȯ 
		
		return true;
	}

	// 2) ȸ������
	private void signup() {
		System.out.println("\n>>>>>> ȸ�� ���� <<<<<<");
		String email, passwd, usrname;
		
		System.out.print("- Email : ");
		email = keyin.next();
		System.out.print("- Password : ");
		passwd = keyin.next();
		System.out.print("- �̸� : ");
		usrname = keyin.next();

		Personal p = new Personal(email, passwd, usrname);
		
		Personal person = service.findByEmail(p);

		if(person != null) {
			System.out.println("** �̹� ��ϵ� �����Դϴ�.");
			return;
		}
		int result = service.insertPerson(p);
		if(result == 0) {
			System.out.println("** ȸ�� ���Կ� �����Ͽ����ϴ�.");
			return;
		}
		System.out.println("** ȸ������ �Ϸ�!");

	}
	
	// 3) �α׾ƿ�
	private void signout() {
		// Code Here (3��)
		// �α׾ƿ� �Ǿ����� �˸��� �޽��� ��� ��
		// SigninInfo Ŭ������ email, usrname ������ �ʱ�ȭ�Ѵ�. 
	}


	//==================== [ �޴� ] ======================
	// 1) �ָ޴� : ȸ������/ �α��� 
	private void mainMenu() {
		System.out.println("\n= [ ������ todo list ] =");
		System.out.println("       1. �α��� ");
		System.out.println("       2. ��  ��");
		System.out.println("       0. ��  ��");
		System.out.println("==========================");
		System.out.print  ("       > ���� : ");
	}

	// 2) �θ޴�
	private void todoMenu() {
		System.out.println("\n= [ ������ todo list ] =");
		System.out.println("   1. todo ���");
		System.out.println("   2. todo ����");
		System.out.println("   3. todo ����");
		System.out.println("   4. ��ü todo List ��ȸ");
		System.out.println("   5. ����(����/ȸ��) �� todo List ��ȸ");
		System.out.println("   0. �α׾ƿ�");
		System.out.println("==========================");
		System.out.print  ("      > ���� : ");		
	}
}
