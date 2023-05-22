import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class MapTest_01 {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();	//map 선언방법
		List<String> list = new ArrayList<>();
		
		System.out.println(map);	//{}
		System.out.println(list);	//[]
		
		//입력
		map.put("1111", "홍길동");
		map.put("1112", "손오공");
		map.put("1113", "저팔계");
		
		list.add("홍길동");
		list.add("손오공");
		list.add("저팔계");
		
		System.out.println(map);	//{1113=저팔계, 1112=손오공, 1111=홍길동}
		System.out.println(list);	//[홍길동, 손오공, 저팔계]
		
		//데이터를 꺼낼때
		System.out.println(map.get("1113"));
		System.out.println(list.get(2));
		
		//데이터를 삭제할때
		map.remove("1112");
		System.out.println(map.get("1112")); //데이터 삭제해서 나올게 없어서 null이 나옴
		list.remove("손오공"); //or list.remove(1);
		System.out.println(list.get(1)); //저팔계 나옴 삭제 후 빈칸 자동으로 채워줌
		
//		array list는 데이터 추가 이외에 다른게 좀 어려움 map은 crud중 rud가 편함
		
		
		map.put("1114", "사오정");
		map.put("1115", "임꺽정");
		map.put("1116", "삼  장");
		
		System.out.println(map.size());	//데이터가 몇개있니
		System.out.println(map.containsKey("1112")); //()안에 뭐가있니
		System.out.println(map.containsValue("저팔계")); //()안 값이 ㄴ있니
		System.out.println(map.isEmpty()); //데이터가 비어있니
		map.clear(); //맵안에있는걸 싹다 지우는거
		
		map.size();
		System.out.println(map.isEmpty()); 
		
		
		map.put("1111", "홍길동");
		map.put("1112", "손오공");
		map.put("1113", "저팔계");
		map.put("1114", "사오정");
		map.put("1115", "임꺽정");
		map.put("1116", "삼  장");
		
		map.put("1115", "강감찬");	//replace된 것처럼 동작
		System.out.println(map);
		
		//set(interface) <---HashSet(class)
		//set = 집합, 중복된 데이터를 허용하지 않는다
		//
		Set<String>set = new HashSet<>();
		set.add("아메리카노");
		set.add("카푸치노");
		set.add("더치커피");
		set.add("모카라떼");
		set.add("프라프치노");
		
		System.out.println(set.size());
		System.out.println(set);		//배열처럼 보이지만 배열 아님
		
		set.add("카푸치노");
		System.out.println(set.size());
		//동일한 데이터가 있기 때문에 삽입불가
		
		set.remove("더치커피");
		System.out.println(set);
		
		//전체 순회 가능
		Iterator<String>iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());	//데이터 끄집어 내는거
		}	//들어가고 나올때 순서 없음
		
		set.clear(); //데이터 다 날리는거
		
		
		
		
	}

}
