
public class EscapeTest {

	public static void main(String[] args) {
		String temp = "korea";
		System.out.println(temp);
		System.out.println("\n" +temp);
		System.out.println("\t"+temp);
		System.out.println("\'kim's bakery'");
		System.out.println("자바에서 문자열은\"안에 있어야한다.");
		
		
		//   \r의 코드값은 xx이다
		//   \n의 코드값은 xx이다
		System.out.println("\\r 의 코드값은 "+(int)('\r')+"이다.");
		System.out.println("\\n 의 코드값은 "+(int)'\n'+"이다.");

	}

}
