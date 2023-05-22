package global.sesoc.structure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// 배열 복습
public class ArrayTest_02 {
// insert(C), search(R), update(U), delete(D), selectAll
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("장미");
		list.add("코스모스");
		list.add("튤립");
		list.add("국화");

		//print out 밑의 출력과 같음(고전적 방법)
		for(int i=0; i<list.size(); ++i) 
			System.out.print(list.get(i)+" "); //get은 꺼내는거
//		System.out.println("\n");
		
		//delete
		String temp = list.remove(1); //지우는건 리스트.리무브
		System.out.println(temp);	  //템프는 지운게 템프에 있나 확인하기 위해 그냥 한거
		
		boolean result = list.remove("튤립");
		System.out.println(result);
//		삭제하면 알아서 땡겨오기 때문에 땡기는 작업 할 필요 없다
		
		// print out all 위의 출력과 같은거
		for(String data : list)
			System.out.print(data +" ");
		//System.out.println("\n");
		
		//장미-->수국 set(위치(0),데이터(수국))
		list.set(0, "수국");
		//print out
		for(String data : list)
			System.out.print(data +" ");
		
		//search하는 메소드, 데이터 위치와 데이터가 없을경우 -1 출력
		int index = list.indexOf("국화");
		System.out.println(index);
		
		//국화를 해바라기로 수정
		list.set(list.indexOf("국화"),"해바라기");
		for(String data : list)
			System.out.print(data +" ");
		System.out.println("\n");
		
		//전체 출력: 리스트 전체를 순회(Iterator)하는 객체로변환하여 출력
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {					//다음게 있냐고 물어보는거
			System.out.print(iter.next()+" ");
		}
		System.out.println("\n종료");
		
//		iter.hasNext();
//		iter.next();
		
	}

}
