package global.sesoc.structure;

import java.util.ArrayList;

// 배열 복습
public class ArrayTest_01 {
// insert,delete,update, search, selectAll
	public static void main(String[] args) {
		
		String[] str = new String [10];   //방갯수 변경불가
		int count = 0; //데이터의 개수 배열, 안에 넣은 숫자보다 커지면 안됨
		
//		ArrayList<String> list = new ArrayList<>();   ArrayList 기본 문법 Array제거 가능
		//방갯수 설정 안함 갯수 변경 가능, import 해줘야함
		//List<String> list = new ArrayList<>();
		
	  //배열에 삽입
		str[count++] = "사과"; //str[0] = " "; count++; 과 같다 그냥 이걸 한줄로 한거
		str[count++] = "배";
		str[count++] = "복숭아";
		str[count++] = "수박";
		
		//전체 출력
		for(int i=0; i<count; ++i) 
			System.out.print(str[i]+" ");
		
		System.out.println("\n");
		 
		//"배" delete 
		for(int i=0; i<count; ++i) {
			if(str[i].equals("배")) {     			//"배"를 찾는 코드, 내가 찾는 "배" 와 같니?
			   //str[i]=null; null을 때려박아 찾으면 절대 안됨
			   for(int j=i; j<count; ++j) { 		//데이터 땡기는 코드
				 str[j] = str[j+1];  
			   }
			   --count;
			}
		}
		for(int i=0; i<count; ++i) 
			System.out.print(str[i]+" ");
		
		System.out.println("\n"); //배가 날아가서 안보임
		
//		//수정
		for(int j=0; j<count; ++j) {
		if(str[j].equals("수박")) {
				str[j]="멜론";
				break;
			}
		}
		for(int i=0; i<count; ++i) 
			System.out.print(str[i]+" ");
		
		System.out.println("\n");
		
		
//		데이터가 일부만 있을때 사용 불가
//		for(String data : str){
//			System.out.println(data);
//		}

		//list.add("사과");
		
	}

}
