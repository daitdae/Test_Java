class Person {
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void output() {
		System.out.println("이름: "+this.name);
	}
}
class Student extends Person {
	private int score;
	public void setScore(int score) {
		this.score = score;
	}
	public int getScore() {
		return this.score;
	}
	
	@Override	//override 잘했냐고 확인해 달라는거
	//override는 public void output이 부모와 완전 같아야 한다
	public void output() {
		super.output();//super()에서 괄호빼고 슈퍼로만 부모의 아웃풋 호출하는거
		System.out.println("점수: "+this.score);
	}
	
	@Override
	public String toString() {
//		String temp = super.getName()+", "+ this.score;
//		return temp;
		return super.getName()+", "+ this.score; //위에 두줄을 줄인코드
		
	}
}

public class InheritanceTest_02 {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("홍길동");
		s.setScore(90);
		System.out.println(s);
		System.out.print(s);
		System.out.printf("%s%n", s.toString());
		
//		println은 출력하려는 레퍼런스 변수(괄호안 값)의 객체가
//		toString()을 오버라이딩 했을경우 자동으로 s.toString()으로 전환
//		System.out.println(s.getName()+" "+s.getScore());

	}

}
