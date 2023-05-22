
//2) Trainee.java
//public class Trainee {
//    private String name;    // 이름
//    private int it;            // it점수
//    private int japanese;    // 일본어점수
//    private int basic;        // basic 점수
//    private double avg;        // 평균 => IT 40%, 일본어 30%,  베이직 30%
//
//    // 2종류의 생성자를 작성하시오
//   
//    // Setter, Getter 메소드를 작성하시오
//   
//    // 전체 데이터를 출력하는 output()메소드를 작성하시오
//}
public class Trainee {
	
	private String name;	// 이름
	private int it;			// it점수
	private int japanese;	// 일본어점수
	private int basic;		// basic 점수
	private double avg;		// 평균 => IT 40%, 일본어 30%,  베이직 30%
	
	//기본생성자
	public Trainee() {}
	
	//생성자 오버로딩
	public Trainee(String name, int it, int japanese, int basic) {
		this.name = name;
		this.it = it;
		this.japanese = japanese;
		this.basic = basic;
	}
	//세터
		public void setName(String name) {
			this.name = name;
		}
		public void setIt(int it) {
			this.it = it;
		}
		public void setJapanese(int japanese) {
			this.japanese = japanese;
		}
		public void setBasic(int basic) {
			this.basic = basic;
		}
	//게터
		public String getName() {
			return name;
		}
		public int getIt() {
			return it;
		}
		public int getJapanese() {
			return japanese;
		}
		public int getBasic() {
			return basic;
		}
		
		//계산
		public void calcavg() {
			avg = ((it*0.4)+(japanese*0.3)+(basic*0.3))/3;
		}


		//출력
		public void output() {
			System.out.println(name+it+japanese+basic);	
		}
		
	}
