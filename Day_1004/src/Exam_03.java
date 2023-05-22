
public class Exam_03 {

	public static void main(String[] args) {
		/* 실수형변수(double): height (키), weight(적정몸무게) 
		 * 적정몸무게 = (키-100)*0.9 
		 * 키는 cm 값으로 초기화*/
		
		double height = 180;
		double weight = (height-100)*0.9;
						//height-100 에서 promotion이 일어난다 (double-int) ()-*= 연산순서
		System.out.println(weight);
	}
}
