package global.master43.fitness.vo;
//***GymProject_v01
//GymVO.java
//회원번호    		          usrid: int
//회원이름     		          usrname: String
//몸무게     		          weight: double
//키                          height: double
//체질량지수  		          bmi: double 
//결과 (정상, 저체중, 비만)	  result: String
//calcBMI()
//calcResult()

public class GymVO {

	//프라이빗 데이터 입력
	private int usrid;
	private String usrname;
	private double weight;
	private double height;
	private double bmi;
	private String result;

	//기본 생성자 선언
	public GymVO() {}

	//생성자 오버로딩 , result에 result넣으면 안되니깐 if절 안에 넣어놓는다
	//계산해야 하는값 calc로 완전히 따로 빼서 계산한 버전
	public GymVO(int usrid, String usrname, double weight, 
			double height) {
		this.usrid = usrid;
		this.usrname = usrname;
		this.weight = weight;
		this.height = height;
		calcBMI();
		calcResult();
	}
	
	//setter
	public void setUsrid(int usrid) {
		this.usrid = usrid;
	}
	public void setUsrname(String usrname) {
		this.usrname = usrname;
	}
	public void setWeight(double weight) {
		this.weight = weight;
		calcBMI();
		calcResult();
	}
	public void setHeight(double height) {
		this.height = height;
		calcBMI();
		calcResult();
	}
	
	
	//getter
	public int getUsrid() {
		return usrid;
	}
	public String getUsrname() {
		return usrname;
	}
	public double getWeight() {
		return weight;
	}
	public double getHeight() {
		return height;
	}
	public double getBmi() {
		return bmi;
	}
	public String getResult() {
		return result;
	}
	
	//계산 완전히 밑으로 따로빼서
	public void calcBMI() {
		this.bmi = this.weight/((height*0.01)*(height*0.01));
	}
	public void calcResult() {
		if(bmi <= 24) {
			this.result = "저체중입니다";
		} else if(bmi <= 29) {
			this.result = "정상입니다.";
		} else	{
			this.result = "비만입니다.";
		}
	}
	
	
	public void output() {
		System.out.println("회원번호: " +usrid);
		System.out.println("회원이름: " +usrname);
		System.out.println("몸무게: " +weight);
		System.out.println("키: " +height);
		System.out.println("체질량지수: "+bmi);
		System.out.println("결과(정상,저체중,비만): "+result);
		
	}
}
