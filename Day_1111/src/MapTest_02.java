import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest_02 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();


		map.put("1111", "홍길동");
		map.put("1112", "임꺽정");
		map.put("1113", "손오공");
		map.put("1114", "저팔계");
		map.put("1115", "사오정");

		if(map.containsKey("1114")) {
			System.out.println(map.get("1114"));
		} else {						//데이터값 없으면 false나옴
			System.out.println("데이터가 없습니다.");
		}

		//맵에서 키의 정보만 꺼내기 
		Set<String>set = map.keySet();

		//모든 키값을 출력하기(iterator 사용)
		Iterator<String>iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//전체를 순회할수 있는 방법(맵에선 전체 순환안됨) 
		//키만 먼저 꺼내고 그후에 맵데이터 꺼냄
		Iterator<String>itr = set.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			String value = map.get(key);
			System.out.println(key + " : " +value);
		}


	}

}
