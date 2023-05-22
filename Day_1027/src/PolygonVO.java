
public class PolygonVO {
	private int type; //다각형의 종류
	private String name;
	
	//private 멤버변수에 접근을 할수있도록 메소드를 만들어줌 값을대입하거나 값을 가져가거나 만 가능
	//값을 대입하는 메소드 : setter 
		//public void setType(int t)
	//setter는 한개씩만 받아야한다.
	//값을 가져가는 메소드 : getter
		//public int getType()
	
	public void setType(int type) {
		this.type = type;				//지역변수이름과 멤버변수 이름이 같을때는 this 넣어줘야함				
	}
	public void setName(String n) {
		name = n;						//this 생략 가능
	}
	public int getType() {				//()안에 지역변수가 없어서 this 생략 가능
		return type;
	}
	public String getName() {
		return name;
	}
	public void output() {
		System.out.println(type+", "+name);	
	}
}
