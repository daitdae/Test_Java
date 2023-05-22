/* char 타입의 변수 ch에 임의의 영문자 1개를 저장
 * char ch = 'a'; 대문자면 소문자로, 소문자면 대문자로 변환하여 출력
   차이값 : 32 ch가 ''a'이상이고 'z'이하면 소문자*/
public class Test_02 {

	public static void main(String[] args) {
		
		char ch = 'B';
		
		if(ch >= 'a' && ch <= 'z') {
			System.out.println(ch+"의 대문자 : "+ (char)(ch - 32));
		}
		 else {
			 System.out.println(ch+"의 소문자 : "+ (char)(ch + 32));
		}
		
		
	}

}
