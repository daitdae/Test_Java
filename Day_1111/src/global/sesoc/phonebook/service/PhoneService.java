package global.sesoc.phonebook.service;

import java.util.Map;

import global.sesoc.phonebook.vo.Phone;

public interface PhoneService {
	public boolean insert(Phone phone);//map에다 넣을거
	public Phone selectOne(String number);
	public boolean update(Phone phone); // 관계와 나이만 수정하기로 함
	public boolean delete(String number); //전화번호 및 밸류까지 삭제
	public Map<String, Phone> selectAll();
	
}
