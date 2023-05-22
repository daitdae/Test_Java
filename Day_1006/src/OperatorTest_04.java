
public class OperatorTest_04 {

	public static void main(String[] args) {
		// x가 5이상이면 x가 5이상이다. x가 5미만이다.
		
		int x = 5;
		String msg;
		
		msg = 
			(x >= 5) ? "x가 5이상이다.":"x가 5미만이다.";  // ? 와 : 사이에 문장이 들어가면 안됨
		System.out.println(msg);

	}

}
