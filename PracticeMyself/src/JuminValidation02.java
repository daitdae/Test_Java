import java.util.Scanner;

public class JuminValidation02 {


	public static void main(String[] args) {

		Scanner keyin = new Scanner(System.in);
		String id;

		//민번 입력
		System.out.println("주민등록번호 입력: ");
		id = keyin.next();

		if(!isValid(id)) {
			System.out.println("잘못된주민등록번호 입니다.");
			return;
		}

		if(!isNumeric(id)) {
			System.out.println("잘못된주민등록번호 입니다.");
			return;
		}

		if(!codeCheck(id)) {
			System.out.println("잘못된주민등록번호 입니다.");
			return;
		}

		String g = genderCheck(id);
		String year = birthYear(id);
		String month = id.substring(2, 4);
		String day = id.substring(4, 6);

		System.out.println("올바른 주민번호입니다.");

	}
	
	//길이, -검증
	private static boolean isValid(String id) {
		if(id.length()!=14 || id.charAt(6)!='-') {
			return false;
		}

		char gender = id.charAt(7);
		if(!(gender >= '1' && gender <= '4')) {
			return false;
		}
		return true;

	}


	private static boolean isNumeric(String id) {
		for(int i=0; i<id.length(); ++i) {
			if(i==6) continue;	
			if(!(id.charAt(i) >= '0' && id.charAt(i) <='9')) 
				return false;
		}
		return true;
	}
	//code check
	private static boolean codeCheck(String id) {
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

		if(id.charAt(id.length()-1)-48 !=code)
			return false;	
		return true;
	}

	private static String genderCheck(String id) {
		char gender = id.charAt(7);
		int temp = ((int)gender)-48;

		String g = null;
		if(temp % 2 != 0) {
			g = "남자";
		} else {
			g = "여자";
		}
		return g;
	}
	private static String birthYear(String id) {
		String birthYear = null;

		int temp = 0;
		if(temp == 1 || temp ==2) {
			birthYear = "19" + id.substring(0,2);
		} else {
			birthYear = "20" + id.substring(0,2);
		}

		String birthMonth = null;
		birthMonth =  id.substring(2,4);

		String birthDay = null;
		birthDay = id.substring(4,6);

		return birthYear;
	}
}




