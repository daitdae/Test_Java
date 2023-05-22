
public class SwitchTest_01 {

	public static void main(String[] args) {
		String temp = "father"; //Father
		
		switch(temp) {
		case "father" : 
		case "Father" :								// ctrl+d :한줄 전체삭제
			System.out.println("아버지");			/*아버지에 break안해서
													  밑에 어머니까지 출력됨*/
		case "mother" : 
			System.out.println("어머니"); break;
		case "brother" : 
			System.out.println("남자형제"); break;
		case "sister" : 
			System.out.println("여자형제"); break;
		default :
			System.out.println("이웃");
		}
		System.out.println("종료");

	}

}
