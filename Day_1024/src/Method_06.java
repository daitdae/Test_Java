
public class Method_06 {

	public static void main(String[] args) {
		boolean result;
		result = even(2);
		System.out.println(result);
	}
	public static boolean even(int a) { //a <== 2
		return a % 2 == 0 ? true : false;
		//return a % 2 ==0; //최종연산의 결과를 리턴
	}

}
