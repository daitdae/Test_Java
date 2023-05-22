
public class Exam_09 {

	public static void main(String[] args) {
		//Exam_09.java
		//정수변수 temp에 임의의 값을 넣어 초기화 하시오.
	    //temp에 들어있는 값이 3의 배수이면서 5의 배수이면 true, 아니면 false가 출력
		
		/*내가 한거
		boolean result;
		int temp = 54;
		
		result = temp % 5 == 0 || 5 + 4 == 0;
		System.out.println(result);*/
		
		int temp = 15;
		boolean result;
		result = temp % 3 ==0 || temp %5 ==0;
		result = temp % 3 ==0 && temp %5 ==0;
		System.out.println("결과는"+result+"입니다.");
		
	}

}
