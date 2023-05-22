
public class Trainee {
	private int id;
	private String name;
	private double java;
	private double japan;
	private double basic;
	private double avg;
	
	//기본생성자 ==> 무조건 만들어 놓을것!!!! 아무것도 없어도
	public Trainee() {			
//		this.id = 100;
//		this.name = "홍길동";
//		this.java = 89;
//		this.japan = 99;
//		this.basic = 100;
	}
	
	//생성자 오버로딩 (생성을 할때부터 초기값을 넣어놓겠다.) 여러개 가능
	//계산해야 하는값은 선언하면 안된다. 밑에 따로 계산
	public Trainee(int id, String name, double java, double japan, double basic) {
		this.id = id;
		this.name = name;
		this.java = java;	//0.4
		this.japan = japan; //0.3
		this.basic = basic; //0.3
		this.avg = (this.java*0.4)+(this.japan*0.3)+(this.basic*0.3);
		//비율맞춰서 평균구한거임
	}
	
	//setter (한개씩만 받을수 있음)
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setJava(double java) {
		this.java = java;
	}
	public void setJapan(double japan) {
		this.japan = japan;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	//getter
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Double getJava() {
		return java;
	}
	public Double getJapan() {
		return japan;
	}
	public Double getBasic() {
		return basic;
	}
	public Double getAvg() {
		return avg;
	}
	public void output() {
		System.out.println(id+", "+name+", "+java+", "+japan+", "+basic+", "+avg);	
	}
	

}
