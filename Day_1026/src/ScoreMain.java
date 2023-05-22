/*static에서는 non-static에 접근 불가
접근하려면 무조건 생성하든지
static을 붙이든지 
클래스명.변수명
그냥 무조건 암기 왜라고 생각하지 말고*/

public class ScoreMain {
	String temp1; 					//main에서 접근불가 그러나 밑에서 만들어서 접근 가능
	static String temp2;			//main에서 접근 가능

	public static void main(String[] args) {
		Score s = new Score();		//객체가 생성됨, s 는 reference 변수, 주소값 필요
		s.name = "홍길동";
		s.kor = 98.5;
		s.rank = 1;
		System.out.println(s.name+" : "+s.kor+" , "+s.rank);
		Score.temp = "임시변수";
		ScoreMain.temp2 = "이것도 임시변수"; //앞에 ScoreMain. 빼도 됨 왜냐 위에 있으니깐
		ScoreMain ts = new ScoreMain(); //생성한다 --> 메모리에 올리는 작업
		ts.temp1 = "이것은 임시변수지만 생성했음";
	}

}
