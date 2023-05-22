
public class TraineeMain {

	public static void main(String[] args) {
		
		//기본생성자로 세팅
		//기본생성자 ()안에 무언가가 들어간 순간 기본생성자가 아니게 된다
		Trainee t = new Trainee();
		t.output();
		
		//기본값 대신에 필요한 데이터로 치환
//		t.setId(1);
//		t.setName("손오공");
//		t.setJava(89);
//		t.setJapan(94);
//		t.setBasic(100);
//		t.setAvg(0);
		
//		t.output();
		
		//오버로딩으로 세팅
		Trainee t1 = new Trainee(2,"저팔계", 89,60,80);
		t1.output();
		
		
		
		
		
		

	}

}
