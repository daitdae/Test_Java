package global.sesoc.service;

import java.util.List;
import global.sesoc.vo.GymVO;

public interface GymService {
	//crud
	/**
	 * 한명의 회원에 대한 정보를 전달받아 ArrayList에 저장
	 * @param vo: 회원 한 명의 정보가 담긴 객체
	 * @return: 저장완료 여부를 boolean으로 반환
	 */
	public boolean insert(GymVO vo);		//array list 만들기
	
	/**
	 * 사용자의 PK에 해당하는 id를 전달받아 해당 id의 사용자를 검색
	 * @param id: 회원의 id (PK)
	 * @return: id에 해당하는 회원정보를 검색한 후 결과를 반환
	 */
	public GymVO selectOne(String id);
	public boolean update(GymVO vo);
	public boolean delete(String id);
	public List<GymVO> selectALL();
}
