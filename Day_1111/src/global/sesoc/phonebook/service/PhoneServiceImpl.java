package global.sesoc.phonebook.service;

import java.util.HashMap;
import java.util.Map;

import global.sesoc.phonebook.vo.Phone;

public class PhoneServiceImpl implements PhoneService {

	Map<String, Phone> map = new HashMap<>();

	@Override
	public boolean insert(Phone phone) {	//phone = key
		//전화번호를 뽑는다
		String key = phone.getPhone();

		//동일한 전화번호가 존재하는지 확인
		//데이터가 없으면 삽입, 있으면 삽입불가
		//get으로 데이터가 꺼내지면(not null)

		if(map.get(key) != null) {
			return false;
		}
		map.put(key, phone); //데이터 삽입
		return true;
	}

	@Override
	public Phone selectOne(String number) {			//검색
		return map.get(number);						//꺼내지면나오고 못꺼내지면 null
	}

	@Override
	public boolean update(Phone phone) {	//맵은 그냥 넣으면 replace되니깐 걍 뽑아서 삽입
		String key = phone.getPhone();		//전화번호를 꺼낸다
		map.put(key, phone);
		//		Phone p = map.put(key, phone);		없어도 됨
		//		if(p==null)return false;			없어도 됨
		return true;
	}

	@Override
	public boolean delete(String number) {

		map.remove(number);				//이것만 있으면 됨
		return false;

		//		Phone p = map.remove(number);	//잘 이해가 안가면 보자
		//		if(p !=null) return true;
		//		return false;

	}

	@Override
	public Map<String, Phone> selectAll() {
		return map;
	}

}
