//1-127까지 출력 for문을 가지고 출력 65:A 66:B를 같이 출력하고 싶음 한줄에 다섯개씩
//1~127까지 코드값: 문자를 출력(for문으로) 5개 출력후 줄바꿈
//변수는 두개 줄바꾸는건 ln에 괄호안에 아무것도 없으면 줄바꿈 됨
public class ForTest {

	public static void main(String[] args) {
		int count = 0; //변수선언안함
		//char ch = '%'; 필요없음
		for(int i = 0; i<=127; i++) {
			System.out.print(i+":"+(char)i+"\t");
			++count;
			if(count %5 ==0) System.out.println();
		}

	}


}


