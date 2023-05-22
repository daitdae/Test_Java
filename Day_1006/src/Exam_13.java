import java.util.Scanner; // ctrl + shift + o 스캐너 먼저 치고

public class Exam_13 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);			//입력받을준비
		
		//int total = 152;				//총 갯수
		//int counterPerPage = 10;		//한페이지에 보일 갯수
		//int totalPage = ? 				//전체페이지는?
						
		int total;	//먼저 선언하고
		final int countPerPage = 10; //int앞에 final 넣으면 이건 안바뀐다는 뜻, 10외에 다른값 안됨
		int totalPage = 0;
		
		//counterPerPage = 14; 값 다시주면 오류남 why? 위에 final 넣었으니깐
		
		System.out.print("총 메일 수 입력:");
		total = keyin.nextInt(); //먼저 선언하고 입력창 나중에 넣는다.
		
		totalPage = total / countPerPage;
		totalPage = (total % countPerPage == 0) ? totalPage : totalPage+1;
		System.out.println("총메일개수 : "+total+" 개, 페이지 : "+totalPage+ "페이지");
		
		/* 선언
		 * 입력
		 * 계산
		 * 출력*/
				


	}

}
