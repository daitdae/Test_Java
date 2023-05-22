/*연습문제] Student.java, StudentMain.java 생성하여 테스트하시오
한 학생의 점수를 저장하기 위한 클래스를 생성하시오
클래스명 : Student
멤버변수 : 정수 - 국어, 영어, 수학, 실수 - 평균
멤버메소드 : output() 멤버를 출력*/

public class Student {
	int kor;
	int eng;
	int math;
	double avg;
	
	public void output(){
		System.out.println("국어: "+kor);
		System.out.println("영어: "+eng);
		System.out.println("수학: "+math);
		System.out.println("평균: "+avg);
		
	}
	

}