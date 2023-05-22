class Ballpen{  //main을 가진애만 public 가능
	double size;  //볼펜 심 굵기
	String color; //볼펜 색깔

	public void output() { 							//우리멤버(this 붙이는데 생략가능)
		System.out.println(size+"mm "+color);
	}
}
public class BallpenMain {

	public static void main(String[] args) { 

		Ballpen black = new Ballpen();
		black.size=0.5;
		black.color="블랙";
		//output(black); 이건 밑에다 아웃풋 넣었을때
		black.output(); //블랙이란애가 아웃풋을 호출했다는 의미

		Ballpen red = new Ballpen();
		red.size=0.7;
		red.color="레드";
		//output(red);
		red.output();


	}
	//public static void output(Ballpen pen) { //변수명 의미 없음
	//	System.out.println(pen.size+"mm "+pen.color);


}

