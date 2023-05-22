package global.scit.todoList.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import global.scit.todoList.dao.TodoListDAO;
import global.scit.todoList.vo.Personal;
import global.scit.todoList.vo.Todo;

public class TodoListService {
	TodoListDAO dao = new TodoListDAO();
	
	// ȸ�� ����
	public int insertPerson(Personal person) {
		int result = dao.insertPerson(person);
		return result;
	}
	
	// ȸ�� ��ȸ (�α��ν�)
	public Personal findByEmail(Personal person) {
		Personal p = dao.findByEmail(person);
		return p;
	}

	// todo ���
	public int insertTodo(Todo job) {
		int result = dao.insertTodo(job);
		return result;
	}

	// todo ����
	public int updateTodo(Todo job) {
		int result = dao.updateTodo(job);
		return result;
	}

	// todo ����
	// ������ ���� ���������� ����� ����(seqno, email)�� Map ��ü�� ������ �� dao�� ����
	public int deleteTodo(int seqno, String email) {
		// Code Here
		
		return 0;
	}

	// todo List ��ȸ
	// ��ȸ�� ���� ���������� ����� ����(email, categories)�� Map ��ü�� ������ �� dao�� ����
	public List<Todo> selectTodoList(String email, String categories) {
		// Code Here
		
		return null;
	}
}
