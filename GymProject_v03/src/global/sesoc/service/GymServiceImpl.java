package global.sesoc.service;

import java.util.ArrayList;
import java.util.List;

import global.sesoc.vo.GymVO;

public class GymServiceImpl implements GymService {

	List<GymVO>list = new ArrayList<>();

	@Override
	public boolean insert(GymVO vo) {
		//		boolean result = list.add(vo);  //원래코드
		//		return result;

		return list.add(vo);			//USRID 유일하다 //축약형
	}

	@Override
	public GymVO selectOne(String id) {		
		for(int i=0; i<list.size(); ++i) {	//찾는 코드 //list size만큼 돌린다
			//			GymVO vo = list.get(i);
			//			if(vo.getUsrid().equals(id)) {
			//				return vo;
			//			}
			if(list.get(i).getUsrid().equals(id)) {		//축약한거
				return list.get(i);			//해당회원 return
			}
		}
		return null;						//찾으려는 회원이 없으면 null
	}

	@Override
	public boolean update(GymVO vo) {	//list.get(i)==> 찾은사람
		for(int i=0; i<list.size(); ++i) {
			if(list.get(i).getUsrid().equals(vo.getUsrid())) {
				//				double h = vo.getHeight();
				//				list.get(i).setHeight(h);
				list.get(i).setHeight(vo.getHeight());	//축약형
				list.get(i).setWeight(vo.getWeight());
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean delete(String id) {
		for(int i =0; i<list.size();++i) {
			if(list.get(i).getUsrid().equals(id)){
				list.remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<GymVO> selectALL() {

		return null;
	}

}
