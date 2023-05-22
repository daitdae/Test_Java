
public class Exam_01 {

	public static void main(String[] args) {
		//정수형변수 3개 (kor, eng, mat) 선언 후 임의의 값으로 초기화
		//실수형변수 2개 : total, avg 
		
		int kor = 97, eng = 68, mat =98;
		double total = kor + eng + mat;
		double avg = (kor+eng+mat) / 3;
		avg = total / 3; //덮어씌워진 개념
	
		// => d / i => d / d 
		// promotion : 데이터타입이 안맞으면 타입을 하나로 맞춰서 계산한다
		
		System.out.println(total);
		System.out.println(avg);
		
		
		
	
	}

}
