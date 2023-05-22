/*실수형 변수 3개 선언 (height, weight, bmi)
 *키의 단위(cm), 몸무게(kg)으로 각각 초기화
 *bmi = 몸무게(kg)/키(m)의 제곱
 *bmi를 출력하시오 */
public class Exam_04 {

	public static void main(String[] args) {
		
		/*내가한거
		double height = 177, weight = 87;
		double heightm = height * 0.01;
		double bmi = weight / (heightm * heightm);
		System.out.println(bmi);
		*/
		
		double weight, height, bmi; 
		weight = 87;
		height = 177;
		height = height * 0.01; //변수값을 새로 지정해줌으로써 위에 값 날아감 height가 변환됨
		bmi = weight / (height*height);
		System.out.println(bmi);
		
	}

}
