import java.util.Scanner;

public class JuminValidation {


	public static void main(String[] args) {
		
		Scanner keyin = new Scanner(System.in);
		String id;
		
		//민번 입력
		System.out.println("주민등록번호 입력: ");
		id = keyin.next();
		
		//14자리인지 길이체크
		if(id.length()!=14) { 		//자릿수니깐 그냥 정수
			System.out.println("잘못된주민등록번호 입니다.a");
			return;
		}
		//6번 index에 '-'인지 체크
		if(id.charAt(6) !='-') {	//입력받은문자여서 '',charAt 문자 한개
			System.out.println("잘못된주민등록번호 입니다.b");
			return;
		}
		//'-'를 기준으로 앞뒤에 숫자 Digit인지 확인
		for(int i=0; i<id.length(); ++i) {
			if(i==6) continue;	//6번째 위치는 - 니깐 스킵하기 위해 컨티뉴
			if(!(id.charAt(i) >= '0' && id.charAt(i) <='9')) {
			System.out.println("잘못된주민등록번호 입니다.c");
			return;
			}
		}
		//성별체크
		char gender = id.charAt(7);
		if(!(gender >= '1' && gender <= '4')) {
			System.out.println("잘못된주민등록번호 입니다.d");
			return;
		}
		
		//검증코드를 확인하는 작업
		int temp = 0;
		int weight = 2, total = 0;
		for(int i=0; i<id.length()-1;++i) {
			if(id.charAt(i)=='-') continue;
			temp = ((int)id.charAt(i))-48;
			total += temp*weight;
			++weight;
			if(weight >= 10) weight=2;
		}
		int code = 11 - (total % 11);
		if(code>=10) code = code % 10;
		
		if(id.charAt(id.length()-1)-48 !=code){
			System.out.println("잘못된주민등록번호 입니다.e");
			return;
		}
		
		temp = ((int)gender)-48; //문자 1이 진짜 숫자1이되는 코드
		
		//성별확인
		String g = null;
		if(temp % 2 != 0) {
			g = "남자";
		} else {
			g = "여자";
		}
		
		//몇년도에 태어났는지 확인
		String birthYear = null;
		if(temp == 1 || temp ==2) {
			birthYear = "19" + id.substring(0,2);
		} else {
			birthYear = "20" + id.substring(0,2);
		}
		
		//태어난달을 확인
		String birthMonth = null;
			birthMonth =  id.substring(2,4);
			
		//태어난일을 확인
		String birthDay = null;
			birthDay = id.substring(4,6);
			
		
		
			
	}
		/*//-앞쪽에 있는걸 체크(숫자만 가능하게)
		String data = id.substring(0, 6);
		for(int i=0; i<data.length(); ++i) {
			if(!(data.charAt(i) >= '0' && data.charAt(i) <='9')) {
			System.out.println("잘못된주민등록번호 입니다.");
			return;
			}
		}
		
		//-뒤쪽에 있는걸 체크
		data = id.substring(7);
		for(int i=0; i<data.length(); ++i) {
			if(!(data.charAt(i) >= '0' && data.charAt(i) <='9')) {
			System.out.println("잘못된주민등록번호 입니다.");
			return;
			}
		}*/
	
		
		/*
		if(id.charAt(0) !='0') {	 //0번째가 0이 아닐때 7번째 자리는 1이나 2가 와야한다.
			if(id.charAt(7) !='1'||id.charAt(7)!='2')
				System.out.println("잘못된주민등록번호 입니다.");
			return;
		}
		if(id.charAt(0) =='0') { 		//0번째가 0일때 7번째 자리는 3이나 4가 와야한다.
			if(id.charAt(7) !='3'||id.charAt(7)!='4')
				System.out.println("잘못된주민등록번호 입니다.");
			return;
		}*/
		
		
		
		
		
		

	}




