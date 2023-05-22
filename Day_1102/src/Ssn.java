import java.util.Scanner;

public class Ssn {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String ssn;
		
		//민번 입력
		System.out.println("주민등록번호 입력: ");
		ssn = sc.next();
		
		if(ssn.length()!=14) { //자릿수니깐 그냥 정수
			System.out.println("잘못된주민등록번호 입니다.");
			return;
		}
		if(ssn.charAt(6) !='-') { //입력받은문자여서 ''
			System.out.println("잘못된주민등록번호 입니다.");
			return;
		}
		if(ssn.charAt(0) !='0') { //0번째가 0이 아닐때 7번째 자리는 1이나 2가 와야한다.
			if(ssn.charAt(7) !='1'||ssn.charAt(7)!='2')
				System.out.println("잘못된주민등록번호 입니다.");
			return;
		}
		if(ssn.charAt(0) =='0') { //0번째가 0일때 7번째 자리는 3이나 4가 와야한다.
			if(ssn.charAt(7) !='3'||ssn.charAt(7)!='4')
				System.out.println("잘못된주민등록번호 입니다.");
			return;
		}
		
		
		
		
		
		

	}



}
