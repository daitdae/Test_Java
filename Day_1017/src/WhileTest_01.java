
public class WhileTest_01 {

	public static void main(String[] args) {

		char ch = 'a';
		while(ch<='z') {
			System.out.print(ch+ " : ");
			++ch;
			int cnt = 0;
			while(cnt < 10) {
				System.out.print(cnt+" ");
				++cnt;
			}
			System.out.println(); //줄변경되서 나옴
		}
	}
}
//a 출력되고 인트 카운트 0으로 내려와서 10전까지 반복하다가 다시위로 올라가서 
//b 출력되고 다시 인트 카운트 들어가서 10전까지 반복됨